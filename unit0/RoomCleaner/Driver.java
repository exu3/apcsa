// import javax.swing.JOptionPane;

import kareltherobot.*;
import java.util.Scanner;

public class Driver implements Directions {
// declared here so it is visible in all the methods!! 
// It will be assigned a value in the getInfo method
	Robot roomba; 
	int roomCols = 0;
	int roomRows = 0;
	int roomSize = 0;
	int sumBeepers = 0;
	int beeperPiles = 0;
	int locLargestPile = 0;

	// You will add very many variables!!

	// set row and column row++ and row-- depending on the direction
	// the robot is moving in
	// store row and column number of the biggest pile int he if (#> big) statement
	
	public static void main(String[] args) {
		// LEAVE THIS ALONE!!!!!!
		Driver d = new Driver();
		d.getInfo();
		d.scanRoom();
		// d.cleanRoom();
		d.collectBeeper();
		d.displayResults();
	}

	public void turnRight() {
		roomba.turnLeft();
		roomba.turnLeft();
		roomba.turnLeft();
	}

	// move in a snake pattern around the room
	// check if the front is clear before each turn/move/turn so it doesn't crash into the wall
	private int scanRoom() {
		
		while (roomba.frontIsClear()) {

			while (roomba.frontIsClear()) {
				roomba.move();
				collectBeeper();
				roomCols++;
			}

			turnRight();

			if (roomba.frontIsClear()) {
				System.out.println("The front is clear, let's moooove");
				roomba.move();
				roomRows++;
				turnRight();
			} 

			while (roomba.frontIsClear()) {
				roomba.move();
				collectBeeper();
				roomCols++;
			}

			roomba.turnLeft();

			if (roomba.frontIsClear()) {
				System.out.println("The front is clear, let's moooove");
				roomba.move();
				roomba.turnLeft();
			}
	}
		roomSize = roomCols * roomRows;
		return roomSize;
	}



	// if the robot is next to a beeper, collect them until there are none left
	private int collectBeeper() {
		
		// int largestPile = 0;
		pileCounter();
		if (roomba.nextToABeeper()) {
			while (roomba.nextToABeeper()) {
				roomba.pickBeeper();
				sumBeepers++;
			}
		}
		return sumBeepers;
	}

	private int pileCounter() {
		if (roomba.nextToABeeper()) {
			System.out.println("yeeeeet it's a new beeper pile");
			beeperPiles++;
		}
		return beeperPiles;
	}


	/**
	 * This method gets info from the user in the following order: 
	 * 1. Ask the user
	 * which world file they wish to process. Right now, that world file name is
	 * hardcoded in. 
	 * 2. Ask the user for the starting location and direction of the
	 * Robot. A new Robot should be constructed and assigned to the global
	 * (instance) variable named roomba that is declared on line 10.
	 * 
	 * An inelegant way to interact with the user is via the console, using
	 * System.out.println and a Scanner that scans System.in (input from the
	 * console). A more elegant way to get user input might include using a
	 * JOptionPane.
	 */
	private void getInfo() {
		// int yPosition = 11;
		// int xPosition = 6;
		// robot should start at 100, 4 for test world

		// takes user input for x and y starting coordinates
		Scanner myObj = new Scanner(System.in);
		int xCoordinate;	
		System.out.println("Enter x coordinate"); // Enter coordinate and press Enter
		xCoordinate = myObj.nextInt();     
		System.out.println("x coordinate is: " + xCoordinate);

		int yCoordinate;	
		System.out.println("Enter y coordinate"); // Enter coordinate and press Enter
		yCoordinate = myObj.nextInt();     
		System.out.println("y coordinate is: " + yCoordinate);

		int xPosition = xCoordinate;
		int yPosition = yCoordinate;

		roomba = new Robot(yPosition, xPosition, Directions.East, 0);
		String wrldName = "basicRoom.wld";

		World.readWorld(wrldName);
		World.setVisible(true);
		World.setDelay(10);

	}

	/** This method will have all the logic that takes the Robot to every location 
	 * and cleans up all piles of beepers.  Think about ways you can break this
	 * large, complex task into smaller, easier to solve problems.
	 */
	private void cleanRoom() {
		// the line below causes a null pointer exception
		// what is that and why are we getting it?
		roomba.move();

		// obviously, lots more here
	}

	/** This method displays the results of cleaning the room.  All of the info
	 * in the pdf that describes the problem need to be displayed.  You can present
	 * this info in the console (boring) or you can present using JOptionPane (cool!)
	 */
	private void displayResults() {
		int avg = sumBeepers / beeperPiles;
		// int percentDirty = beeperPiles / roomSize;
		
		System.out.println(" The biggest pile was ");
		System.out.println(" The area of the room is " + roomSize + " square units");
		System.out.println("✅ The total number of piles is " + beeperPiles + " piles");
		System.out.println("✅ The total number of beepers is " + sumBeepers);
		System.out.println(" The location of the largest pile is ");
		System.out.println("✅ The average pile size is " + avg);
		System.out.println("The percentage of dirty piles is " + "placeholder");
	}

}

// Information to return to the user
// • Area of room
// • Number of piles
// • Total number of beepers
// • Largest pile of beepers
// • Location (relative) of the largest pile
// • average pile size
// • percent dirty (piles/area)
