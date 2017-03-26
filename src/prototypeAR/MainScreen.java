package prototypeAR;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainScreen extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6737387360403996561L;

	public MainScreen(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Kitchen AR Prototype");
		JLabel label = new JLabel("First Item");
		getContentPane().add(label, BorderLayout.CENTER);
		pack();
		
	}

}
