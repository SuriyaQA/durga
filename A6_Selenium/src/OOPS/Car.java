package OOPS;

public class Car {

	String brand = "INNOVA";
	String colour = "WHITE";
	 double price = 100000;
	 
	 Engine e= new Engine();//early Instatntiation
	 
	 public void carDetial() {
		 
		 System.out.println("BRAND :"+brand);
		 System.out.println("COLOUR :"+colour);
		 System.out.println("PRICE :"+price);
	 }
}
