package collection;

import java.util.Vector;

//import java.util.vector;
public class Vector_List {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("pooja");
		v.add(200);
		v.add('z');
		v.add(null);
		v.add(null);
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println(v.isEmpty());
		System.out.println(v.get(1));
		v.add(1,"shital");
		System.out.println(v);
		System.out.println(v.remove(1));
		System.out.println(v);

	}
}