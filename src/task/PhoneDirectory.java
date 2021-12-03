package task;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class PhoneDirectory {
public static void main(String[] args) {
	HashMap<Long, String> hm=new HashMap<>();
	hm.put(87654L, "Nishant");
	hm.put(99898L, "Nitesh");
	hm.put(76564L, "Rakesh");
	hm.put(67564L, "Pawan");
	hm.put(98767L, "Saurabh");
	hm.put(89087L, "Harshal");
	hm.put(78656L, "Suyesh");
	hm.put(87656L, "Daksh");
	System.out.println("Iterating hashmap entries using entrySet()");
	Set<Entry<Long,String>>  entrySet = hm.entrySet();

	for(Entry<Long, String> entry : entrySet)
	{
				System.out.println(entry.getKey() + " " + entry.getValue());
	}

	//Set entrySet=  [ Entry Object , Entry Object , Entry Object ] Set object

	
	System.out.println("1.adding new entry" );
	hm.put(90998L, "Bond");
	System.out.println(hm);
	
	System.out.println("2.removing entry ");
	hm.remove(90998L);
	System.out.println(hm);
	
	System.out.println("3.searching phone number ");
	String ph2 = hm.get(87656L);
	
	System.out.println(ph2);
	
	System.out.println("4.updating phone number");
	hm.put(87656L, "om");
	
	System.out.println(hm);
	
	System.out.println("5.displaying all entries ");
	System.out.println("Iterating hashmap entries using Iterator ");

	Iterator<Entry<Long, String>>  iterator=entrySet.iterator();

	while(iterator.hasNext())
	{
		Entry  entry = iterator.next();
		
		System.out.println(entry.getKey() + " " + entry.getValue());
	}

}
}
