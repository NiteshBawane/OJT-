package task;

import java.util.Comparator;
import java.util.ListIterator;

public class Employee implements Comparator<Employee>{

	int id;
	String firstname, lastname;

	public Employee(int id, String firstname, String lastname) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}

	@Override
	public int compare(Employee employee, Employee emp) {
		if (employee.id==emp.id) {
			return 1;
		} else {
			return 1;
		}
	}

	
			
	}

		
