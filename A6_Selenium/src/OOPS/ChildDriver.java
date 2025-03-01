package OOPS;

public class ChildDriver {

	public static void main(String[] args) {
		
		  Parent obj = new Parent();
		  
		  System.out.println(obj.a);
		  
		  System.out.println(obj.b);
		  
		 Child obj1 =  new Child();
		 
		 System.out.println(obj1.a);
		 System.out.println(obj1.b);
		 System.out.println(obj1.c);
		 System.out.println(obj1.d);
		 
		 obj1.m2();
		 obj1.m1();
		 
		 obj.m2();
		 obj.m1();
		  
	}
}
