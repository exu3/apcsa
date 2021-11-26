/*
 * Activity 3.7.3
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

/**
 *  A class to manage the location of horses in a barn.
 */
public class HorseBarn
{
  // The stalls or spaces in the barn. Each array element holds a reference to the horse
  // that is currently occupying the space.  A null value indicates an empty space.
  private ArrayList<Horse> spaces = new ArrayList<Horse>();

  /**
   * Constructor for the HorseBarn class. Loads data from the horsedata.txt file
   * and populates the ArrayList spaces. If a blank line occurs in the data file,
   * the array element is assigned a value of null to indicate the absense of a horse.
   */
  public HorseBarn()
  {
    // a try is like an if statement, "throwing" an error if the body of the try fails
    try
    {
      Scanner sc = new Scanner(new File("horsedata.txt"));
      // The Scanner method hasNextLine returns true if there is 
      // another line of input
      while (sc.hasNextLine())
      {
        // String method trim removes whitepsace from the beginning
        // and end of strings
        String temp = sc.nextLine().trim();
        if (temp.equals(""))
        {
          // no horse in this stall, add a null entry
          spaces.add(null);
        }
        else
        {  
          // String method split splits this string based on the
          // specified token and returns an array of individual substrings
          String[] tokens = temp.split(",");  
          String name = tokens[0];
          int  weight = Integer.parseInt(tokens[1]);
          
          // add the horse to the array list
          spaces.add(new Horse(name, weight));
        }
      }
    } catch (Exception e) { System.out.println("Error reading or parsing horsedata.txt" + e); }
  }

  /**
   * Returns the current list of spaces in the barn. If a space does not
   * have a horse in it, the element will be null.
   * 
   * @return the ArrayList of spaces
   */
  public ArrayList<Horse> getSpaces()
  {
    return spaces;
  }
}
