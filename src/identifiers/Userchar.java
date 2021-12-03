package identifiers;

import java.util.Scanner;

public class Userchar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value : ");
		char ch = sc.next().charAt(0);

		if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))// if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		{
			System.out.println(ch + " is Alphabet");
		}
		else if ((ch >= '0' && ch <= '9')) {
			System.out.println(ch + " is Number");
		} else {
			System.out.println(ch + " is Special Value");
		}
		sc.close();
	}
}
