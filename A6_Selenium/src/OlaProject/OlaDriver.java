package OlaProject;

import java.util.Scanner;

public class OlaDriver {

	static boolean b = true;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(b) {
		System.out.println("Select the Vehiche Mode");
		System.out.println("1)Bike");
		System.out.println("2)Auto");
		System.out.println("3)Cab");
		System.out.println("4)Exit");
		
		int choice = sc.nextInt();
		
		Ola a;
		switch(choice) {
		
		case 1:{
			a = new Bike();//upcasted
			
			Bike obj = (Bike)a;//downcasting
			
			System.out.println("PRICE:"+obj.price);
		}
		break;
		case 2:{
			a = new Auto();
			
			Auto obj = (Auto)a;
			System.out.println("PRICE:"+obj.price);
		}
		break;
		case 3:{
			a = new Cab();
			Cab obj = (Cab)a;
			System.out.println("PRICE:"+obj.price);
		}
		break;
		
		case 4:{
			b = false;
			System.out.println("*****ThankYou Welcome Again****");
		}
		default :{
			System.out.println("Invalid Vehichle");
		}
		}//switch
		
	}//while
	}
}
