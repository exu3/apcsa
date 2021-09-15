/**
 * Activity 1.1.3
 */
public class GalaxyWeight {
	public static void main(String[] args) {
		int weightOnEarth = 150;
		double earthGravity = 9.81;
		double mercuryGravity  = 3.59;
		double venusGravity = 8.87;
		double saturnGravity = 11.08;

		// calculate weights
		double weightOnMercury = weightOnEarth * mercuryGravity / earthGravity;
		double weightOnVenus = weightOnEarth * venusGravity / earthGravity;
		double weightOnSaturn = weightOnEarth * saturnGravity / earthGravity;

		// print results
		System.out.println("You weight on Mercury is " + weightOnMercury);
		System.out.println("You weight on Venus is " + weightOnVenus);
		System.out.println("You weight on Saturn is " + weightOnSaturn);
	}
	
}
