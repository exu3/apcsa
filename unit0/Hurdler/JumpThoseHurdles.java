import kareltherobot.*;

public class JumpThoseHurdles {
	// This is the Robot we will use to jump the hurdles
	Robot hurdler = new Robot(1,1,Directions.East, 0);
	
	public static void main(String[] args) {
		new JumpThoseHurdles().start();
	}

	public void start() {
		loadWorld();
		// hardcoded do three hurdles for now
		for (int i = 1; i<=3; i++) {
		int w = findHurdle();
		int h = climbHurdle();
		clearHurdle();
		}
		
	}


	/**
	 * This method assumes the Robot is named hurdler and is facing East
	 * This moves hurdler to the next wall (hurdle). It returns the number
	 * of moves it took to get to the hurdle
	 */
	private int findHurdle() {
	
		while (hurdler.frontIsClear()) {
			hurdler.move();
		}

		return 0;
	}
	/**
	 * This method assume2s the Robot is named hurdler, is facing East and
	 * is at the base of the hurdle. 
	 * This moves the Robot to the top of the hurdle so that it can clear
	 * the wall.  
	 * @return The number of steps to get above the hurdle (height)
	 */
	private int climbHurdle() {
	
		while (hurdler.frontIsClear() == false) {
			hurdler.turnLeft();
			hurdler.move();
			hurdler.turnLeft();
			hurdler.turnLeft();
			hurdler.turnLeft();
		}
		if (hurdler.frontIsClear()) {
			hurdler.move();
		}
	
		return 0;
	}

	/** 
	 * Moves the Robot (hurdler) over the wall and moves it to the ground so 
	 * that the Robot has its back to the hurdle and is facing the next one.
	 */
	private void clearHurdle() {
		hurdler.turnLeft();
		hurdler.turnLeft();
		hurdler.turnLeft();
		while (hurdler.frontIsClear()) {
			hurdler.move();
		}
		hurdler.turnLeft();
		
	}

	private void loadWorld() {
		// line below "hardcodes" this to use one specific world
		// it would be better to ask the user...
		String worldName = "worlda.wld";
		World.readWorld(worldName);
		World.setVisible(true);
		World.setDelay(20);
	}

}
