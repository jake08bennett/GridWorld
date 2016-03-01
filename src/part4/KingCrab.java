
package part4;

import java.util.ArrayList;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;

public class KingCrab extends CrabCritter
{
	public void processActors (ArrayList<Actor> actors)
	{
		ArrayList<Location> locations = new ArrayList<Location>();
		for(Actor actor : actors)
		{
			actor.setDirection(actor.getLocation().getDirectionToward(getLocation()));
			actor.setDirection(actor.getDirection()+Location.HALF_CIRCLE);
			
			locations.add(actor.getLocation());
			Location next = actor.getLocation().getAdjacentLocation(actor.getDirection());
			
			
			if(getGrid().isValid(next))
				actor.moveTo(next);
			else
				actor.removeSelfFromGrid();
		}
	}
}