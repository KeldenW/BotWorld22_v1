package brain;

import java.util.ArrayList;

import actor.BotBrain;
import actor.GameObject;
import actor.Scissors;
import grid.Location;
import grid.RatBotsGrid;
import gui.RatBotsArena;
import world.BotWorld;

public class ScissorsHunter extends BotBrain {
    public int chooseAction() {

    }

    public Location whereWillClosestScissorsBeIn(int steps) {
        BotWorld b = new BotWorld();

        for (Scissors s: getScissors(getArena())) {
            b.add(s);
        }

        for (int i=0; i<steps; i++) {
            b.step();
        }

        getScissors(b.getArena());
    }



    private ArrayList<Scissors> getScissors(GameObject[][] arena) {
        ArrayList<Scissors> arr = new ArrayList<Scissors>();
        for (GameObject[] a: arena) {
            for (GameObject g: a) {
                if (g instanceof Scissors) {
                    arr.add((Scissors)g);
                }
            }
        }
        return arr;
    }

    private ArrayList<Scissors> getScissors(RatBotsArena arena) {
        ArrayList<Scissors> arr = new ArrayList<Scissors>();
        for (GameObject[] a: arena.) {
            for (GameObject g: a) {
                if (g instanceof Scissors) {
                    arr.add((Scissors)g);
                }
            }
        }
        return arr;
    }
    
}
