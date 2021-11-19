public class Person {

	// Attributes of a person
	// in APCSA, always make private instance variables
	private int age;
	private String name;
	private boolean isAlive;

	public Person() { // default constrcutor
		name = "";
		age = 0;
		isAlive = false;
	}

	public Person(String name, int aage, boolean isAlive) {// overloaded methods / overloaded constructors
		this.name = name; // use THIS yeah
		this.age = age;
		this.isAlive = isAlive;
	}

	public String toString() {
		return name + " - " + age + " - " + isAlive;
	}
}