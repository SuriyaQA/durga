package JavaProgram;

public class Program2 {

	public static int m1(int a,int b) {
		
		int res = m4(a,b);
		System.out.println(res);
		return a+b;
	}
	
	public static void m2() {
		System.out.println(m1(2,2));
	}
	
	public static void m3(int a,int b) {
	
		int res = m4(a,b);
		System.out.println(res);
		m1(res,2);
	}
	
	public static int m4(int c,int d) {	
		return c+d;
	
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main Start");
		
		m3(1,2);
		
		System.out.println("Main End");
	}
}
