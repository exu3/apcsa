import kareltherobot.*;

public class Main implements Directions{
  public static void main(String[] args) {
    World.setVisible(true);// allows us to see the run

    // The line below creates a Robot that we will refer to as r.  
    // Find out what the numbers and direction do!
    Robot r = new Robot(2,8,East,9);
		
    // examples of commands you can invoke on a Robot
    r.move();// move one step in the direction it is facing
    r.turnLeft();
    r.putBeeper();
    r.move();
	r.putBeeper();

  }
}