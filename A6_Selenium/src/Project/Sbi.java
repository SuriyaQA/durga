package Project;

public class Sbi extends Account {

	Sbi(String name){
		super(name);
	}

	@Override
	public void deposit(double d) {
		balance +=d;
		System.out.println("******Deposite Sucessfull*****");
		System.out.println("Available Balance :" + balance);
	}

	@Override
	public void withdraw(double w) {

		if(balance>0 && balance>=w) {
			balance-=w;
			System.out.println("****WithDraw Successfull****");
			System.out.println("Available Balance :" + balance);
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}

	@Override
	public void detail() {
		System.out.println("USER NAME         :"+ Account_User_Name);
		System.out.println("AVAILABLE BALANCE :"+ balance);
	}
}
