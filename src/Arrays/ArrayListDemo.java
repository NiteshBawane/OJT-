package Arrays;

import java.util.ArrayList;

public class ArrayListDemo {
public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(10);// 0
		al.add("JBK");//1
		
		System.out.println(al);
		
			String str=al.toString();
			str=str.substring(1,str.length()-1);
		
			System.out.println(str);
		
			
			Integer j=(Integer)al.get(0);
			
			
			for(int i=0;i<al.size();i++)
			{
				//            object
				if(al.get(i) instanceof Integer)
				{
						Integer k = (Integer)al.get(i);
						System.out.println(k.intValue());
						
				}
				
				if(al.get(i) instanceof String)
				{
						String k = (String)al.get(i);
						System.out.println(k.length());
				}
			}
		
		
	}
}


