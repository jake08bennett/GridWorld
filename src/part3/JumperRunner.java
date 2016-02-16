package part3;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.*;
import info.gridworld.grid.Location;

public class JumperRunner {
	
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		JumpBug jake = new JumpBug();
		world.add(new Location(0,0), jake);
		world.show(); 

	}

}