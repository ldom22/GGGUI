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

public class GGG extends JFrame implements ActionListener {
	
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
			{"Clients", "close durable-client", "describe client", "list clients", "close durable-cq", "list durable-cqs"},
			{"Config", "describe config", "export config", "status cluster-config-service", "export cluster-configuration", "import cluster-configuration"},
			{"Data", "export data", "import data", "put", "query", "remove", "locate entry", "get"},
			{"Disk stores", "alter disk-store", "backup disk-store", "compact disk-store", "compact offline-disk-store", "create disk-store", "describe disk-store", "describe offline-disk-store", "destroy disk-store", "export offline-disk-store", "list disk-stores", "revoke missing-disk-store", "show missing-disk-stores", "upgrade offline-disk-store", "validate offline-disk-store"},
			{"Functions", "destroy function", "execute function", "list functions"},
			{"Gateways", "create gateway-receiver", "create gateway-sender", "list gateways", "load-balance gateway-sender", "pause gateway-sender", "resume gateway-sender", "start gateway-receiver", "start gateway-sender", "status gateway-receiver", "status gateway-sender", "stop gateway-receiver", "stop gateway-sender"},
			{"Indexes", "clear defined indexes", "create defined indexes", "destroy index", "create index", "define index", "list indexes"},
			{"Log & Debug", "change loglevel", "export logs", "show log", "debug", "export stack-traces", "echo", "set variable"},
			{"Maintenance", "alter runtime", "deploy", "undeploy", "list deployed", "gc", "encrypt password", "netstat", "show dead-locks", "show metrics", "shutdown", "configure pdx", "pdx rename", "rebalance"},
			{"Queues", "create async-event-queue", "show subscription-queue-size", "list async-event-queues"},
			{"Regions", "alter region", "create region", "describe region", "destroy region", "list regions"},
			{"Servers", "start locator", "start server", "status locator", "status server", "stop locator", "stop server", "describe member", "list members"},
			{"Other", "run", "sh", "sleep", "start jconsole", "start jvisualvm", "start pulse", "start vsd", "connect", "disconnect", "describe connection", "exit", "help", "hint", "history", "version"},
		};
		JMenuBar jmb = new JMenuBar();
		JMenu[] jmTM = new JMenu[menu.length];
		for(int i=0; i<menu.length; i++){
			jmTM[i] = new JMenu(menu[i][0]);
			jmb.add(jmTM[i]);
			JMenuItem jmi[] = new JMenuItem[menu[i].length];
			for(int j=0; j<menu[i].length-1; j++){
				jmi[j] = new JMenuItem(menu[i][j+1]);
				jmi[j].addActionListener(this);
				String searchTip = menu[i][j+1];
				for(String[] s: ToolTips.text){
					if(s[0].equals(searchTip)){
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
	
	public void actionPerformed(java.awt.event.ActionEvent ae){
		if(ae.getActionCommand().startsWith("gfsh>")){
			Gsh.SendCommand(ae.getActionCommand().replace("gfsh>", ""));
			jta.setText("gfsh>");
			return;
		}
		String con = ae.getActionCommand().replace("-","");
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