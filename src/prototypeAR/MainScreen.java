package prototypeAR;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainScreen extends JFrame{

	private static final long serialVersionUID = -6737387360403996561L;

	public MainScreen(){
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Kitchen AR Prototype");
		this.setSize(1500, 1000);
		JLabel label = new JLabel("First Item");
		getContentPane().add(label, BorderLayout.CENTER);
		MainMenu r = new MainMenu(this);
		r.setVisible(true);
		getContentPane().add(r);
		
	}

}
