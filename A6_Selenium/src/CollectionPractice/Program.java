package CollectionPractice;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("java");
		al.add(1);
		al.add(2.5);
		al.add('s');
		al.add(true);
		al.add(2.5);
		
		System.out.println(al);
		
		for(Object ob:al) {
			System.out.println(ob);
		}
		
		ArrayList<String> al1 = new ArrayList<String>();
		
		al1.add("selenium");
		al1.add("10");
		al1.add("2.5");
		
		for(String s:al1) {
			System.out.println(s);
		}
	}
}
