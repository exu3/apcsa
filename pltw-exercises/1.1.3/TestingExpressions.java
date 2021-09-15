/*
 * Activity 1.1.3
 */
public class TestingExpressions
{
	public static void main(String[] args) 
	{
    // declare and initialize weightOnEarth, earthGravity, and jupiterGravity 
    int weightOnEarth = 150;
    double earthGravity = 9.81;
    double jupiterGravity = 24.79;
    
    // calculate weigth
    double weightOnJupiter = weightOnEarth * jupiterGravity / earthGravity;
    
    // show results
    System.out.print("Your weight on Jupiter is ");
    System.out.println(weightOnJupiter + " lbs.");
  }
}