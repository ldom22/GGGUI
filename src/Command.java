/****************************************************************************************************/
/*                                                                                                  */
/* File: Command.java                                                                               */
/* Description: Generic command class with window interface                                         */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class Command extends JFrame implements ActionListener {
	
	String name;
	String description;
	Parameter[] parameters;
	GGGsh Gsh;
	
	ArrayList<JTextField> jtfs;
	ArrayList<JComboBox> jcbs;
		
	public Command(){
		name = null;
		description = null;
		parameters = null;
		Object[][] resultRows = null;
	}
	
	public void setup(GGGsh Gsh){
		this.Gsh = Gsh;
		
		int height = 1;
		if(parameters!=null){
			height = parameters.length;
		}
		JPanel main = new JPanel();
		main.setLayout(new GridLayout((height*2)+2,1));
		main.add(new JLabel(description, SwingConstants.CENTER));
		
		jtfs = new ArrayList<JTextField>();
		jcbs = new ArrayList<JComboBox>();
		if(parameters!=null){
			for(Parameter p: parameters){
				if(p.required==false){
					p.description = p.description+" (optional):";
				} else {
					p.description = p.description+" (required):";
				}
				if(p.description.length()>100){
					//TODO handle length p.description = "<html>"+p.description+"</html>";
				}
				main.add(new JLabel(p.description));
				
				JPanel jp = new JPanel();
				jp.setLayout(new GridLayout(1,2));
				jp.add(new JLabel(p.name+":", SwingConstants.RIGHT));
				
				//prefill options for some of the parameters
				if(p.name.equals("member")){
					p.options = new String[Gsh.prefill_member.length];
					for(int i=0; i< Gsh.prefill_member.length; i++){
						p.options[i] = Gsh.prefill_member[i];
					}
				} else if(p.name.equals("region")){
					p.options = new String[Gsh.prefill_region.length];
					for(int i=0; i< Gsh.prefill_region.length; i++){
						p.options[i] = Gsh.prefill_region[i];
					}
				} else if(name.contains("member")){
					if(p.name.equals("name")){
						p.options = new String[Gsh.prefill_member.length];
						for(int i=0; i< Gsh.prefill_member.length; i++){
							p.options[i] = Gsh.prefill_member[i];
						}
					}
				} else if(name.contains("region")){
					if(p.name.equals("name")){
						p.options = new String[Gsh.prefill_region.length];
						for(int i=0; i< Gsh.prefill_region.length; i++){
							p.options[i] = Gsh.prefill_region[i];
						}
					}
				} else if(name.contains("function")){
					if(p.name.equals("id")){
						p.options = new String[Gsh.prefill_function.length];
						for(int i=0; i< Gsh.prefill_function.length; i++){
							p.options[i] = Gsh.prefill_function[i];
						}
					}
				} else if(name.contains("disk-store")){
					if(p.name.equals("name")){
						p.options = new String[Gsh.prefill_diskstore.length];
						for(int i=0; i< Gsh.prefill_diskstore.length; i++){
							p.options[i] = Gsh.prefill_diskstore[i];
						}
					}
				}
				
				if(p.options==null){
					JTextField jtf = new JTextField();
					jtfs.add(jtf);
					jp.add(jtf);
				} else {
					JComboBox jcb = new JComboBox();
					if(p.required==false){
						jcb.addItem("");
					}
					for(String s: p.options){
						jcb.addItem(s);
					}
					jcbs.add(jcb);
					jp.add(jcb);
				}
				main.add(jp);
			}
		}
		JButton jb_run = new JButton("Run command");
		jb_run.addActionListener(this);
		main.add(jb_run);
		if(height<10){
			add(main);
		} else {
			JScrollPane jsp = new JScrollPane(main,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			add(jsp);
		}
	}
	
	public void showWindow(){
		if(parameters!=null){
			int height = 1;
			height = parameters.length;
			if(height>10){
				height = 10;
			}
		
			setSize(600,60*(height+2));
			setLocation(200,200);
			setTitle(name);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			setVisible(true);
		} else {
			String result = Gsh.SendCommand(name);
			if(result.split("\n").length<=4){
				JOptionPane.showMessageDialog(null, result);
			} else {
				new TableResultWindow(name, getTableData(result));
			}
		}
	}
	
	public void actionPerformed(java.awt.event.ActionEvent ae){
		String command = name + " ";
		int i=0;
		int j=0;
		if(parameters!=null){
			for(Parameter p: parameters){
				if(p.options==null){ 
					String userText = jtfs.get(i).getText();
					i++;
					if(userText.length()>0){
						command += "--" + p.name + "='" + userText + "' ";
					} else if(p.required==true){
						JOptionPane.showMessageDialog(null, "Error: Required parameter \'"+p.name+"\' is empty");
						return;
					}
				} else {
					if(!jcbs.get(j).getSelectedItem().toString().equals("")){
						command += "--" + p.name + "='" + jcbs.get(j).getSelectedItem().toString() + "' ";
					}
					j++;
				}
			}
		}
		String result = Gsh.SendCommand(command);
		setVisible(false);
		if(result.split("\n").length<=4){
			JOptionPane.showMessageDialog(null, result);
		} else {
			new TableResultWindow(name, getTableData(result));
		}
		dispose();
	}
	
	public DefaultTableModel getTableData(String s){
		DefaultTableModel dtm = new DefaultTableModel();
		String[] rows = s.split("\n");
		boolean found = false;
		int k=0;
		for(int i=0; i<rows.length; i++){
			if(found){
				String[] separated = rows[i].split("\\|");
				Object[] obj = new Object[separated.length];
				for(int j=0; j<separated.length; j++){
					obj[j] = separated[j].trim();
				}
				if(!rows[i].contains("33mgfsh")){
					dtm.insertRow(k, obj);
					k++;
				}
			}
			if(rows[i].contains("----") && !found){
				found = true;
				String[] columns = rows[i-1].split("\\|");
				for(String column: columns){
					dtm.addColumn(column.trim());
				}
			}
		}
		return dtm;
	}
}