package selenium_cursor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import collection.Array_List;

public class iterator_using_arraylist {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Ganesh");
		al.add(100);
		al.add('A');
		al.add(null);
		al.add(null);
		al.add("Suresh");
		al.add(null);
		al.add("Ganesh");
		
		
	/*	//I need to print entire dat inside the collection
		System.out.println(al);
		//check the size
		System.out.println(al.size());
		//check whether it is empty
		System.out.println(al.isEmpty());//false
		//contains or not
		System.out.println(al.contains(100));//false
		//ghet the data of particular index
		System.out.println(al.get(2));
		//insertion(right shift operator)
		al.add(2,500);
		System.out.println(al.get(2));//500
		//print entire data
		System.out.println(al);//right shift operation
		//remove the data (left shift operation)
		al.remove(2);//left shift
		System.out.println(al); 
		
		System.out.println("print the the data inside the arraylist using iterator cursor");
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());  */
			
		System.out.println("print the data in the arraylist using List iterator");
			ListIterator litr = al.listIterator();
			while(litr.hasNext()) {
				System.out.println(litr.next());
		}
	}

}
