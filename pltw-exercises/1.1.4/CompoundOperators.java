/** 
 * Activity 1.1.4
 * task list:
 * 1) Add at least three other people to your program, 
 * such as siblings, friends, or neighbords.
 * 
 * 2) Use people that are in different grades to validate 
 * your pgoram can work for different school grades.
 * 
 * 3) For their years in school, use values that indicate 
 * they will soon be halfway through their current school year, 
 * as shown in the provided code.
 * 
 * 4)The average years you and your friends, siblings,
 * neighbors have been in school. 
 *
 * 5) The total days you have all been in school,
 * assuming you spend 180 days per year in school.
 * 
 * 6) The average days you have all spent in school
 * 
 */
public class CompoundOperators {
	public static void main(String[] args) {
		int numPeople = 3;
		double totalYears = 0;

		double friendYears = 10.5;
		double cousinYears = 9.5;
		double neighbourYears = 12.5;
		double years = 11.5;

		int gradYear = 13;

		totalYears = years + neighbourYears + cousinYears + friendYears;
		numPeople +=4;

		System.out.println("I have " + years + " years in school.");
		System.out.print("Total people: " + numPeople);
		System.out.println(", total years: " + totalYears);
		System.out.println("average years in school: " + (double)totalYears /numPeople);

		System.out.println("Friends years until graduation: " + (double)(gradYear - friendYears));
		System.out.println("Cousins years until graduation:  " + (double)(gradYear - cousinYears));
		System.out.println("Neighbours years until graduation: " + (double)(gradYear - neighbourYears));

		System.out.println("days in school for all of us combined: " + totalYears * 180);
		System.out.println("average number of days in school for each person: " + (double)totalYears*180/numPeople);
	}
	
}
