/*
 * Activity 3.6.1
 */
public class Partners
{
  public static void main(String[] args)
  {    
    String[] days = { 
        "Sunday",
        "Monday", 
        "Tuesday", 
        "Wednesday",
        "Thursday", 
        "Friday", 
        "Saturday"
    };
    String[] partners = new String[7];
    // System.out.println(partners[0]);
    partners[1] = "Scrappy";
    partners[3] = "Wahoo Fish";
    partners[5] = "Clippy";

    System.out.println(partners[1] +"\n" + partners[3] +"\n" + partners[5]+ "\n");

    String[] friendPartners = partners;
    System.out.println(friendPartners[1] + "\n" + friendPartners[3] + "\n" +friendPartners[5]);
  }
}

