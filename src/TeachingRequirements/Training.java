package TeachingRequirements;

public class Training {
	
	private Staff[] staffToBeTrained = new Staff[10];
	private int i = 0;
	private Staff staff;
	
	public Training() {
		
		
	}
	
	//public Account createAccount(String name) {
		//Account a = factory.newAccount(name);
		//accountsList[i++] = a;
		//return a;
	//}
	
	//public void putStaffInTraining(String n) {
	//	searchName(n).putStaffInTraining(amount);
		
	//}
	
	//public Boolean withdraw(String n, int amount) {
		//Account a = searchName(n);
		//if(a.hasFunds(amount)) {
			//a.withdraw(amount);
			//return true;
		//}
		//else {
			//System.out.println("Insufficient Funds");
			//return false;
		//}
	
	
	//public Boolean transfer(String n1, String n2, int amount) {
		//if (withdraw(n1, amount)){
			//deposit(n2, amount);
			//return true;
	//}
		//else
			//return false;
		
	//}
	
	private Staff searchName(String name) {
		for (int j = 0; j < i; j++) {
			if (name.equals(staffToBeTrained[j].getName()))
				return staffToBeTrained[j];
			
		}
		return staff;
		
	}
	
	

	

}
