import kareltherobot.*;

public class JumpThoseHurdles {
	// This is the Robot we will use to jump the hurdles
	Robot hurdler = new Robot(1,1,Directions.East, 0);
	
	public static void main(String[] args) {
		new JumpThoseHurdles().start();
	}

	public void start() {
		loadWorld();
		
		int w = findHurdle();
		int h = climbHurdle();
		clearHurdle();
		
	}

	/**
	 * This method assumes the Robot is named hurdler and is facing East
	 * This moves hurdler to the next wall (hurdle). It returns the number
	 * of moves it took to get to the hurdle
	 */
	private int findHurdle() {

		return 0;
	}
	/**
	 * This method assumes the Robot is named hurdler, is facing East and
	 * is at the base of the hurdle. 
	 * This moves the Robot to the top of the hurdle so that it can clear
	 * the wall.  
	 * @return The number of steps to get above the hurdle (height)
	 */
	private int climbHurdle() {
		
		return 0;
	}

	/** 
	 * Moves the Robot (hurdler) over the wall and moves it to the ground so 
	 * that the Robot has its back to the hurdle and is facing the next one.
	 */
	private void clearHurdle() {
		// TODO Auto-generated method stub
		
	}

	private void loadWorld() {
		// line below "hardcodes" this to use one specific world
		// it would be better to ask the user...
		String worldName = "worlda.wld";
		World.readWorld(worldName);
		World.setVisible(true);
		World.setDelay(5);
	}

}
