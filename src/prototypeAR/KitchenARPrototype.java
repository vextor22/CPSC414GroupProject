package prototypeAR;

import java.util.ArrayList;
import java.util.List;

public class KitchenARPrototype {
	
	

	public static void main(String[] args) {
		List<Objective> objectiveListPBJ = new ArrayList<Objective>();
		objectiveListPBJ.add(new Objective("Prepare", "Find a surface to being working. Gather peanut butter, jelly of your choice, bread of your choice, and a butter knife."));
		objectiveListPBJ.add(new Objective("Bread", "Take two slices of bread and place them on your surface."));
		objectiveListPBJ.add(new Objective("Peanut Butter", "Use your butter knife to spread peanut butter on one slice of bread."));
		objectiveListPBJ.add(new Objective("Jelly", "Use your butter knife to spread jelly on the other slice of bread. You may need to clean the knife first."));
		objectiveListPBJ.add(new Objective("Combine", "Place one slice on the other slice so that the jelly and peanut butter are touching."));
		objectiveListPBJ.add(new Objective("Get Plate", "Get a plate."));
		objectiveListPBJ.add(new Objective("Add Plate", "Place the bread on the plate."));
		objectiveListPBJ.add(new Objective("Enjoy", "All finished! Enjoy your sandwich and don't forget to clean up!"));
		
		List<Objective> objectiveListKale = new ArrayList<Objective>();
		objectiveListKale.add(new Objective("Prepare", "Gather your kale and a plate."));
		objectiveListKale.add(new Objective("Peel", "Peel the kale"));
		objectiveListKale.add(new Objective("Plate", "Place the peeled kale on your plate."));
		objectiveListKale.add(new Objective("Toss", "Toss the salad and add dressing as desired."));
		
		List<Objective> objectiveListEggs = new ArrayList<Objective>();
		objectiveListEggs.add(new Objective("Prepare", "Gather your boiled egg and a plate."));
		objectiveListEggs.add(new Objective("Peel", "Peel the egg"));
		objectiveListEggs.add(new Objective("Plate", "Place the peeled on on your plate."));
		
		List<Objective> objectiveListCake = new ArrayList<Objective>();
		objectiveListCake.add(new Objective("Prepare", "Gather your cake, frosting, and spoon."));
		objectiveListCake.add(new Objective("Border", "Draw a border on your cake."));
		objectiveListCake.add(new Objective("Words", "Draw the words 'Happy Birthday!' in the middle of the cake."));


		// TODO Auto-generated method stub
			MainScreen mainScreen = new MainScreen();
			mainScreen.setVisible(true);
	}

}
