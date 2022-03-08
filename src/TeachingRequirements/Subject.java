package TeachingRequirements;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Subject {
	String name;
	String subject;
	Subject staffSubjectList[] = new Subject[10];
	int nStaff = 0;
	int i;
	
	public Subject(String name, String subject) {
		this.name = name;
		this.subject = subject;
			
	}
	
	public void printStaffSubjectArray() {
		
	FileReader fr = null;
	try {
		String requirementsFile = "C:\\Users\\Hanna\\OneDrive\\1. MSc IT\\Semester 2\\Software Engineering\\StaffNames.txt";
		fr = new FileReader(requirementsFile);
		Scanner s = new Scanner(fr);
		while(s.hasNextLine()) {
			String line = s.nextLine();
			String[] tokens = line.split(",");
			String name = tokens[0];
			String sub = tokens[1];
			staffSubjectList[nStaff++] = new Subject(name, sub);
		}	
	
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	finally {
		if(fr!=null) {
		try {
			fr.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		}
	}
	
	if(nStaff>0) {
		for (i = 0; i<nStaff; i++) {
			System.out.println(staffSubjectList[i]);
			
		}	
	
	}
}

	public String getSub() {
		return subject;
	}
	
	public String toString() {
		return (name + subject);
	}
}
