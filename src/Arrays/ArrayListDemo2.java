package Arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo2 {
public static void main(String[] args) {
		
		// Generic Collection makes collection type safe
		// We don't need type casting
		
		ArrayList<Integer> al = new ArrayList<Integer>();//[10,20]
	    al.add(10);// 0
	    al.add(20);// 1
		//al.add("JBK");//1
		
		System.out.println(al);//[10,20]
				
			Integer i=al.get(0);
			System.out.println(i);
			
		al.set(0, 40);
		
		System.out.println(al);
	
		//al.remove(0);
		
		//System.out.println(al);
		
		//System.out.println(al.remove(Integer.valueOf(20)));
		
		//remove(int index){}
		//remove(Object o){}
		//System.out.println(al);
		
		
		System.out.println("Retrieving Elements using for each");
		
		for(Integer object : al)
		{
			System.out.println(object.intValue());
		}
		
		System.out.println("Retrieving Elements using for loop ");
		
		for(int index=0;index<al.size();index++)
		{
			System.out.println(al.get(index));
		}
		
			
		System.out.println("Retrieving Elements using iterator ");
		
		Iterator<Integer> iterator=al.iterator(); // iterator=> [hasNext() , next() , remove()] Iterator object
		
		//10,20
		while(iterator.hasNext())
		{
			Integer num =iterator.next();
			System.out.println(num);
		}
		
		
	System.out.println("Retrieving Elements using ListIterator ");
		
	ListIterator<Integer> listIterator=al.listIterator();
	
	
	while(listIterator.hasNext())
	{
		
		System.out.println(listIterator.next());
		
	}
	
		
	System.out.println("Retrieving Elements using ListIterator in reverse direction:-   ");
	

	
	
	while(listIterator.hasPrevious())
	{
		
		System.out.println(listIterator.previous());
		
	}
		
	}
}


