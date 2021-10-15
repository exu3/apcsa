/*
 * Activity 3.6.2
 */
public class TraversingWithWhile
{
  public static void main(String[] args)
  {    
    int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};
    int i = 0;
    while (i <= goals.length-1)
    {
      System.out.println("Game " + (i+1) + ": " + goals[i]);
      i++;
    }
  }
}
  
  
  