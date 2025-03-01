package PolyMorphism;

public class Driver {

	public static void main(String[] args) {

		A obj = new A();

		B obj1 = new B();

		A obj2 = new B();//upcasted

		B obj3= (B)obj2; //downcasting
		
		
		obj.m1();
		obj1.m1();
		obj2.m1();
		obj3.m1();
	}
}
