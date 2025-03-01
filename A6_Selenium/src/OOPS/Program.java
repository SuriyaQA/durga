package OOPS;

public class Program {

	int a = 10;
	
	public static void main(String[] args) {
		
		Program obj = new Program();
		
		System.out.println(obj);
	}
	
	@Override
	public String toString() {
		
		return ""+a;
	}
}
