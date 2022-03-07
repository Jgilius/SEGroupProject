package TeachingRequirements;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ReadClass {
	Staff staffList[] = new Staff[10];
	int nStaff = 0;
	
	public ReadClass() {
		
	}
	
	public void readStaffFromFile() {
		FileReader fr = null;
		try {
			String staffFile = "C:\\Users\\Hanna\\OneDrive\\1. MSc IT\\Semester 2\\Software Engineering\\Staff3.txt";
			fr = new FileReader(staffFile);
			Scanner s = new Scanner(fr);
			while(s.hasNextLine()) {
				String line = s.nextLine();
				String[] tokens = line.split(",");
				String name = tokens[0];
				String contactNumber = tokens[1];
				String ID = tokens[2];
				staffList[nStaff++] = new Staff(name, contactNumber, ID);
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
	}	
	public void print(PrintStream ps) {
		if(nStaff>0) {
			for (int i = 0; i<nStaff; i++) {
				ps.print(staffList[i]);
			}
		
		
	}
	
	}

	

}
