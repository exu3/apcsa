import java.util.*;

/**
 *  Driver program for the Sorts class.
 */

public class SortStep{
  private Scanner console;
  private int [] myArray;
  private Sorts mySorts;
  private String listType;

  /**
   *  Constructor for the SortStep object
   */
  public SortStep(){
    console = new Scanner(System.in);
    mySorts = new Sorts();
    myArray = null;
    listType = "Integer";
  }

  /**
   *  Asks the user to select a sorting algorithm, fills the array
   *  with an amount of random integer data chosen by the user, calls
   *  the sorting algorithm, and gives an option of printing out the
   *  data after it has been sorted.
   */
  public void sortMenu(){
    String choice;

    do{
      System.out.println();
      System.out.println("Sorting algorithm menu");
      System.out.println();
      System.out.println("(1) Bubble sort");
      System.out.println("(2) Selection sort");
      System.out.println("(3) Insertion sort");
      System.out.println("(4) Recursive mergesort");
      System.out.println("(5) Fill with Integers");
      System.out.println("(Q) Quit");
      System.out.println();
      System.out.print("Choice ---> ");
      choice = console.next() + " ";
      if ('1' <= choice.charAt(0) && choice.charAt(0) <= '6'){
        System.out.println();

        mySorts.setStepCount(0);

        switch (choice.charAt(0)){
            case '1':
              resetArray();
              mySorts.bubbleSort(myArray);
              break;
            case '2':
              resetArray();
              mySorts.selectionSort(myArray);
              break;
            case '3':
              resetArray();
              mySorts.insertionSort(myArray);
              break;
            case '4':
              resetArray();
              int last = myArray.length - 1;
              //mySorts.mergeSort(myArray, 0, last);
              break;
            case '5':
        	  listType = "Integer";
              break;              
        }

        if ('1' <= choice.charAt(0) && choice.charAt(0) <= '4'){
        	System.out.println();
        	System.out.println("Array sorted to:");
	        screenOutput();
	        System.out.println();
	        System.out.println("# steps = " + mySorts.getStepCount());
	        System.out.println();
        }
      }
    } while (choice.charAt(0) != 'Q' && choice.charAt(0) != 'q');
  }

  /**
   *  Initializes myArray with random integers in the range
   *  1..largestInt
   *
   * @param  numInts     number of integers to generate (size of
   *      myArray)
   * @param  largestInt  largest possible random integer to create
   */
  private void fillArrayWithInts(){
    
    System.out.print("How many numbers do you wish to generate? ");
    int numInts = console.nextInt();
    System.out.print("Largest integer to generate? ");
    int largestInt = console.nextInt();
    
    myArray = new int[numInts];

    for (int i = 0; i < numInts; i++) {
      int randInt = (int)(Math.random()*(largestInt) + 1);
      System.out.println(randInt);
      myArray[i] = randInt;
    }
  }

  /**
   *  reset the array for the next sort
   */
  private void resetArray(){
    if (myArray == null || listType.equals("Integer")){
    	fillArrayWithInts();
    }

    System.out.println();
    System.out.println("Array reset to:");
    screenOutput();
  }

  /**
   *  prints out the contents of the array in tabular form, 12 columns
   */
  private void screenOutput(){
    for (int loop = 0; loop < myArray.length; loop++){
      if (loop % 12 == 0){
        System.out.println();
      }
      System.out.print(myArray[loop] + "  ");
    }
    System.out.println();
  }

  
}
