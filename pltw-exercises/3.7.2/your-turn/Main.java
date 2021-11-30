/**
 * THIS CODE IS BROCKEN. it's supposed to be a cli type thing where you can add and remove items from a list yeah
 * but like it doesn't really work
 * because the program ends when i click enter and doesn't let me fill in all the inputs and there should
 * be an option menu where you can choose different actions and stoooooof
 */

// Import the correct Java package. 
import java.util.ArrayList;
import java.util.Scanner; 

public class Main {
    
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        // Initialize the list with at least three String objects.
        ArrayList<String> list = new ArrayList<String>();
        list.add("dinosaur");
        list.add("rat");
        list.add("trash");

        // Display the current list of objects to the user.
        System.out.println(list);

        // Choose an option
        // System.out.println("Would you like to (a)dd, (i)nsert, (r)emove, re(p)lace, or (q)uit?");
        // String option = input.nextLine();

      
        // Type something to add an element to the list.
        System.out.println("Type something to add an element to the list:");
        String newItem = input.nextLine();

        list.add(newItem);
        System.out.println(list);

        // Select a position to add an element at a specific position in the list.
        System.out.println("Enter a position:");
        int position = input.nextInt();
        System.out.println("Enter something to add:");
        String newthing = input.nextLine();

        list.add(position-1, newthing);

        System.out.println(list);

        // Remove an item from the list by position number.
        // oops this is by name
        System.out.println("Enter item to remove from the list:");
        int removething = input.nextInt();

        list.remove(removething);

        System.out.println(list);

        input.close();

        
    }
}

// Replace an item in the list by position number.
// Validate input by checking for the size of the list where necessary.
