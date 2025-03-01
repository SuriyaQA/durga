package Project;

abstract public class Account {

	String Account_User_Name;
	double balance = 0;
	
	public Account(String name) {
		
		Account_User_Name = name;
	}
	
	abstract public void deposit(double d);
	
	abstract public void withdraw(double w);
	
	abstract public void detail();
}
