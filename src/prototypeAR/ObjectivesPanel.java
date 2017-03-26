package prototypeAR;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;

public class ObjectivesPanel extends JPanel{

	/**
	 * 
	 */
	
	private ArrayList<Objective> objectiveList = new ArrayList<Objective>();
	private static final long serialVersionUID = -7613749376969458763L;

	public ObjectivesPanel() {
		super();
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel pnlObjectiveList = new JPanel();
		add(pnlObjectiveList);
		pnlObjectiveList.setLayout(new BoxLayout(pnlObjectiveList, BoxLayout.Y_AXIS));
		
		JLabel lblObjectiveList = new JLabel("Objective 2");
		pnlObjectiveList.add(lblObjectiveList);
		
		JLabel lblNewLabel = new JLabel("New label");
		pnlObjectiveList.add(lblNewLabel);
		
		JPanel pnlCurrentObjective = new JPanel();
		add(pnlCurrentObjective);
		
		JLabel lblCurrentObjective = new JLabel("Current Objective");
		pnlCurrentObjective.add(lblCurrentObjective);
		// TODO Auto-generated constructor stub
		
	}
	
	

}
