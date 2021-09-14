import kareltherobot.*;

public class Main implements Directions{
  public static void main(String[] args) {
    World.setVisible(true); // allows us to see the run
    World.setDelay(1); // makes it hella fast yeet

    Robot quadrant1 = new Robot(5,9,North,6);
    Robot quadrant2 = new Robot(9,5,West,6);
    Robot quadrant3 = new Robot(5,1,South,6);
    Robot quadrant4 = new Robot(1,5,East,6);
		
   
    quadrant4.putBeeper();
    quadrant4.move();// move one step in the direction it is facing
    quadrant4.turnLeft();
    quadrant4.move();
    quadrant4.putBeeper();

    for (int i = 0; i<3; i++) {
      quadrant4.turnLeft();
      quadrant4.turnLeft();
      quadrant4.turnLeft();
      quadrant4.move();
      quadrant4.turnLeft();
      quadrant4.move();
      quadrant4.putBeeper();
    }

    // quadrant1 code (copy pasted from above)
    quadrant1.putBeeper();
    quadrant1.move();
    quadrant1.turnLeft();
    quadrant1.move();
    quadrant1.putBeeper();

    for (int i = 0; i<3; i++) {
      quadrant1.turnLeft();
      quadrant1.turnLeft();
      quadrant1.turnLeft();
      quadrant1.move();
      quadrant1.turnLeft();
      quadrant1.move();
      quadrant1.putBeeper();
    }

    //quadrant2
    quadrant2.putBeeper();
    quadrant2.move();
    quadrant2.turnLeft();
    quadrant2.move();
    quadrant2.putBeeper();

    for (int i = 0; i<3; i++) {
      quadrant2.turnLeft();
      quadrant2.turnLeft();
      quadrant2.turnLeft();
      quadrant2.move();
      quadrant2.turnLeft();
      quadrant2.move();
      quadrant2.putBeeper();
    }

    //quadrant3
    quadrant3.putBeeper();
    quadrant3.move();
    quadrant3.turnLeft();
    quadrant3.move();
    quadrant3.putBeeper();
 
    for (int i = 0; i<3; i++) {
      quadrant3.turnLeft();
      quadrant3.turnLeft();
      quadrant3.turnLeft();
      quadrant3.move();
      quadrant3.turnLeft();
      quadrant3.move();
      quadrant3.putBeeper();
    }
    
  }
}