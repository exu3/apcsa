public class Main{
  public static void main(String[] args) {
    //We are going to practice some loop writing today using for loops, while loops, and print statements

    //To print, use either System.out.print OR System.out.println

    //From class - for loop syntax:
    //for(initialization; conditional statement; increment/change)
    
    //Complete the following challenges using BOTH a for loop and a while loop

    //1 - print all the integers 1 - 10, inclusive of both

    // for loop
    for (int i = 1; i<=10; i++) {
      System.out.print(i);
    }
    System.out.println();
    System.out.println();

    // while loop
    int ii = 1;
    while (ii <=10) { 
      System.out.print(ii);
      ii++;
    }
    System.out.println();
    System.out.println();

    //2 - print all the even integers between 1 and 1001
    // for loop
    for (int x=2; x<1001; x+=2) {
      System.out.print(x);
    }
    System.out.println();
    System.out.println();

    // while loop 
    int xx=2;
    while (xx<1001) {
      System.out.print(xx);
      xx+=2;
    }
    System.out.println();
    System.out.println();

    //3 - print all numbers divisible by 3, starting at 99, going from largest to smallest.
    
    // for loop
      for (int n = 99; n>=3; n-- ) {
        if ( n%3 == 0 ) {
          System.out.print(n);
        }
    }
    System.out.println();
    System.out.println();


    // while loop
    int nn = 99;
    while (nn>=3) {
      if ( nn%3 == 0 ) {
          System.out.print(nn);
        } 
      nn--;
    }
    System.out.println();
    System.out.println();
}
}