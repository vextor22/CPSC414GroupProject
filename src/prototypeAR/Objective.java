package prototypeAR;
/*
 * 
 * Objective class represents an objective of a step as it should be displayed within the objectives box.
 * 
 */
public class Objective {
	private String objectiveString;
	private int time;
	
	
	public Objective(String objectiveString, int time) {
		super();
		this.objectiveString = objectiveString;
		this.time = time;
	}


	@Override
	public String toString() {
		return objectiveString + time;
	}
	
	
	
	

}
