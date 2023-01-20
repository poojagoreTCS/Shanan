package selenium_cursor;

import java.util.Iterator;
import java.util.LinkedHashSet;


public class iterator_hashset {
	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("Suresh");
		lhs.add('A');
		lhs.add(200);
		lhs.add(null);
		lhs.add(null);
		lhs.add("Suresh");
	/*	//print all the data
		System.out.println(lhs);//order of insertion is maintained  */
		System.out.println("print the data using iterator");
		Iterator itr = lhs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
