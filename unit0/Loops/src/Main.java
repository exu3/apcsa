public class Main{
  public static void main(String[] args) {
    //We are going to practice some loop writing today using for loops, while loops, and print statements

    //To print, use either System.out.print OR System.out.println

    //From class - for loop syntax:
    //for(initialization; conditional statement; increment/change)
    
    //Complete the following challenges using BOTH a for loop and a while loop

    //1 - print all the integers 1 - 10, inclusive of both
    for (int i = 1; i<=10; i++) {
      System.out.println(i);
    }

    //2 - print all the even integers between 1 and 1001
    for (int x=2; x<=100; x+=2) {
      System.out.println(x);
    }

    //3 - print all numbers divisible by 3, starting at 99, going from largest to smallest.
    for (int n = 99; n%3 == 0 && n>=3; n-- )
      System.out.println(n);
  }
}