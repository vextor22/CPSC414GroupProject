package prototypeARTests;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import prototypeAR.Objective;
import prototypeAR.ObjectivesPanel;

public class ObjectivePanelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame jframe = new JFrame();
		
		jframe.setLayout(new BorderLayout());
		jframe.add(new ObjectivesPanel(new ArrayList<Objective>()), BorderLayout.CENTER);
		
		jframe.pack();
		jframe.setVisible(true);

	}

}
