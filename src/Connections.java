/****************************************************************************************************/
/*                                                                                                  */
/* File: Connections.java                                                                           */
/* Description: Connection list management window                                                   */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class Connections extends JFrame implements ActionListener, ListSelectionListener {
	
	JTextField[] jtf_array;
	JList jl;
	DefaultListModel dlm;
	
	ArrayList<String[]> listOfSavedConnections = new ArrayList<String[]>();
	
	public void loadConnectionList(){
		try {
			BufferedReader br = new BufferedReader(new FileReader("connections.txt"));
			String input = br.readLine();
			while(input!=null){
				String[] inputa = input.split("@@@@");
				listOfSavedConnections.add(inputa);
				dlm.addElement(inputa[0]);
				input = br.readLine();
			}
			br.close();
		} catch(Exception e){
			//JOptionPane.showMessageDialog(null, "File error occurred while loading saved connections");
		}
	}
	
	public void saveConnectionList(){
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("connections.txt"));
			for(String[] s: listOfSavedConnections){
				String line = "";
				for(String st: s){
					if(st.equals("")){
						line += " " + "@@@@";
					} else {
						line += st + "@@@@";
					}
				}
				bw.write(line+"\n");
			}
			bw.close();
		} catch(Exception e){
			JOptionPane.showMessageDialog(null, "File error occurred while saving list of connections");
		}
	}
	
	public void setSavedFields(String input){
		for(String[] s: listOfSavedConnections){
			if(s[0].equals(input)){
				for(int i=0; i<jtf_array.length; i++){
					jtf_array[i].setText(s[i]);
				}
				return;
			}
		}
	}
	
	public Connections(){
		try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch(Exception e){
            System.out.println(e);
        }
		
		setLayout(new GridLayout(1,2));
		dlm = new DefaultListModel();
		loadConnectionList();
		
		JPanel list = new JPanel();
			list.setLayout(new BorderLayout());
			list.add(new JLabel("Saved connections:"), BorderLayout.PAGE_START);
			jl = new JList();
			jl.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			jl.setLayoutOrientation(JList.VERTICAL);
			jl.setVisibleRowCount(-1);
			jl.addListSelectionListener(this);
			jl.setModel(dlm);
			JScrollPane jsplist = new JScrollPane(jl, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			list.add(jsplist, BorderLayout.CENTER);
			JPanel jpbtns = new JPanel();
				jpbtns.setLayout(new GridLayout(1,2));
				JButton jbadd = new JButton("Save");
				JButton jbrem = new JButton("Delete");
				jbadd.addActionListener(this);
				jbrem.addActionListener(this);
				jpbtns.add(jbadd);
				jpbtns.add(jbrem);
			list.add(jpbtns, BorderLayout.PAGE_END);
		add(list);
		
		jtf_array = new JTextField[12];
		
		JPanel settings = new JPanel();
		settings.setLayout(new GridLayout(14,1));
			JPanel jpname = new JPanel();
				jpname.setLayout(new GridLayout(1,2));
				jpname.add(new JLabel("Connection alias:"));
				jtf_array[0] = new JTextField();
				jpname.add(jtf_array[0]);
			settings.add(jpname);
			JPanel jp1 = new JPanel();
				jp1.setLayout(new GridLayout(1,2));
				jp1.add(new JLabel("User name:", SwingConstants.RIGHT));
				jtf_array[1] = new JTextField();
				jp1.add(jtf_array[1]);
			settings.add(jp1);
			JPanel jp2 = new JPanel();
				jp2.setLayout(new GridLayout(1,2));
				jp2.add(new JLabel("Host name (or IP):", SwingConstants.RIGHT));
				jtf_array[2] = new JTextField();
				jp2.add(jtf_array[2]);
			settings.add(jp2);
			JPanel jp8 = new JPanel();
				jp8.setLayout(new GridLayout(1,2));
				jp8.add(new JLabel("Password:", SwingConstants.RIGHT));
				jtf_array[3] = new JPasswordField();
				jp8.add(jtf_array[3]);
			settings.add(jp8);
			JPanel jp3 = new JPanel();
				jp3.setLayout(new GridLayout(1,2));
				jp3.add(new JLabel("Port:", SwingConstants.RIGHT));
				jtf_array[4] = new JTextField();
				jtf_array[4].setText("22");
				jp3.add(jtf_array[4]);
			settings.add(jp3);
			settings.add(new JLabel("Add up to 4 commands to execute after log in:"));
			for(int i=8; i<12; i++){
				jtf_array[i] = new JTextField();
				settings.add(jtf_array[i]);
			}
			JPanel jp4 = new JPanel();
				jp4.setLayout(new GridLayout(1,2));
				jp4.add(new JLabel("GFSH path:", SwingConstants.RIGHT));
				jtf_array[5] = new JTextField();
				jtf_array[5].setText("$GEMFIRE_HOME/bin");
				jp4.add(jtf_array[5]);
			settings.add(jp4);
			JPanel jp6 = new JPanel();
				jp6.setLayout(new GridLayout(1,2));
				jp6.add(new JLabel("Locator IP:", SwingConstants.RIGHT));
				jtf_array[6] = new JTextField();
				jp6.add(jtf_array[6]);
			settings.add(jp6);
			JPanel jp7 = new JPanel();
				jp7.setLayout(new GridLayout(1,2));
				jp7.add(new JLabel("Locator port:", SwingConstants.RIGHT));
				jtf_array[7] = new JTextField();
				jp7.add(jtf_array[7]);
			settings.add(jp7);
			JButton jb = new JButton("Connect");
			jb.addActionListener(this);
			settings.add(jb);
		add(settings);
		
		pack();
		setSize(348*2,327);
		setLocation(300,300);
		setTitle("GGG - GemFire / Geode GUI 1.0");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String args[]){
		new Connections();
	}
	
	public void actionPerformed(java.awt.event.ActionEvent ae){
		if(ae.getActionCommand().equals("Connect")){
			new GGGsh(jtf_array[1].getText(), jtf_array[2].getText(), jtf_array[3].getText(), jtf_array[4].getText(), jtf_array[5].getText(), jtf_array[6].getText(), jtf_array[7].getText(), jtf_array[8].getText(), jtf_array[9].getText(), jtf_array[10].getText(), jtf_array[11].getText(), jtf_array[0].getText());
		} else if(ae.getActionCommand().equals("Save")){
			dlm.addElement(jtf_array[0].getText());
			jl.setModel(dlm);
			String[] con = new String[12];
			for(int i=0; i<12; i++){
				con[i] = jtf_array[i].getText();
			}
			listOfSavedConnections.add(con);
			saveConnectionList();
		} else if(ae.getActionCommand().equals("Delete")){
			listOfSavedConnections.remove(jl.getSelectedIndex());
			dlm.remove(jl.getSelectedIndex());
			saveConnectionList();
			for(JTextField jtf: jtf_array){
				jtf.setText("");
			}
		}
	}
	
	public void valueChanged(ListSelectionEvent e){
		setSavedFields((String)jl.getSelectedValue());
	}
}