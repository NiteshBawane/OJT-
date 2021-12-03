package task;

public class StringTask {
	public static void main(String[] args) {
		String s = "India is a great country";
		System.out.println(s);
		System.out.println("Actual Length of String is>>"+s.length());
		System.out.println("Length of each word is>>>>");
		
		String[] string = s.split(" ");
		for (String string2 : string) {
			int i = string2.length();
			System.out.println(string2 + " " + i);
			if (string2.length() >=7) {
				System.out.println("String have maximum length"+" "+">>"+string2);
			}
		}
	}
}
