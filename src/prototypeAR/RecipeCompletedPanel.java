package prototypeAR;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RecipeCompletedPanel extends JPanel
{
	private static final long serialVersionUID = 1L;
    MainMenu frame;
    
	public RecipeCompletedPanel(MainMenu frame) 
	{
		this.frame = frame;
		
		setSize(1500, 1000);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Recipe Completed!");
		lblNewLabel.setBounds(609, 89, 364, 49);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		add(lblNewLabel);
		
		JLabel lblExperienceAwarded = new JLabel("Experience Awarded: 500");
		lblExperienceAwarded.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblExperienceAwarded.setBounds(389, 222, 395, 29);
		add(lblExperienceAwarded);
		
		JLabel lblTotalExperience = new JLabel("Total Experience: 1500/2000");
		lblTotalExperience.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTotalExperience.setBounds(382, 288, 309, 29);
		add(lblTotalExperience);
		
		JLabel lblCurrentLevel = new JLabel("Current Level: 5");
		lblCurrentLevel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblCurrentLevel.setBounds(382, 355, 309, 29);
		add(lblCurrentLevel);
		
		JButton btnReturnToMain = new JButton("Return to Main Menu");
		btnReturnToMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				setVisible(false);
				frame.setVisible(true);
			    
			}
		});
		
		btnReturnToMain.setBounds(638, 451, 281, 61);
		add(btnReturnToMain);
	}
}
