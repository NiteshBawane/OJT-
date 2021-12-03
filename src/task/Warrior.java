package task;

public class Warrior implements Comparable<Warrior>  {

	String FirstName;
	String LastName;
	int Age;
	int Rank;
	public Warrior(String firstName, String lastName, int age, int rank) {
		this.FirstName = firstName;
		this.LastName = lastName;
		this.Age = age;
		this.Rank = rank;
	}
	
	
	@Override
	public String toString() {
		return "Warrior [FirstName=" + FirstName + ", LastName=" + LastName + ", Age=" + Age + ", Rank=" + Rank + "]";
	}


	@Override
	public int compareTo(Warrior o) {
		if (FirstName==FirstName) {
			return FirstName.compareTo(o.FirstName) ;
	
		}
		return Age;
	}
	
	
}
