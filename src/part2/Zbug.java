
package part2;

import info.gridworld.actor.Bug;

public class Zbug extends Bug {
	private int sideLength;
	private boolean Zdone = false;


	public Zbug(int length) {
		sideLength = length;
	}

	
	public void act() {
		if (!Zdone) {
			this.setDirection(90);
			for (int i = 0; i < sideLength; i++) {
				move();
			}
			this.turn();
			this.turn();
			this.turn();
			for (int i = 0; i < sideLength; i++) {
				move();
			}
			this.turn();
			this.turn();
			this.turn();
			this.turn();
			this.turn();
			for (int i = 0; i < sideLength; i++) {
				move();
			}
			
			Zdone = true;
		}
	}

}