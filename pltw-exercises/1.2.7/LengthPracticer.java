/*
 * Activity 1.2.7
 */
public class LengthPracticer
{
  public static void main(String[] args)
  {
   /* Your code here. */
    String animal = "cat";
    int animalLength = animal.length();
    System.out.println(animalLength);

    // concatenate a new String to the end of "cat"
    animal += "meow";
    System.out.println(animal.length());
  }
}