package TeachingRequirements;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Staff {
	private String name;
	private String subject;
	private String ID;
	private String specialismSubject;
	private int trainingReq;
	
	public Staff(String n, String sub, String id) {
		this.name = n;
		this.subject = sub;
		this.ID = id;		
	}
	
		public String getName() {
			return name;
		}
	
		public String getSub() {
			return subject;
		}
	
		
		public String getID() {
			return ID;
		}
		
		public String toString() {
			return (name + " " + subject);
		}
	


}
	
