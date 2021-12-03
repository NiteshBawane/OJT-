package collection;

import java.util.ArrayList;

public class NonGenericCollection {
	public static void main(String[] args) {

		// Object get(int index)

		// NON-Generic Collection
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("jbk");

		String s = (String) al.get(1); // s-->["jbk"] String class object
										// get method is object level method
										// hence we need type-casting.
		Integer i = (Integer) al.get(0);// i-->[10] Integer class object
		// Generic Collection
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("java"); // 0
		al2.add("Kiran");// 1
		String s2 = al2.get(1);
		System.out.println(s2);
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		al3.add(10);// 0
		al3.add(12);// 1
		Integer s3 = al3.get(0);
		System.out.println(s3);
	}
}
