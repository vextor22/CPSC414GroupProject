package prototypeARTests;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
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
		objArray.add(new Objective("8", "8 Descr"));
		
		ObjectivesPanel objPanel = new ObjectivesPanel(objArray);
		
		JFrame jframe = new JFrame();
		JButton btnUpdate = new JButton();
		btnUpdate.setText("Update!");
		btnUpdate.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    //move to the next step in objPanel
		    objPanel.update();
		  }
		});
		
		jframe.setLayout(new BorderLayout());
		jframe.add(btnUpdate, BorderLayout.SOUTH);
		jframe.add(objPanel, BorderLayout.CENTER);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jframe.pack();
		jframe.setVisible(true);

	}

}
