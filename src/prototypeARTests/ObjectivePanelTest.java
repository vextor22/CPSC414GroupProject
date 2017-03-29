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
		
		ArrayList<Objective> objArray = new ArrayList<Objective>();
		objArray.add(new Objective("First", "First descr"));
		objArray.add(new Objective("sec", "sec descr"));
		objArray.add(new Objective("3", "3 descr"));
		objArray.add(new Objective("4", "4 descr"));
		objArray.add(new Objective("5", "5 descr"));
		objArray.add(new Objective("6", "6 descr"));
		objArray.add(new Objective("7", "7 descr"));
		
		JFrame jframe = new JFrame();
		
		jframe.setLayout(new BorderLayout());
		jframe.add(new ObjectivesPanel(objArray), BorderLayout.CENTER);
		
		jframe.pack();
		jframe.setVisible(true);

	}

}
