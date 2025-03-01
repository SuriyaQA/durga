package PolyMorphism;

public class MethodOverloading {

	public static void m1() {
		System.out.println("m1()");
	}
	
	public static void m1(long a) {
		System.out.println("m1(int a)");
	}
	
//	public static void m1(char ch) {
//		System.out.println("m1(char ch)");
//		
//	}
	
	
	public static void main(String[] args) {
	
		
		m1('a');
		
		  
	}
	
}
