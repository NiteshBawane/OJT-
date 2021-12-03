package task;

import java.util.ArrayList;

public class NewEmployee {
public static void main(String[] args) {
	ArrayList<Employee> emp = new ArrayList<>();
	Employee emp1 = new Employee(1, "Nitesh", "Bawane");
	Employee emp2 = new Employee(2, "Nishant", "Garve");
	Employee emp3 = new Employee(3, "Vaibhav", "Ghate");
	Employee emp4 = new Employee(4, "Rohit", "Nikhare");
	Employee emp5 = new Employee(1, "Pawan", "Sonkusare");

	emp.add(emp1);
	emp.add(emp2);
	emp.add(emp3);
	emp.add(emp4);
	emp.add(emp5);

	System.out.println("Based on Firstname>>>>>>");
for (Employee employee : emp) {
	System.out.println("Id>>>" + employee.id);
	System.out.println("Firstname>>>" + employee.firstname);
	System.out.println("Lastname>>>" + employee.lastname);
}
System.out.println("---------");

}

}




