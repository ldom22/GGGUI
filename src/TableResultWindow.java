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
		jt.setCellSelectionEnabled(true);
		JScrollPane jsp = new JScrollPane(jt);
		add(jsp);
		
		pack();
		
		int height = 66 + (16 * dtm.getRowCount());
		if(height > 800){
			height=900;
		}
		setSize((int)getSize().getWidth(),height);
		setLocation(100,100);
		setTitle(title);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args){
		
	}
}