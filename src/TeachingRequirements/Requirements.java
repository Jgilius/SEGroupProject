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
	String training;
	int nStaff = 0;
	Staff staffList [] = new Staff[20];

	
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
				String training = tokens[2];
				staffList[nStaff++] = new Staff(name, sub, training);
			
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
		


			
			
			//TODO we need to refactor this for less repeated code - tried to put in a method but then we can't access
			//the subject that the user types in - SAD :( 
			
			//String option = JOptionPane.showInputDialog("Choose (M)aths, (E)nglish or (C)ompSci to see a list of teachers.");
			
			//char c = option.charAt(0);
			
			//if (c == 'q')
				//return;
			
			//switch(c) {
			//case 'M' : {
				System.out.println();
				if(nStaff>0) {
					for (i = 0; i<nStaff; i++) {
						System.out.println("Teachers in the system: " + staffList[i].getName());
					}
					String name = JOptionPane.showInputDialog("Check if a teacher requires training by typing their name: ");
					if(nStaff>0) {
					for (i=0; i <nStaff; i++) {
						
						if (name.equals(staffList[i].getName()) && staffList[i].getTraining().equals("no")) {
							System.out.println(name + " should be booked onto training.");
				}
				else if (nStaff>0) {
					for (i = 0; i<nStaff; i++) {
						if (name.equals(staffList[i].getName()) && staffList[i].getTraining().equals("yes")) {
							System.out.println(name + " has already completed their training to teach "  + staffList[i].getSub());
				
				
			}
			}
					}
			
			
			
			/*
			 * 
			 * char c = option.charAt(0);
			if (c == 'q')
				return;
				
			switch(c) {
			case 'S': {
				if (subject.equals("maths")) {
					if(nStaff>0) {
						for (i = 0; i<nStaff; i++) {
							if (staffList[i].getSub().equals("maths")) {
								
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
	
		*/	
		}
				
	
				}
				}
	}
}

