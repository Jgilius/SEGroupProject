package TeachingRequirements;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.Arrays;

public class Requirements {
	
	String name;
	String sub;
	String id;
	int nStaff = 0;
	Staff staffList [] = new Staff[20];
	Subject subjectList[] = new Subject[20];
	int i;
	
	public Requirements () {
		
	}
	
	public void adminInterface() {
		
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
				staffList[nStaff++] = new Staff(name, sub, id);
				subjectList[nStaff++] = new Subject(name, sub);
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
		
		/*if(nStaff>0) {
			for (i = 0; i<nStaff; i++) {
				System.out.println(subjectList[i]);
				
			}	
		} */
		
		
		
		if(nStaff>0) {
			for (i = 0; i<nStaff; i++) {
				System.out.println(staffList[i]);
				
			}	
		}
		
		for (;;) {
			System.out.println();
			System.out.println("Choose a command.");
			String option = JOptionPane.showInputDialog("(S)ubject, (A)vailability, (T)raining, (Q)uit");
			
			char c = option.charAt(0);
			if (c == 'q')
				return;
			
			//TODO we need to refactor this for less repeated code - tried to put in a method but then we can't access
			//the subject that the user types in - SAD :( 
			
			String subject = JOptionPane.showInputDialog("Subject: ");
			switch(c) {
			case 'S': {
				if (subject.equals(subjectList[i].getSub())) {
					if(nStaff>0) {
						for (i = 0; i<nStaff; i++) {
							if (staffList[i].getSub().equals("maths")) {
								System.out.println("Teachers who teach " + subject + ": " + staffList[i].getName());
							}
						}
					}
				}
						
				else if(subject.equals("english")) {
					if(nStaff>0) {
						for (i = 0; i<nStaff; i++) {
							if (staffList[i].getSub().equals("english")) {
								System.out.println("Teachers who teach " + subject + ": " + staffList[i].getName());
							}	
						}
				
					}
		
			}
			
		}
	}
	
	}
	
			
		}
	

}

