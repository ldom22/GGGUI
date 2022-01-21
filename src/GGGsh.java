/****************************************************************************************************/
/*                                                                                                  */
/* File: GGGsh.java                                                                                 */
/* Description: GFSH interface implemented using JCRAFT JSCH                                        */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

import javax.swing.*;
import javax.swing.table.*;
import com.jcraft.jsch.*;
import java.io.*;

public class GGGsh {
	
	boolean connected = false;
	GGG ggg;
	
	String[] prefill_member, prefill_region, prefill_diskstore, prefill_function;
	
	public void close(){
		try {
			SendCommand("exit");
			SendCommand("exit");
			bw.close();
			os.close();
			is.close();
			channel.disconnect();
			session.disconnect();
			fos.flush();
			fos.close();
			connected = false;
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public String SendCommandAndWaitForGFSH(String command){
		String result = "";
		try {
			bw.write(command + "\n");
			bw.flush();
			while(result.lastIndexOf("gfsh>")<10){
				Thread.sleep(1000);
				result = fos.toString();
			}
			fos.reset();
			result = result.replaceAll("[^\\x00-\\x7F]", "");
			ggg.log(result);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public String SendCommand(String command){
		String result = "";
		try {
			bw.write(command + "\n");
			bw.flush();
			while(result==null || result.equals("")){
				Thread.sleep(1000);
				result = fos.toString();
			}
			fos.reset();
			result = result.replaceAll("[^\\x00-\\x7F]", "");
			ggg.log(result);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	BufferedWriter bw = null;
	OutputStream os = null;
	InputStream is = null;
	Channel channel = null;
	Session session = null;
	ByteArrayOutputStream fos = null;

	public GGGsh(String user, String host, String pswd, String port, String gfsh_path, String locatorIP, String locatorPort, String c1, String c2, String c3, String c4){
		Loader l = new Loader("Connecting...");
		JSch jsch=new JSch();
		
		try {
			session = jsch.getSession(user, host, Integer.parseInt(port));
			if(pswd!=null){
				session.setPassword(pswd);
			}
			session.setConfig("StrictHostKeyChecking", "no");
			session.setConfig("PreferredAuthentications", "publickey,keyboard-interactive,password");
			session.connect(30000);
			channel=session.openChannel("shell");
			os = channel.getOutputStream();
			is = channel.getInputStream();
			
			fos = new ByteArrayOutputStream(65536);
			
			channel.setOutputStream(fos);
			channel.setInputStream(is);
			
			bw = new BufferedWriter(new OutputStreamWriter(os));
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			channel.connect(3*1000);
			
			Thread.sleep(7000);
			connected = true;
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Error connecting to host");
			e.printStackTrace();
			return;
		}
		
		ggg = new GGG(this);
		
		//custom commands after login
		if(c1!=null && !c1.equals("") && !c1.equals(" ")){SendCommand(c1);}
		if(c2!=null && !c2.equals("") && !c2.equals(" ")){SendCommand(c1);}
		if(c3!=null && !c3.equals("") && !c3.equals(" ")){SendCommand(c1);}
		if(c4!=null && !c4.equals("") && !c4.equals(" ")){SendCommand(c1);}
		
		//run GFSH
		SendCommand("cd "+gfsh_path);
		SendCommand("gfsh");
		SendCommand("connect --locator="+locatorIP+"["+locatorPort+"]");
		
		//add check for gfsh
		
		//get prefill command options for members
		Command c = new Command();
		DefaultTableModel dtm = c.getTableData(SendCommandAndWaitForGFSH("list members"));
		while(dtm.getRowCount()==0){
			try {Thread.sleep(100);} catch (Exception e){e.printStackTrace();}
			dtm = c.getTableData(fos.toString());
		}
		fos.reset();
		prefill_member = new String[dtm.getRowCount()];
		for(int i=0; i<dtm.getRowCount(); i++){
			prefill_member[i] = (String)dtm.getValueAt(i,0);
		}

		//get prefill command options for regions
		c = new Command();
		dtm = new DefaultTableModel();
		dtm = c.getTableData(SendCommandAndWaitForGFSH("list regions"));
		while(dtm.getRowCount()==0){
			try {Thread.sleep(100);} catch (Exception e){e.printStackTrace();}
			dtm = c.getTableData(fos.toString());
		}
		fos.reset();
		prefill_region = new String[dtm.getRowCount()];
		for(int i=0; i<dtm.getRowCount(); i++){
			prefill_region[i] = (String)dtm.getValueAt(i,0);
		}
		
		//list disk stores
		c = new Command();
		dtm = new DefaultTableModel();
		dtm = c.getTableData(SendCommandAndWaitForGFSH("list disk-stores"));
		while(dtm.getRowCount()==0){
			try {Thread.sleep(100);} catch (Exception e){e.printStackTrace();}
			dtm = c.getTableData(fos.toString());
		}
		fos.reset();
		prefill_diskstore = new String[dtm.getRowCount()];
		for(int i=0; i<dtm.getRowCount(); i++){
			prefill_diskstore[i] = (String)dtm.getValueAt(i,2);
		}
		
		//list functions
		c = new Command();
		dtm = new DefaultTableModel();
		dtm = c.getTableData(SendCommandAndWaitForGFSH("list functions"));
		while(dtm.getRowCount()==0){
			try {Thread.sleep(100);} catch (Exception e){e.printStackTrace();}
			dtm = c.getTableData(fos.toString());
		}
		fos.reset();
		prefill_function = new String[dtm.getRowCount()];
		for(int i=0; i<dtm.getRowCount(); i++){
			prefill_function[i] = (String)dtm.getValueAt(i,1);
		}
		
		l.end();
	}
}