package Project;

import java.util.Scanner;

public class AccountDriver {

	public static void main(String[] args) {
		
		Account a;
		Scanner sc = new Scanner(System.in);
		boolean account = true;
		while(account) {
		System.out.println("Select Bank Account");
		System.out.println("1)SBI");
		System.out.println("2)INDIAN");
		System.out.println("3)EXIT");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		 
		case 1 :{
			System.out.println("Enter The UserNAme");
			 a= new Sbi(sc.next());
			 a.detail();
			 boolean b = true;
			 while(b) {
			 System.out.println("choose the Option");
			 System.out.println("1)DEPOSITE");
			 System.out.println("2)WITHDRAW");
			 System.out.println("3)BACK");
			 int option = sc.nextInt();
			
			 
			 switch(option) {
			 
			 case 1:{
				 System.out.println("Enter The Amount");
				 a.deposit(sc.nextDouble());
			 }
			  break;
			 case 2:{
				 System.out.println("Enter The amount");
				 a.withdraw(sc.nextDouble());
			 }
			 break;
			 
			 case 3:{
				 b = false;
			 }
			 }//switch
			 }
		}
		break;
		case 2:{
			System.out.println("Enter The UserNAme");
			 a= new Indian(sc.next());
             a.detail();
			 boolean b1 = true;
			 while(b1) {
			 System.out.println("choose the Option");
			 System.out.println("1)DEPOSITE");
			 System.out.println("2)WITHDRAW");
			 System.out.println("3)BACK");
			 int option = sc.nextInt();
			 
			 switch(option) {
			 
			 case 1:{
				 System.out.println("Enter The Amount");
				 a.deposit(sc.nextDouble());
			 }
			  break;
			 case 2:{
				 System.out.println("Enter The amount");
				 a.withdraw(sc.nextDouble());
			 }
			 break;
			 case 3:{
				 b1 = false;
			 }
			 break;
			 }//switch
		}//while
		}
		break;
		case 3:{
			account = false;
			System.out.println("*****Thank You Welcome Again*****");
		}
		}//switch
	}//while
	}//main
}//class
