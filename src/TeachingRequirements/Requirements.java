package TeachingRequirements;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Requirements {
	
	AreaAndSkills[] areaAndSkillsList = new AreaAndSkills[10];
	int nStaff =0;
	
	private int requiredSkills;
	
	public Requirements() {
		
	}

	
	public void readSubjectsFromFile() {
		FileReader fr = null;
		try {
			String requirementsFile = "C:\\Users\\Hanna\\OneDrive\\1. MSc IT\\Semester 2\\Software Engineering\\Class_Director_Requirements_List.txt";
			fr = new FileReader(requirementsFile);
			Scanner s = new Scanner(fr);
			while(s.hasNextLine()) {
				String line = s.nextLine();
				String[] tokens = line.split(",");
				String dept = tokens[0];
				String subject = tokens[1];
				areaAndSkillsList[nStaff++] = new AreaAndSkills(dept, subject);
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
		
		for (int i = 0; i<nStaff; i++) {
			System.out.println(areaAndSkillsList[i]);
		}
	}
	
	
}

}
