package identifiers;

public class DefaultValues {
	static boolean flag;
	static char d;
	static int u;

	public static void main(String[] args) {

		System.out.println(u);
		System.out.println(flag);
		System.out.println(d + "hello");
		System.out.println((int) d);

		float a = 10; // implicit casting
		System.out.println(a);

		int d = (int) a; // explicit casting
		System.out.println(d);

		char b = '1';  //A=65 a=97
		int c = (int) b;
		System.out.println(c);
	}
}
