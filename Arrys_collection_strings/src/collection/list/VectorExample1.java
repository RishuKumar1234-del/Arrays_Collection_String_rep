package collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class VectorExample1 {

	public static void main(String[] args) {
	  final	Collection<String> vec=new Vector<String>();
		
		vec.add("subodh");
		vec.add("sheshank");
		vec.add("govind");
		vec.add("rahul");
		vec.add("nishant");
		vec.add("sachin");
		vec.add("amresh");
		vec.add("dheeraj");
		vec.add("krishna");
		vec.add("sumit");
		vec.add("sangam");
		vec.add("amrita");
		vec.add("munna");
		vec.add("akash");
		vec.add("ravi");
		vec.add("sant");
		vec.add("simran");
		Iterator<String> itr=vec.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ,");
		}
		System.out.println("\n");
		vec.add("deepak sir");
		for(String el:vec) {
			System.out.print(el + " ");
		}
		System.out.println("\nthe first element of this list is: " +((Vector) vec).getFirst());
		System.out.println("\nthe last element of this list is: " + ((Vector)vec).getLast());
		vec.removeIf(e->e.startsWith("s"));
		System.out.println(vec);
		
		
	}

}
