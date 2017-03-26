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
import java.awt.GridLayout;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class ObjectivesPanel extends JPanel{

	/**
	 * 
	 */
	
	private ArrayList<Objective> objectiveList = new ArrayList<Objective>();
	private static final long serialVersionUID = -7613749376969458763L;

	public ObjectivesPanel() {
		super();
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel pnlObjectiveList = new JPanel();
		pnlObjectiveList.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		add(pnlObjectiveList);
		pnlObjectiveList.setLayout(new BoxLayout(pnlObjectiveList, BoxLayout.Y_AXIS));
		
		JLabel lblObjectiveList = new JLabel("Objective 2");
		lblObjectiveList.setHorizontalAlignment(SwingConstants.CENTER);
		pnlObjectiveList.add(lblObjectiveList);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pnlObjectiveList.add(lblNewLabel);
		
		JPanel pnlCurrentObjective = new JPanel();
		pnlCurrentObjective.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		add(pnlCurrentObjective);
		
		JLabel lblCurrentObjective = new JLabel("Current Objective");
		lblCurrentObjective.setHorizontalAlignment(SwingConstants.CENTER);
		pnlCurrentObjective.add(lblCurrentObjective);
		// TODO Auto-generated constructor stub
		
	}
	
	

}
