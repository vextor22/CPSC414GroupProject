package prototypeAR;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

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
import java.awt.GridLayout;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;

public class ObjectivesPanel extends JPanel{

	/**
	 * 
	 */
	
	private Queue<Objective> fullObjectiveList = new LinkedList<Objective>();
	private Queue<Objective> upcomingList = new LinkedList<Objective>();
	private JLabel[] lblsUpcomingObjectives = new JLabel[6];
	private static final long serialVersionUID = -7613749376969458763L;

	public ObjectivesPanel(List<Objective> objectives) {
		super();
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel pnlObjectiveList = new JPanel();
		pnlObjectiveList.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		add(pnlObjectiveList);
		pnlObjectiveList.setLayout(new BoxLayout(pnlObjectiveList, BoxLayout.Y_AXIS));
		
		JLabel lblObjectiveListTitle = new JLabel("Upcoming Tasks:");
		lblObjectiveListTitle.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblObjectiveListTitle.setHorizontalAlignment(SwingConstants.CENTER);
		pnlObjectiveList.add(lblObjectiveListTitle);
		
		JLabel lblUpcoming = new JLabel("ObjectiveListHere");
		lblUpcoming.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUpcoming.setHorizontalAlignment(SwingConstants.CENTER);
		pnlObjectiveList.add(lblUpcoming);
		
		JPanel pnlCurrentObjective = new JPanel();
		pnlCurrentObjective.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		add(pnlCurrentObjective);
		pnlCurrentObjective.setLayout(new BoxLayout(pnlCurrentObjective, BoxLayout.Y_AXIS));
		
		JLabel lblCurrentObjectiveTitle = new JLabel("Current Objective");
		lblCurrentObjectiveTitle.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCurrentObjectiveTitle.setHorizontalAlignment(SwingConstants.CENTER);
		pnlCurrentObjective.add(lblCurrentObjectiveTitle);
		
		JLabel lblCurrentObjective = new JLabel("CurObjective Here");
		lblCurrentObjective.setFont(new Font("Tahoma", Font.PLAIN, 20));
		pnlCurrentObjective.add(lblCurrentObjective);
		// TODO Auto-generated constructor stub
		
	}
	
	public void update(){
		System.out.println("ObjectivesPanel update fired!");
	}
	
	

}
