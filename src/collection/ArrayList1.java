package collection;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add("Ganesh");
	al.add(100);
	al.add(null);
	al.add(null);
	al.add("suresh");
	al.add(null);
	al.add("Ganesh");
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.contains(100));
		System.out.println(al.get(4));
		System.out.println(al);
		al.add(2,55);
		System.out.println(al.get(6));
		System.out.println(al);
		al.remove(7);
		System.out.println(al);
	}	
}
