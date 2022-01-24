package brain;

import java.util.ArrayList;

import actor.BlockedLocation;
import actor.BotBrain;
/**
 * @author Keldo
 */
import actor.GameObject;
import actor.Rock;
import actor.Wall;
import grid.Location;
public class Traveller extends BotBrain{
    public int chooseAction() {
        return getMove();
    }

    private int getMove() {
        int result = -1;
        Location myLoc = new Location(getRow(), getCol());
        
        for(int dir=0; dir<360; dir+=45) //loop through the 8 directions
        {
            Location next = myLoc.getAdjacentLocation(dir);
            if(next.isValidLocation() && !(getArena()[next.getRow()][next.getCol()] instanceof BlockedLocation))
                result = dir;  
        }
        
        return result;
    }
}
