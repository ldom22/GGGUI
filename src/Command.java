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
import javax.swing.event.*;
import java.awt.datatransfer.StringSelection;

class QHListener implements ItemListener {
	Command c;
	public QHListener(Command c){
		this.c = c;
	}
	public void itemStateChanged(ItemEvent e){
		String com = c.generateCommand();
		int usehelp = 0;
		for(JComboBox jc: c.jcbs_q){
			if(jc.getSelectedItem().toString().equals("")){
				usehelp++;
			}
		}
		if(usehelp<c.jcbs_q.size()){
			c.jtfs.get(0).setText("");
			String res = "";
			for(JComboBox jc: c.jcbs_q){
				res += jc.getSelectedItem().toString() + " ";
			}
			System.out.println(res);
			c.jtfs.get(0).setText(res);
		}
	}
}

public class Command extends JFrame implements ActionListener, DocumentListener, ItemListener {
	
	String name;
	String description;
	String fullcommand;
	Parameter[] parameters;
	GGGsh Gsh;
	JButton jb_run;
	boolean queryHelperAdded;
	GGG offlineModeGui;
	
	ArrayList<JTextField> jtfs;
	ArrayList<JComboBox> jcbs;
	ArrayList<JComboBox> jcbs_q;
		
	public Command(){
		name = null;
		description = null;
		parameters = null;
		Object[][] resultRows = null;
		queryHelperAdded = false;
	}
	
	public void offlineMode(GGG offlineModeGui){
		this.offlineModeGui = offlineModeGui;
	}
	
	public void setup(GGGsh Gsh){
		this.Gsh = Gsh;
		
		int height = 1;
		if(parameters!=null){
			height = parameters.length;
			if(name.equals("query")){
				height++;
			}
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
					String result = "<html>";
					String[] arr = p.description.split(" ");
					String line = "";
					for(String w: arr){
						result += w+" ";
						line += w+" ";
						if(line.length()>100){
							line = "";
							result += "<br>";
						}
					}
					result += "</html>";
					p.description = result;
				}
				main.add(new JLabel(p.description));
				
				JPanel jp = new JPanel();
				jp.setLayout(new GridLayout(1,2));
				jp.add(new JLabel(p.name+":", SwingConstants.RIGHT));
				
				//prefill options for some of the parameters
				if(Gsh!=null){
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
					} else if(name.equals("destroy index ")){
						if(p.name.equals("name")){
							p.options = new String[Gsh.prefill_index.length];
							for(int i=0; i< Gsh.prefill_index.length; i++){
								p.options[i] = Gsh.prefill_index[i];
							}
						}
					} else if(p.name.equals("include-region") || p.name.equals("exclude-region") || p.name.equals("template-region")){
						p.options = new String[Gsh.prefill_region.length];
						for(int i=0; i< Gsh.prefill_region.length; i++){
							p.options[i] = Gsh.prefill_region[i];
						}
					} else if(name.contains("region") && !name.equals("create region")){
						if(p.name.equals("name")){
							p.options = new String[Gsh.prefill_region.length];
							for(int i=0; i< Gsh.prefill_region.length; i++){
								p.options[i] = Gsh.prefill_region[i];
							}
						}
					}
				}
				
				if(p.options==null){
					JTextField jtf = new JTextField();
					jtf.getDocument().addDocumentListener(this);
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
					jcb.addItemListener(this);
					jcbs.add(jcb);
					jp.add(jcb);
				}
				main.add(jp);
				
				//query helper
				QHListener qhl = new QHListener(this);
				if(name.equals("query") && queryHelperAdded==false){
					queryHelperAdded = true;
					jcbs_q = new ArrayList<JComboBox>();
					JPanel jph = new JPanel();
					jph.setLayout(new GridLayout(1,7));
						JComboBox jcb1 = new JComboBox();
							jcb1.addItem("");
							jcb1.addItem("SELECT");
							jcb1.addItemListener(qhl);
							jcbs_q.add(jcb1);
						jph.add(jcb1);
						JComboBox jcb2 = new JComboBox();
							jcb2.addItem("");
							jcb2.addItem("DISTINCT");
							jcb2.addItemListener(qhl);
							jcbs_q.add(jcb2);
						jph.add(jcb2);
						JComboBox jcb3 = new JComboBox();
							jcb3.addItem("");
							jcb3.addItem("*");
							jcb3.addItem("entry.key");
							jcb3.addItem("entry.value");
							jcb3.addItem("entry.value.toString");
							jcb3.addItem("COUNT(*)");
							jcb3.addItem("MIN(x)");
							jcb3.addItem("MAX(x)");
							jcb3.addItem("AVG(x)");
							jcb3.addItem("SUM(x)");
							jcb3.addItemListener(qhl);
							jcbs_q.add(jcb3);
						jph.add(jcb3);
						if(Gsh!=null){
							JComboBox jcb4 = new JComboBox();
							for(int i=0; i< Gsh.prefill_region.length; i++){
								jcb4.addItem("FROM /" + Gsh.prefill_region[i] + ".entrySet entry ");
							}
							jcb4.addItemListener(qhl);
							jcbs_q.add(jcb4);
							jph.add(jcb4);
						} else {
							JComboBox jcb4 = new JComboBox();
							jcb4.addItem("");
							jcb4.addItem("FROM /REGION.entrySet entry ");
							jcb4.addItemListener(qhl);
							jcbs_q.add(jcb4);
							jph.add(jcb4);
						}
						JComboBox jcb5 = new JComboBox();
							jcb5.addItem("");
							jcb5.addItem("WHERE x");
							jcb5.addItem("WHERE x LIMIT x");
							jcb5.addItem("LIMIT x");
							jcb5.addItemListener(qhl);
							jcbs_q.add(jcb5);
						jph.add(jcb5);
					main.add(jph);
				}
			}
		}
		
		if(Gsh!=null){
			jb_run = new JButton("Run '"+generateCommand()+"'");
		} else {
			jb_run = new JButton("Copy '"+generateCommand()+"'");
		}
		
		if(name.contains("close") || name.contains("import") || name.contains("remove") || name.contains("alter") || name.contains("destroy") || name.contains("pause") || name.contains("stop") || name.contains("clear")){
			jb_run.setBackground(Color.RED);
			jb_run.setForeground(Color.RED);
			jb_run.setOpaque(true);
		}
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
			if(name.equals("query")){
				setSize(1040,60*(height+2));
			} else {
				setSize(600,60*(height+2));
			}
			setLocation(200,200);
			setTitle(name);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			setVisible(true);
		} else {
			if(Gsh!=null){
				String result = Gsh.SendCommand(name);
				if(result.split("\n").length<=4){
					JOptionPane.showMessageDialog(null, result);
				} else {
					DefaultTableModel dtm = getTableData(result);
					if(dtm.getRowCount()>0){
						new TableResultWindow(Gsh.nameOfConnection.split(" ")[0] + " " + name, dtm);
					}
				}
			} else {
				JOptionPane.showMessageDialog(null, "This command does not have any parameters");
			}
		}
	}
	
	public String generateCommand(){
		String fullcommand = name + " ";
		int i=0;
		int j=0;
		
		if(parameters!=null){
			for(Parameter p: parameters){
				if(p.options==null){ 
					String userText = jtfs.get(i).getText();
					i++;
					if(userText.length()>0){
						fullcommand += "--" + p.name + "='" + userText + "' ";
					}
				} else {
					if(!jcbs.get(j).getSelectedItem().toString().equals("")){
						fullcommand += "--" + p.name + "='" + jcbs.get(j).getSelectedItem().toString() + "' ";
					}
					j++;
				}
			}
		}
		return fullcommand;
	}
	
	public void actionPerformed(java.awt.event.ActionEvent ae){
		String fullcommand = name + " ";
		int i=0;
		int j=0;
		if(parameters!=null){
			for(Parameter p: parameters){
				if(p.options==null){ 
					String userText = jtfs.get(i).getText();
					i++;
					if(userText.length()>0){
						fullcommand += "--" + p.name + "='" + userText + "' ";
					} else if(p.required==true){
						JOptionPane.showMessageDialog(null, "Error: Required parameter \'"+p.name+"\' is empty");
						return;
					}
				} else {
					if(!jcbs.get(j).getSelectedItem().toString().equals("")){
						fullcommand += "--" + p.name + "='" + jcbs.get(j).getSelectedItem().toString() + "' ";
					}
					j++;
				}
			}
		}
		if(Gsh!=null){
			String result = Gsh.SendCommand(fullcommand);
			setVisible(false);
			if(result.split("\n").length<=4){
				JOptionPane.showMessageDialog(null, result);
			} else {
				DefaultTableModel dtm = getTableData(result);
				if(dtm.getRowCount()>0){
					new TableResultWindow(Gsh.nameOfConnection.split(" ")[0] + " " + name, dtm);
				}
			}
		} else {
			offlineModeGui.log(fullcommand+" \n");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(fullcommand),null);
		}
		dispose();
	}
	
	public void changedUpdate(DocumentEvent e){
		if(Gsh!=null){
			jb_run.setText("Run '"+generateCommand()+"'");
		} else {
			jb_run.setText("Copy '"+generateCommand()+"'");
		}
		jb_run.revalidate();
		jb_run.repaint();
	}
	public void removeUpdate(DocumentEvent e){
		if(Gsh!=null){
			jb_run.setText("Run '"+generateCommand()+"'");
		} else {
			jb_run.setText("Copy '"+generateCommand()+"'");
		}
		jb_run.revalidate();
		jb_run.repaint();
	}
	public void insertUpdate(DocumentEvent e){
		if(Gsh!=null){
			jb_run.setText("Run '"+generateCommand()+"'");
		} else {
			jb_run.setText("Copy '"+generateCommand()+"'");
		}
		jb_run.revalidate();
		jb_run.repaint();
	}
	public void itemStateChanged(ItemEvent e){
		if(Gsh!=null){
			jb_run.setText("Run '"+generateCommand()+"'");
		} else {
			jb_run.setText("Copy '"+generateCommand()+"'");
		}
		jb_run.revalidate();
		jb_run.repaint();
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