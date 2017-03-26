package prototypeARTests;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import prototypeAR.ObjectivesPanel;

public class ObjectivePanelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame jframe = new JFrame();
		
		jframe.setLayout(new BorderLayout());
		jframe.add(new ObjectivesPanel(), BorderLayout.CENTER);
		
		jframe.pack();
		jframe.setVisible(true);

	}

}
