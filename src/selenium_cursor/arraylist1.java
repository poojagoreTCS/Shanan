package selenium_cursor;

import java.util.ArrayList;
import java.util.ListIterator;

public class arraylist1 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(100);
		al.add("pooja");
		al.add(null);
		al.add('A');
		al.add(null);
		ListIterator litr=al.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
	}

}
