/**
 * Activity 1.1.5
 */
public class PlanetTravel {
	public static void main(String[] args) {
		// the planet's average distance from earth
		int mars = 48678219;
		// speed of light in mph
		int lightSpeed = 670616629;
		lightSpeed /=10;

		System.out.println("Travel time to Mars: " + (double)mars/lightSpeed + " hours.");
	}
	
}
