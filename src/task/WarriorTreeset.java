package task;

import java.util.TreeSet;

public class WarriorTreeset {
	public static void main(String[] args) {
		TreeSet<Warrior> treeset = new TreeSet<Warrior>();
		Warrior wa1 = new Warrior("BajiPrabhu", "DeshPande", 55, 1);
		Warrior wa2 = new Warrior("BajiRao", "Peshwa", 76, 2);
		Warrior wa3 = new Warrior("Santaji", "Dhorpade", 51, 3);
		Warrior wa4 = new Warrior("Raghoji", "Bhosale", 60, 4);
		Warrior wa5 = new Warrior("BajiRao", "Jadhav", 58, 5);
		treeset.add(wa1);
		treeset.add(wa2);
		treeset.add(wa3);
		treeset.add(wa4);
		treeset.add(wa5);
System.out.println("Warrior's Sorted by there FirstNames>>");
		for (Warrior warrior : treeset) {
			System.out.println("FirstName>>>" + warrior.FirstName);
			System.out.println("Lastname>>>" + warrior.LastName);
			System.out.println("Age>>>" + warrior.Age);
			System.out.println("Rank>>>" + warrior.Rank);

		}
		System.out.println("><><><><><>");
	}
}
