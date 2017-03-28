package prototypeAR;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class MainMenu extends JPanel
{
	private static final long serialVersionUID = 1L;

	MainScreen frame;
	
	public MainMenu(MainScreen frame) {
		this.frame = frame;
		
		setSize(1500,1000);
		setLayout(null);
		
		JButton btnStartARecipe = new JButton("Start a Recipe!");
		btnStartARecipe.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		btnStartARecipe.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				setVisible(false);
		        SelectRecipePanel srp = new SelectRecipePanel(frame);
		        srp.setVisible(true);
		        frame.getContentPane().add(srp);
			}
		});
		
		btnStartARecipe.setBounds(605, 160, 332, 98);
		add(btnStartARecipe);
		
		JButton btnEncyclopedia = new JButton("Encyclopedia");
		btnEncyclopedia.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEncyclopedia.setBounds(605, 310, 332, 98);
		add(btnEncyclopedia);
		
		JButton btnChallenges = new JButton("Challenges");
		btnChallenges.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnChallenges.setBounds(605, 461, 332, 98);
		add(btnChallenges);
		
		JButton btnProfile = new JButton("Profile");
		btnProfile.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnProfile.setBounds(605, 611, 332, 98);
		add(btnProfile);
	}

}
