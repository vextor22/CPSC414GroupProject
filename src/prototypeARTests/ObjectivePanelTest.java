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
		
		ArrayList<Objective> objectiveList = new ArrayList<Objective>();
		objectiveList.add(new Objective("Prepare", "Find a surface to being working. Gather peanut butter, jelly of your choice, bread of your choice, and a butter knife."));
		objectiveList.add(new Objective("Bread", "Take two slices of bread and place them on your surface."));
		objectiveList.add(new Objective("Peanut Butter", "Use your butter knife to spread peanut butter on one slice of bread."));
		objectiveList.add(new Objective("Jelly", "Use your butter knife to spread jelly on the other slice of bread. You may need to clean the knife first."));
		objectiveList.add(new Objective("Combine", "Place one slice on the other slice so that the jelly and peanut butter are touching."));
		objectiveList.add(new Objective("Get Plate", "Get a plate."));
		objectiveList.add(new Objective("Add Plate", "Place the bread on the plate."));
		objectiveList.add(new Objective("Enjoy", "All finished! Enjoy your sandwich and don't forget to clean up!"));
		
		
		List<Objective> objectiveListKale = new ArrayList<Objective>();
		objectiveListKale.add(new Objective("Prepare", "Gather your kale and a plate."));
		objectiveListKale.add(new Objective("Peel", "Peel the kale"));
		objectiveListKale.add(new Objective("Plate", "Place the peeled kale on your plate."));
		objectiveListKale.add(new Objective("Toss", "Toss the salad and add dressing as desired."));
		
		
		ObjectivesPanel objPanel = new ObjectivesPanel(objectiveList);
		
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
		JButton btnReverse = new JButton();
		btnReverse.setText("Reverse!");
		btnReverse.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    //move to the next step in objPanel
		    objPanel.reverse();
		  }
		});
		
		jframe.setLayout(new BorderLayout());
		jframe.add(btnUpdate, BorderLayout.NORTH);
		jframe.add(btnReverse, BorderLayout.SOUTH);
		jframe.add(objPanel, BorderLayout.CENTER);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jframe.pack();
		jframe.setVisible(true);

	}

}
