package collection;

import java.util.LinkedList;

public class Linked_List {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("Kalyan");
		l.add(500);
		l.add('p');
		l.add(null);
		l.add(null);
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.contains('p'));
		System.out.println(l.get(1));
		System.out.println(l);
		l.add(3,'h');
		System.out.println(l);
		l.remove(3);
		System.out.println(l);
	}

}
