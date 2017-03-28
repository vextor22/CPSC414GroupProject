package prototypeAR;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JLabel;

public class SelectRecipePanel extends JPanel 
{
	
	private static final long serialVersionUID = 1L;
	JFrame frame;
	
	public SelectRecipePanel(MainScreen frame) {
		this.frame = frame;
		setSize(1500,1000);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(116, 229, 401, 379);
		add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textArea.setBounds(867, 235, 508, 379);
		add(textArea);
		
		String [] descriptions = new String[2];
		descriptions[0] = "Description: A sweet and easy to make sandwich\n\n\n" + 
				"Ingredients: your choice of bread, peanut butter, \n                   your choice of jelly\n\n\n" +
				"Difficulty: Very Easy\n\n\n" +
				"Time to Make: 3 minutes\n\n\n";
		descriptions[1] = "Description: PLACEHOLDER\n\n\n"
				+"Ingredients: PLACEHOLDER\n\n\n"
				+ "Difficulty: PLACEHOLDER\n\n\n"
				+ "Time to Make: PLACEHOLDER\n\n\n";
		
		String[] recipes = new String[] {"4-Cheese Lasagna", "Bison Burger", "Beef Jerky", "Beef Wellington", "Buffalo Wings", "Carribean Jerk Chicken", "Clamari", "Cornbread", "Filet Mignon", "Fried Chicken", "German Chocolate Cake", "Hamburger", "Peanut Butter and Jelly", "Salmon", "Sesame Chicken", "Steak Burrito", "Stir Fry", "Talapia"};
		Arrays.sort(recipes);
		
		JList<String> list = new JList<String>();
		list.setFont(new Font("Tahoma", Font.PLAIN, 26));
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				
				if(recipes[list.getSelectedIndex()].equals("Peanut Butter and Jelly"))
					textArea.setText(descriptions[0]);
				else
					textArea.setText(descriptions[1]);
			}
		});
		
		scrollPane.setViewportView(list);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setModel(new AbstractListModel<String>() {
			
			private static final long serialVersionUID = 1L;
			String[]values = recipes;
			public int getSize() {
				return values.length;
			}
			public String getElementAt(int index) {
				return values[index];
			}
		});
		
		list.setBackground(Color.WHITE);
		
		JButton btnStartCooking = new JButton("Start Cooking!");
		btnStartCooking.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnStartCooking.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				if(recipes[list.getSelectedIndex()].equals("Peanut Butter and Jelly"))
				{
					MainMenu m = new MainMenu(frame);
					RecipeCompletedPanel r = new RecipeCompletedPanel(m);
					frame.dispose();
				    r.setVisible(true);
				}
			}
		});
		
		btnStartCooking.setBounds(867, 626, 508, 68);
		add(btnStartCooking);
		
		JLabel lblSelectARecipe = new JLabel("Select a Recipe");
		lblSelectARecipe.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblSelectARecipe.setBounds(600, 95, 194, 32);
		add(lblSelectARecipe);
		
		JLabel lblRecipes = new JLabel("Recipes");
		lblRecipes.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblRecipes.setBounds(264, 186, 92, 32);
		add(lblRecipes);
		
		JLabel lblRecipeInformation = new JLabel("Recipe Information");
		lblRecipeInformation.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblRecipeInformation.setBounds(1025, 186, 216, 32);
		add(lblRecipeInformation);
				
		
	}
}
