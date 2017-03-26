package prototypeAR;
/*
 * Step class represents a single step of the recipe, populate steps with the information you want to change at each step.
 * 
 */
public class Step {
	
	private Objective objective;

	public Step(Objective objective) {
		super();
		this.objective = objective;
	}
	
	public Objective getObjective(){
		return objective;
	}

}
