package task;

public class StringTask2 {
	public static void main(String[] args) {
		int count = 0;
		String str = "Java by Kiran Pune Karvenagar";
		String max = "";
		String newstr = "";
		System.out.println(str);
		System.out.println("Actual Length of String is>>" + str.length());
		System.out.println("Length of each word is>>>>");

		String[] string = str.split(" ");
		for (String string2 : string) {
			char[] ch = string2.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				count = 1;
				for (int j = i + 1; j < ch.length; j++) {
					if (ch[i] == ch[j]) {
						count++;
						j = ch.length;
						i = ch.length;
					}
				}
			}

			if (count == 1) {
				System.out.println(string2 + " - " + string2.length());
				newstr = newstr + " " + string2;
				if (max.length() < string2.length()) {
					max = string2;
				}
			}
		}
		System.out.println("\nMax length of"+" "+max+" is"+" "+ + max.length());
	}
}
