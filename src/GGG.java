/****************************************************************************************************/
/*                                                                                                  */
/* File: GGG.java                                                                                   */
/* Description: Main GGG window with menus and terminal                                             */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;

public class GGG extends JFrame implements ActionListener, MenuListener {
	
	GGGsh Gsh;
	JTextPane jtp;
	JTextField jta;
	
	public void log(String s){
		s = s + "\n";
		try {
			Document d = jtp.getDocument();
			d.insertString(d.getLength(), s, null);
			jtp.setCaretPosition(d.getLength());
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public GGG(GGGsh Gsh) {
		this.Gsh = Gsh;
		
		//Generate tool bar menus
		String[][] menu = {
			{"Alter", "disk-store", "region", "runtime"},
			{"Close", "durable-client", "durable-cq"},
			{"Compact", "disk-store", "offline-disk-store"},
			{"Create","async-event-queue","defined indexes","disk-store","gateway-receiver","gateway-sender","index","region"},
			{"Describe", "client","config","connection","disk-store","member","offline-disk-store","region"},
			{"Destroy", "disk-store","function","index","region"},
			{"Export", "cluster-configuration","config","data","logs","offline-disk-store","stack-traces"},
			{"Import", "cluster-configuration", "data"},
			{"List", "async-event-queues","clients","deployed","disk-stores","durable-cqs","functions","gateways","indexes","members","regions"},
			{"Show", "dead-locks","log","metrics","missing-disk-stores","subscription-queue-size"},
			{"Start", "gateway-receiver","gateway-sender","jconsole","jvisualvm","locator","pulse","server","vsd"},
			{"Status", "cluster-config-service","gateway-receiver","gateway-sender","locator","server"},
			{"Stop", "gateway-receiver","gateway-sender","locator","server"},
			{"Other commands", "backup disk-store","change loglevel","clear defined indexes","configure pdx","connect","debug","define index","deploy","disconnect","echo","encrypt password","execute function","exit","gc","get","help","hint","history","load-balance gateway-sender","locate entry","netstat","pause gateway-sender","pdx rename","put","query","rebalance","remove","resume gateway-sender","revoke missing-disk-store","run","set variable","sh","shutdown","sleep","undeploy","upgrade offline-disk-store","validate offline-disk-store","version"}
		};
		JMenuBar jmb = new JMenuBar();
		JMenu[] jmTM = new JMenu[menu.length];
		for(int i=0; i<menu.length; i++){
			jmTM[i] = new JMenu(menu[i][0]);
			jmTM[i].addMenuListener(this);
			jmb.add(jmTM[i]);
			JMenuItem jmi[] = new JMenuItem[menu[i].length];
			for(int j=0; j<menu[i].length-1; j++){
				jmi[j] = new JMenuItem(menu[i][j+1]);
				jmi[j].addActionListener(this);
				String searchTip = menu[i][0].toLowerCase() + " " + menu[i][j+1];
				for(String[] s: ToolTips.text){
					if(s[0].equals(searchTip)){
						jmi[j].setToolTipText(s[1]);
					} else if(s[0].equals(menu[i][j+1])) {
						jmi[j].setToolTipText(s[1]);
					}
				}
				jmTM[i].add(jmi[j]);
			}
		}
		setJMenuBar(jmb);
		
		setLayout(new BorderLayout());
		
		//Add terminal
		JComponent panel = new JPanel(false);
		panel.setLayout(new GridLayout(1,1));
			jtp = new JTextPane();
			jtp.setBackground(Color.BLACK);
			jtp.setForeground(Color.WHITE);
			jtp.setEditable(false);
			jtp.setFont(new Font("monospaced", Font.PLAIN, 12));
				JScrollPane jsp = new JScrollPane(jtp, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			panel.add(jsp);
		add(panel, BorderLayout.CENTER);
		jta = new JTextField();
		jta.setBackground(Color.BLACK);
		jta.setForeground(Color.WHITE);
		jta.setFont(new Font("monospaced", Font.PLAIN, 12));
		jta.setText("gfsh>");
		jta.addActionListener(this);
		add(jta, BorderLayout.PAGE_END);
		
		//Show window
		setSize(800,600);
		setLocation(100,100);
		setTitle("GGG - GemFire / Geode GUI");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	
	String mainMenuSelected = "";
	public void menuCanceled(MenuEvent e){
		mainMenuSelected = "";
	}
	public void menuDeselected(MenuEvent e){}
	public void menuSelected(MenuEvent e){
		mainMenuSelected = e.getSource().toString().split("text=")[1];
		mainMenuSelected = mainMenuSelected.replace("]","");
	}
	
	public void actionPerformed(java.awt.event.ActionEvent ae){
		if(ae.getActionCommand().startsWith("gfsh>")){
			Gsh.SendCommand(ae.getActionCommand().replace("gfsh>", ""));
			jta.setText("gfsh>");
			return;
		}
		String con = "";
		if(mainMenuSelected.equals("Other commands")){
			con = ae.getActionCommand().replace("-","");
		} else {
			con = mainMenuSelected +" "+ ae.getActionCommand().replace("-","");
		}
		String cl = "";
		for(String s: con.split(" ")){
			cl += s.substring(0, 1).toUpperCase() + s.substring(1);
		}
		try {
			Class c = Class.forName(cl);
			java.lang.reflect.Constructor constructor = c.getConstructor(new Class[]{});
			Command com = (Command)constructor.newInstance(new Object[]{});
			com.setup(Gsh);
			if(com.name==null){
				JOptionPane.showMessageDialog(null, "Command \'"+con+"\' is not supported yet");
			} else {
				com.showWindow();
			}
		} catch(Exception e){
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Command \'"+con+"\' is not supported yet");
		}
	}
	
	public static void main(String args[]){
		GGG A = new GGG(null);
	}
}