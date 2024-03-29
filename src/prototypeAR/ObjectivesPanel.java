package prototypeAR;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class ObjectivesPanel extends JPanel{

	/**
	 * 
	 */
	
	private Deque<Objective> fullObjectiveList = new LinkedList<Objective>();
	private Deque<Objective> upcomingList = new LinkedList<Objective>();
	private Stack<Objective> previousList = new Stack<Objective>();
	private List<JLabel> upcomingLabelList = new ArrayList<JLabel>();
	private Objective cur;
	private boolean finished = false;
	private static final long serialVersionUID = -7613749376969458763L;
	private JTextArea lblCurrentObjective;
	private JTextArea lblCurrentObjectiveTitle;
	public ObjectivesPanel(List<Objective> objectives) {
		super();
		
		
		//may have to change this loop to target java 1.7
		for(Objective obj : objectives){
			fullObjectiveList.add(obj);
		}
		cur = fullObjectiveList.poll();
		for(int i = 0; i < 6 && fullObjectiveList.size() > 0; i++){
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
		
		lblCurrentObjectiveTitle = new JTextArea("Current Objective");
		lblCurrentObjectiveTitle.setEditable(false);
		lblCurrentObjectiveTitle.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblCurrentObjectiveTitle.setBackground(UIManager.getColor("Panel.background"));
		pnlCurrentObjective.add(lblCurrentObjectiveTitle);
		
		lblCurrentObjective = new JTextArea();
		lblCurrentObjective.setColumns(24);
		lblCurrentObjective.setRows(3);
		lblCurrentObjective.setEditable(false);
		lblCurrentObjective.setWrapStyleWord(true);
		lblCurrentObjective.setLineWrap(true);
		lblCurrentObjective.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblCurrentObjective.setBackground(UIManager.getColor("Panel.background"));
		pnlCurrentObjective.add(lblCurrentObjective);
		
		//register the labels for upcoming objectives with the relevant list
		upcomingLabelList.add(lblUpcoming1);
		upcomingLabelList.add(lblUpcoming2);
		upcomingLabelList.add(lblUpcoming3);
		upcomingLabelList.add(lblUpcoming4);
		upcomingLabelList.add(lblUpcoming5);
		upcomingLabelList.add(lblUpcoming6);
		
		updateLabels();
		
	}
	
	private void updateLabels(){
		if(finished != true){
			lblCurrentObjective.setText(cur.getObjectiveString());
			lblCurrentObjectiveTitle.setText("Current Objective: " + cur.getTitle() + "\n");
		}
		else{
			lblCurrentObjective.setText("Finished!");
			lblCurrentObjectiveTitle.setText("Current Objective\n");
		}

		for(int i = 0; i < upcomingLabelList.size(); i++){
			
			if(i < upcomingList.size())
				upcomingLabelList.get(i).setText(((Objective)upcomingList.toArray()[i]).getTitle());
			else
				upcomingLabelList.get(i).setText("");
		}
	}
	
	public void reverse(){
		
		if(finished)
			finished = false;
		else{
			if(previousList.size() > 0){
				if(upcomingList.size() > 5)
					fullObjectiveList.addFirst(upcomingList.removeLast());
				upcomingList.addFirst(cur);
				cur = previousList.pop();
				
			}
		}
			
		updateLabels();
	}
	
	public void update(){
		

			
		
		if(upcomingList.peek() != null){
			previousList.add(cur);
			cur = upcomingList.poll();
		}
		else
			finished = true;
		
		Objective obj = fullObjectiveList.poll();
		if(obj != null)
			upcomingList.add(obj);
		
		
		
		updateLabels();
	}
	
	

}
