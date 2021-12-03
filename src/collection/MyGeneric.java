package collection;

public class MyGeneric<T> {
T obj;

public MyGeneric(T obj) {
	this.obj = obj;
}
T getObject(){
	return obj;
}
public static void main(String[] args) {
	MyGeneric<Integer> al=new MyGeneric<Integer>( new Integer(10));
	System.out.println(al.getObject());
	
	MyGeneric<String> al2=new MyGeneric<String>(new String("JBK"));
	System.out.println(al2.getObject());

	MyGeneric<Student> al3=new MyGeneric<Student>(new Student(1, 98, 1010) );
	System.out.println(al3.getObject());

}
}
//we can generic type class but need to mention data-type..
class Child extends MyGeneric<String>{

	public Child(String obj) {
		super(obj);
		// TODO Auto-generated constructor stub
	}
	
}
