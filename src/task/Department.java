package task;

public class Department {
	int departmentNumber ;
	String departmentName;
	public Department(int departmentNumber, String departmentName) {
		super();
		this.departmentNumber = departmentNumber;
		this.departmentName = departmentName;
	}
	@Override
	public String toString() {
		return "Department [departmentNumber=" + departmentNumber + ", departmentName=" + departmentName + "]";
	}
	
	
}
