package OOPS;

public class Driver {

	public static void main(String[] args) {
		
		 Encapsulation obj = new Encapsulation();
		 
		 int res = obj.getA_Value();
		 
		 System.out.println(res);
		 
		 System.out.println(obj.getB_value());
		 
		 obj.setA_value(30);
		 
		 System.out.println(obj.getA_Value());
		 
		 obj.setB_value(40);
		 
		 System.out.println(obj.getB_value());
		 
		
	}
}
