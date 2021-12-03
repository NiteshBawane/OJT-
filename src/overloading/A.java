package overloading;

//public class A {
//	static void m1(A a){
//	System.out.println("A class");
//}
//}
//
//class B extends A{
//	static	void m1(B b){
//		System.out.println("B class");
//
//	}
//}
//
//class C extends B{
//	static	void m1(C c){
//		System.out.println("C class");
//
//	}
//}
//class Test extends C{
//	public static void main(String[] args) {
//		B b=new C();
//		m1(b);//According to reference method get called..
//	}
//}
class Father {

	public void car() {
		System.out.println("Father's Car");
	}
}

class Son extends Father {

	public void car() {
		System.out.println("Son's Car");
	}
}

public class A {

	public static void main(String[] args) {

		Son john = new Son();
		john.car();
	}

}