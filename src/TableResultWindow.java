/****************************************************************************************************/
/*                                                                                                  */
/* File: TableResultWindow.java                                                                     */
/* Description: Generic table visualizer window                                                     */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

import javax.swing.*;
import javax.swing.table.*;

public class TableResultWindow extends JFrame {
	
	public TableResultWindow(String title, DefaultTableModel dtm) {
		JTable jt = new JTable(dtm);
		JScrollPane jsp = new JScrollPane(jt);
		add(jsp);
		
		setSize(800,600);
		setLocation(100,100);
		setTitle(title);
		pack();
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args){
		
	}
}