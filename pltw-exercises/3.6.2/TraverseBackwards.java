/*
 * Activity 3.6.2
 */
public class TraverseBackwards
{
  public static void main(String[] args)
  {    
    int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};

    /* your code here */
    for (int i = goals.length-1; i >= 0; i--) {
        System.out.println("Game " + (i+1) + ": " + goals[i]);
    }
  }
}