package collection;

import java.util.ArrayList;

public class ArrayListDemo {
public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(10);// 0
		al.add("JBK");//1  // [ [10] Integer class object [JBK] String class object] ArrayList class object
		
		for(Object o : al)
		{
			if(o instanceof Integer)
			{
					Integer k = (Integer)o;
					System.out.println(k.intValue());//10
					
			}
			
			if(o instanceof String)
			{
					String k = (String)o;
					System.out.println(k.length());//3
			}
	
		}
		                       // 1 2 3 4 5 6 7 8 9 
		System.out.println(al);// [ 1 0 , J  B K ]
		
			String str=al.toString();
			str=str.substring(3,str.length()-1);
		                             //due to substring 3 its take after 4--9
			System.out.println(str);// , JBK
		
			
			Integer j=(Integer)al.get(0);
			
			
			for(int i=0;i<al.size();i++)
			{
				
				if(al.get(i) instanceof Integer)
				{
						Integer k = (Integer)al.get(i);
						System.out.println(k.intValue());//10
						
				}
				
				if(al.get(i) instanceof String)
				{
						String k = (String)al.get(i);
						System.out.println(k.length());//0
				}
			}
		
		
	}
}


