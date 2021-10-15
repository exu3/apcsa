/*
 * Activity 3.6.2
 */
public class TraversingWithFor
{
  public static void main(String[] args)
  {    
    int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};
    for (int i = 0; i < goals.length; i++)
    {
      System.out.println("Game " +  (i+1) + ": " + goals[i]);
    }
  }
}