package listener;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;

/**
 * Created by supaFool on 7/23/2018.
 */
public class Listener {
    public Listener() {
    }

    public void listen(GameContainer gc) {
        if(gc.getInput().isKeyPressed(Input.KEY_ESCAPE)) System.exit(0);
    }
}
