/*
 * Activity 1.2.7
 * Create a program in VS Code that uses substring to concatenate the first half of one String 
 * with the second half of another. Use the starter code below and the programs in this activity as an example. 
 */
public class Concatenator
{
    public static void main (String[] args)
    {
        String trains = "I am thinking about trains.";
        String fish = "I see a large fish in the pond.";

        System.out.println(trains.substring(0, 5) + fish.substring(6, fish.length()));
    }
}