/** 
 * Activity 1.1.4
 * task list: ( haven't done any of them yet lol)
 * 1) Add at least three other people to your program, 
 * such as siblings, friends, or neighbords.
 * 
 * 2) Use people that are in different grades to validate 
 * your pgoram can work for different school grades.
 * 
 * 3) For their years in school, use values that indicate 
 * they will soon be halfway through their current school year, 
 * as shown in the provided code.
 */
public class CompoundOperators {
	public static void main(String[] args) {
		int numPeople = 0;
		double totalYears = 0;

		double years = 11.5;

		totalYears += years;
		numPeople++;

		System.out.println("I have " + years + " years in school.");
		System.out.print("Total people: " + numPeople);
		System.out.println(", total years: " + totalYears);
	}
	
}
