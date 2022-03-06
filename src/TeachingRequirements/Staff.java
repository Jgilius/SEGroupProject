package TeachingRequirements;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Staff {
	private String name;
	private String contactNumber;
	private String ID;
	private String specialismSubject;
	private int trainingReq;
	
	public Staff(String n, String c, String id) {
		this.name = n;
		this.contactNumber = c;
		this.ID = id;		
	}
	
	public String ToString() {
		return (name + ": " + contactNumber + ": " + ID);
	}
	


}
	
