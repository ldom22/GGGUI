/****************************************************************************************************/
/*                                                                                                  */
/* File: Loader.java                                                                                */
/* Description: Progress bar window                                                                 */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

import java.io.*;
import java.awt.*;
import javax.swing.*;

public class Loader {
	
	String title;
	JFrame jf;
	
	public Loader(String title){
		JProgressBar progressBar = new JProgressBar(0,100);
		progressBar.setValue(0);
		progressBar.setIndeterminate(true);
		
		jf = new JFrame();
		jf.setLayout(new GridLayout(1,1));
		jf.add(progressBar);
				
		jf.setSize(400,72);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		jf.setLocation(dim.width/2-jf.getSize().width/2, dim.height/2-jf.getSize().height/2);
		jf.setTitle(title);
		jf.setVisible(true);
	}
	
	public void end(){
		jf.setVisible(false);
		jf.dispose();
	}
	
	public void focus(){
		jf.toFront();
		jf.requestFocus();
	}
	
	public static void main(String args[]){
		new Loader("Connecting...");
	}
}