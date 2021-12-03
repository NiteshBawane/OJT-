package collection;

public class Employee implements Comparable<Employee> {
	String firstName , lastName;
	int salary;
	
	public Employee(String firstName, String lastName, int salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + "]";
	}

	public int compareTo(Employee e) {

			return - lastName.compareTo(e.lastName);
		
	}
	
}


