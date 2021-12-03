package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class TreeSetEmployeeExample {
	public static void main(String[] args) {
		
		TreeSetEmployeeExample t=new TreeSetEmployeeExample();
		
		TreeSet<Employee>  treeset = new TreeSet<Employee>();
		
		Employee e1=new Employee("sachin","jadhav",100000);
		Employee e2=new Employee("abc","kk",100000);
		
		
		treeset.add(e1);
		treeset.add(e2);
		
		//System.out.println(treeset);
		
		// converting treeset into arraylist
		
		List<Employee> al = new ArrayList<Employee>(treeset);
		
		Collections.sort(al);
		
	//	System.out.println(al);
		
		
		SortOnLength obj = new SortOnLength();
		
		Collections.sort(al,obj);
	
		System.out.println(al);
	}

	
}//class ends


class SortOnLength implements Comparator<Employee>
{

	@Override
	public int compare(Employee e1, Employee e2) {
	
		if(e1.lastName.length()>e2.lastName.length())
			return -1;
		
		else if(e1.lastName.length() < e2.lastName.length())
			return 1;
		
		else
			return e1.lastName.compareTo(e2.lastName);
	}
	
}



