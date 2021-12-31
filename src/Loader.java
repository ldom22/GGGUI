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
	
	LoaderThread lt;
	
	public Loader(String title){
		lt = new LoaderThread(title);
		lt.start();
	}
	
	public void end(){
		lt.hide();
		lt.stop();
	}
}

class LoaderThread extends Thread {
	
	String title;
	JFrame jf;
	
	public LoaderThread(String title){
		this.title = title;
	}
	
	public void run(){
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
	
	public void hide(){
		jf.setVisible(false);
		jf.dispose();
	}
}