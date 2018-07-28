package listener;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;

/**
 * Created by supaFool on 7/23/2018.
 */
public class Listener {
    private Input input;
    public Listener(BasicGame game, GameContainer gc) {
        input = gc.getInput();
        System.out.println("Listener Called");
        if (input.isKeyPressed(Input.KEY_ESCAPE)){
            System.exit(0);
        }
    }
}
