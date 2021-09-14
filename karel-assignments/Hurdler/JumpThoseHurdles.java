import kareltherobot.*;

public class JumpThoseHurdles {
	// This is the Robot we will use to jump the hurdless
	Robot hurdler = new Robot(1,1,Directions.East, 0);
	
	public static void main(String[] args) {
		new JumpThoseHurdles().start();
	}

	public void start() {
		loadWorld();
		int maxHeight = 0;
		int minWidth = 9999;
		while (hurdler.nextToABeeper() == false) {
			int w = findHurdle();
			int h = climbHurdle();
			clearHurdle();

			if (h > maxHeight) {
				maxHeight = h;
			}
			
			if (w < minWidth) {
				minWidth = w;
			}
		}
		System.out.println("The tallest hurdle is "+ maxHeight + " units tall.");
		System.out.println("The shortest distance between hurdles is " + minWidth + " units.");
		if (hurdler.nextToABeeper()) {
			System.out.println("yay 🎉");
		}
	}
	// for comparing the heights, set to variables, a recent height and a max height. the max 
	// height should update if the recent height is greater. return the max height at the end.

	public void turnRight() {
		hurdler.turnLeft();
		hurdler.turnLeft();
		hurdler.turnLeft();
	}

	/**
	 * This method assumes the Robot is named hurdler and is facing East
	 * This moves hurdler to the next wall (hurdle). It returns the number
	 * of moves it took to get to the hurdle
	 */
	private int findHurdle() {
		int distance = 0;
	
		while (hurdler.frontIsClear()) {
			hurdler.move();
			distance++;
		}
		// System.out.println("the distance is " + distance + " units");

		return distance;
	}
	/**
	 * This method assume2s the Robot is named hurdler, is facing East and
	 * is at the base of the hurdle. 
	 * This moves the Robot to the top of the hurdle so that it can clear
	 * the wall.  
	 * @return The number of steps to get above the hurdle (height)
	 */
	private int climbHurdle() {
		int height = 0;
	
		while (hurdler.frontIsClear() == false) {
			hurdler.turnLeft();
			hurdler.move();
			turnRight();
			height++;
		}
		if (hurdler.frontIsClear()) {
			hurdler.move();
		}
		
		// System.out.println("the hurdle is " + height + " units tall");
		return height;
	}

	/** 
	 * Moves the Robot (hurdler) over the wall and moves it to the ground so 
	 * that the Robot has its back to the hurdle and is facing the next one.
	 */
	private void clearHurdle() {
		turnRight();
		while (hurdler.frontIsClear()) {
			hurdler.move();
		}
		hurdler.turnLeft();
		
	}

	private void loadWorld() {
		// line below "hardcodes" this to use one specific world
		// it would be better to ask the user...
		String worldName = "worldd.wld";
		World.readWorld(worldName);
		World.setVisible(true);
		World.setDelay(0);
	}

}
