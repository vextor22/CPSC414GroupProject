package prototypeAR;

import java.util.ArrayList;
import java.util.List;

public class KitchenARPrototype {
	
	

	public static void main(String[] args) {
		List<Objective> objectiveList = new ArrayList<Objective>();
		objectiveList.add(new Objective("Prepare", "Find a surface to being working. Gather peanut butter, jelly of your choice, bread of your choice, and a butter knife."));
		objectiveList.add(new Objective("Bread", "Take two slices of bread and place them on your surface."));
		objectiveList.add(new Objective("Peanut Butter", "Use your butter knife to spread peanut butter on one slice of bread."));
		objectiveList.add(new Objective("Jelly", "Use your butter knife to spread jelly on the other slice of bread. You may need to clean the knife first."));
		objectiveList.add(new Objective("Combine", "Place one slice on the other slice so that the jelly and peanut butter are touching."));
		objectiveList.add(new Objective("Get Plate", "Get a plate."));
		objectiveList.add(new Objective("Add Plate", "Place the bread on the plate."));
		objectiveList.add(new Objective("Enjoy", "All finished! Enjoy your sandwich and don't forget to clean up!"));
		// TODO Auto-generated method stub
			MainScreen mainScreen = new MainScreen();
			mainScreen.setVisible(true);
	}

}
