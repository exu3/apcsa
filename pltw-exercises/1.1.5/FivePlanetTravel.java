/* 
 * Activity 1.1.5
 */
public class FivePlanetTravel
{
  public static void main(String[] args)
  {
    // theplanets.org average distance from earth to the planets
    int mercury = 56974146;
    int venus = 25724767;
    int mars = 48678219;
    int jupiter = 390674710;
    int saturn = 792248270;

    // number of planets to visit
    int numPlanets = 5;

    // speed of light and our speed
    int lightSpeed =  670616629;
    lightSpeed /= 10;

    // total travel time
    double total = 0;

    

    /* your code here */
    System.out.println("distance to mercury " + (int)mercury);
	  System.out.println("distance to venus " + (int)venus);
	  System.out.println("distance to mars " + (int)mars);
	  System.out.println("distance to jupiter " + (int)jupiter);
	  System.out.println("distance to saturn " + (int)saturn);
    total = (mercury + venus + mars + jupiter + saturn)/ lightSpeed;

    double average = (double)total / numPlanets;
    System.out.println("Average travel time: " + average);

    System.out.println("total distance " + total + " light years");


    
  }
}
