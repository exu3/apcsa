/*
 * Activity 3.6.2 
 */
public class TraversalAlgorithmsFor
{
  public static void main(String[] args)
  {
    algorithm1();
    algorithm2();
    algorithm3();
    algorithm4();
  }
  
  public static void algorithm1()
  {
    /* your code here */
    int[] goals = {1,2,0,3,2,4,2,1,0,2,0,1,3,2};
    for (int p = 0; p< goals.length; p++) {
        if (goals[p] == 0) {
            System.out.println("Previous game had no goals!");
        }
    }
  }
  
  public static void algorithm2()
  {
    /* your code here */
    int[] goals = {1,2,0,3,2,4,2,1,0,2,0,1,3,2};
    int sum = 0;
    for (int n =0; n<goals.length; n++) {
        sum += goals[n];
    }
    System.out.println("All goals: " + sum);
  }
  
   public static void algorithm3()
  {
    /* your code here */
    String[] misc = {"A", "B", "C", "D", "E","F"};
    
    for (int j = misc.length-1; j >= 0; j--) {
        System.out.print(misc[j] + " ");
    }
  }
  
  public static void algorithm4()
  {
    /* your code here */
    String[] misc = {"A", "B", "C", "D", "E","F"};

    for (int skip = 1; skip < misc.length; skip+=2) {
        System.out.print(misc[skip] + " ");
    }
  }
  
}