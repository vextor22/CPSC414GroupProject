package prototypeAR;
/*
 * 
 * Objective class represents an objective of a step as it should be displayed within the objectives box.
 * 
 */
public class Objective {
	private String title, objectiveString;
	private int time;
	
	
	public Objective(String objectiveString, int time) {
		super();
		this.objectiveString = objectiveString;
		this.time = time;
	}
	public Objective(String title, String descr) {
		super();
		this.objectiveString = descr;
		this.title = title;
	}


	public String getTitle() {
		return title;
	}
	public String getObjectiveString() {
		return objectiveString;
	}
	@Override
	public String toString() {
		return objectiveString + time;
	}
	
	
	
	

}
