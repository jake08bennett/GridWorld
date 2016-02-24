package part4;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import java.util.ArrayList;


public class ChameleonKid extends ChameleonCritter {
	
	public void processActors(ArrayList<Actor> actors) {
		int front = getDirection();
		int behind = ((front >= 180) ? front - 180 : 360 - (180 -front));
	}
	
}
	