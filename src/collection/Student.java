package collection;

import java.util.Comparator;
import java.util.TreeSet;

public class Student {
	int rno, marks; // instance variable / object variable
	static String subName = "JAVA"; // static variable / class variable
	final int PRN;

	public Student(int rno, int marks, int PRN) {
		this.rno = rno;
		this.marks = marks;
		this.PRN = PRN;
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", marks=" + marks + ", PRN=" + PRN + "]";
	}

	public static void main(String[] args) {
		Student vishal = new Student(1, 80, 1000);
		Student nitesh = new Student(2, 90, 1001);

		System.out.println(Student.subName);// class variables are accessed
											// using class name
		System.out.println(nitesh.rno);// object variables are accessed using
										// object name / object reference
		System.out.println(nitesh.toString());
	}

	/*
	
	public Student(int rno, int marks) {
		super();
		this.rno = rno;
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [rno=" + rno + ", marks=" + marks + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(marks, rno);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return marks == other.marks && rno == other.rno;
	}


	

// -3 -2 -1 0 1 2 3
	/*
	@Override
	public int compareTo(Student o) {
		
		if(rno >o.rno)
			return 1;
		else if(rno < o.rno)
			return -1;
		else
		return 0;
	}



}//class students


class Sort1 implements Comparator<Student>
{

	@Override
	public int compare(Student student1, Student student2) {
		
		if(student1.rno > student2.rno)
			return 1;
		else if(student1.rno < student2.rno)
			return -1;
		else
			return 0;
		
			
	}
	
}





class Sort2 implements Comparator<Student>
{

	@Override
	public int compare(Student student1, Student student2) {
		
		if(student1.marks > student2.marks)
			return 1;
		else if(student1.marks < student2.marks)
			return -1;
		else
			return 0;
		
			
	}
	
}



class TestStudent
{
	public static void main(String[] args) {
		
		
		TreeSet<Student> treeset = new TreeSet();
		
		Student student1 = new Student(3,90,1000);
		Student student2 = new Student(1,95,2000);
		Student student3 = new Student(2,70,3000);
		
		treeset.add(student1);
		treeset.add(student2);//compare(student1,student2)
		treeset.add(student3);
		
		System.out.println("Sorted by rollnumber :- ");
		
		for(Student student : treeset)
		{
			System.out.println(student);
		
		}
		
		
		System.out.println("Sorted by Marks :- ");
		
		TreeSet<Student> treeset2 = new TreeSet<Student>(new Sort2());
		treeset2.addAll(treeset);
		
		for(Student student : treeset2)
		{
			System.out.println(student);
		
		}
		*/

}


