package PolyMorphism;

public class Child extends Parent{

	static int a = 30;
	int b = 40;
	
	Child(){
		m2();	
		a = 50;
	}
	public static void main(String[] args) {
		
		System.out.println(a);
		System.out.println(Parent.a);
		
		Child obj = new Child();
		
		System.out.println(obj.b);
		
		 obj.m2();
		 
		
	}
	
	public void m2() {
		System.out.println(super.b);//20
		
		System.out.println(this.b);//40
		
		
		System.out.println(b);
		
		
	}
}
