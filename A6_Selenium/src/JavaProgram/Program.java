package JavaProgram;

public class Program {

	static {
		System.out.println("Hi i am MLSI");
	}	
	static int a = 10;
	int b = 20;	
	public Program() {
		System.out.println(a);
		System.out.println(b);
	}
	
	
	Program(int a){
		System.out.println("hii");
	}
	public void m1() {
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		System.out.println("Main Start");
		Program obj = new Program();
		System.out.println(obj);
		obj.m1();
		Program obj1 = new Program(2);
		System.out.println(obj1);
		System.out.println("Main End");
				
	}
	
	{
		System.out.println("Hi i am NSMLI");
	}
	
}
