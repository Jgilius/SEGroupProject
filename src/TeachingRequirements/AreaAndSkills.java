package TeachingRequirements;

public class AreaAndSkills {

	private String department;
	private String specialism;
	private int level; //from a list
	private int additionalSkills; //from a list
	
	public AreaAndSkills(String d, String s) {
		this.department = d;
		this.specialism = s;
		//this.level = l;
		//this.additionalSkills = a;
		
	}
	
	public String toString() {
		return (department + ": " +specialism);
		
		
	}
}
