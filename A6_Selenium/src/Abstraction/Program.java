package Abstraction;

abstract public class Program {
	
	static int a  =10;
	int b = 20;
	
	public Program() {
		// TODO Auto-generated constructor stub
	}
	static {
		System.out.println("SMLI");
	}
	
	{
		System.out.println("NSMLI");
	}

	public static void m1() {
		
	}
	
	public void m2() {
		
	}
	abstract public void map();
	
	//abstract public static void m1();
	
	public static void main(String[] args) {
		
//		new Program();
		
	}
}
