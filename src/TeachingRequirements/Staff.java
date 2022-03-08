package TeachingRequirements;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Staff {
	private String name;
	private String subject;
	private String training;
	
	
	public Staff(String n, String sub, String training) {
		this.name = n;
		this.subject = sub;
		this.training = training;		
	}
	
		public String getName() {
			return name;
		}
	
		public String getSub() {
			return subject;
		}
	
		
		public String getTraining() {
			return training;
		}
		
		public String toString() {
			return (name + " " + subject + " " + training);
		}
	


}
	
