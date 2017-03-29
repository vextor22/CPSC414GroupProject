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
	private List<JLabel> upcomingLabelList = new ArrayList<JLabel>();
	private Objective cur;
	private JLabel[] lblsUpcomingObjectives = new JLabel[6];
	private static final long serialVersionUID = -7613749376969458763L;

	public ObjectivesPanel(List<Objective> objectives) {
		super();
		
		for(Objective obj : objectives){
			fullObjectiveList.add(obj);
		}
		cur = fullObjectiveList.poll();
		for(int i = 0; i < 6; i++){
			upcomingList.add(fullObjectiveList.poll());
		}
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
		
		JLabel lblUpcoming1 = new JLabel("ObjectiveListHere");
		lblUpcoming1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUpcoming1.setHorizontalAlignment(SwingConstants.CENTER);
		pnlObjectiveList.add(lblUpcoming1);
		
		JLabel lblUpcoming2 = new JLabel("ObjectiveListHere");
		lblUpcoming2.setHorizontalAlignment(SwingConstants.CENTER);
		lblUpcoming2.setFont(new Font("Dialog", Font.PLAIN, 18));
		pnlObjectiveList.add(lblUpcoming2);
		
		JLabel lblUpcoming3 = new JLabel("ObjectiveListHere");
		lblUpcoming3.setHorizontalAlignment(SwingConstants.CENTER);
		lblUpcoming3.setFont(new Font("Dialog", Font.PLAIN, 18));
		pnlObjectiveList.add(lblUpcoming3);
		
		JLabel lblUpcoming4 = new JLabel("ObjectiveListHere");
		lblUpcoming4.setHorizontalAlignment(SwingConstants.CENTER);
		lblUpcoming4.setFont(new Font("Dialog", Font.PLAIN, 18));
		pnlObjectiveList.add(lblUpcoming4);
		
		JLabel lblUpcoming5 = new JLabel("ObjectiveListHere");
		lblUpcoming5.setHorizontalAlignment(SwingConstants.CENTER);
		lblUpcoming5.setFont(new Font("Dialog", Font.PLAIN, 18));
		pnlObjectiveList.add(lblUpcoming5);
		
		JLabel lblUpcoming6 = new JLabel("ObjectiveListHere");
		lblUpcoming6.setHorizontalAlignment(SwingConstants.CENTER);
		lblUpcoming6.setFont(new Font("Dialog", Font.PLAIN, 18));
		pnlObjectiveList.add(lblUpcoming6);
		
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
		
		upcomingLabelList.add(lblUpcoming1);
		upcomingLabelList.add(lblUpcoming2);
		upcomingLabelList.add(lblUpcoming3);
		upcomingLabelList.add(lblUpcoming4);
		upcomingLabelList.add(lblUpcoming5);
		upcomingLabelList.add(lblUpcoming6);
		
		lblCurrentObjective.setText(cur.toString());
		for(int i = 0; i < upcomingLabelList.size(); i++){
			upcomingLabelList.get(i).setText(((Objective)upcomingList.toArray()[i]).getTitle());
		}
		
	}
	
	public void update(){
		System.out.println("ObjectivesPanel update fired!");
	}
	
	

}
