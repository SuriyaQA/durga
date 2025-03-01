package JavaProgram;

public class Program4 {

	public static void main(String[] args) {
		
		String s = "selenium";
		
		String rev = "";
		
		for(int i=s.length()-1;i>=0;i--) {
			
			 rev+=s.charAt(i);
		}
		
		System.out.println(rev);
		
		char[] res1 = s.toCharArray();
		
		for(int i=res1.length-1;i>=0;i--) {
		
			System.out.print(res1[i]);
		}
		System.out.println();
		String[] res2 = s.split("");
		
		for(int i=res2.length-1;i>=0;i--) {
			System.out.print(res2[i]);
		}
		System.out.println();
		StringBuilder rev3 = new StringBuilder(s);
		
	      StringBuilder res4 = rev3.reverse();
	      
	      System.out.println(rev3);
	}
	
	
}
