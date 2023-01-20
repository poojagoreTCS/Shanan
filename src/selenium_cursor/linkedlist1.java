package selenium_cursor;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist1 {
	public static void main(String[] args) {
		LinkedList ln=new LinkedList();
		ln.add("advik");
		ln.add('Z');
		ln.add(null);
		ln.add(200);
		ln.add("nikita");
	    Iterator itr =ln.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
		
	}

}
