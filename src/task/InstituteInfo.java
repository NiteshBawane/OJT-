package task;

public class InstituteInfo {
private	double id,phone;
private	String name,role;
	
public InstituteInfo(double id,String name,double phone,String role){
	
}

public InstituteInfo(double id, double phone, String name, String role) {
	super();
	this.id = id;
	this.phone = phone;
	this.name = name;
	this.role = role;
}

public InstituteInfo() {
	
}

public double getId() {
	return id;
}

public void setId(double id) {
	this.id = id;
}

public double getPhone() {
	return phone;
}

public void setPhone(double phone) {
	this.phone = phone;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}
}
