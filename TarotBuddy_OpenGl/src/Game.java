import listener.Listener;
import org.newdawn.slick.*;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This Class is the Main Class for the new starting branch on OpenGl, This is the only branch being maintained.
 */

public class Game extends BasicGame {

    private Listener listen;
    private GameContainer gc;


    public Game(String gamename) {
        super(gamename);
    }

    public static void main(String[] args) {
        try {
            AppGameContainer appgc;
            appgc = new AppGameContainer(new Game("Tarot Buddy"));
            appgc.setDisplayMode(640, 480, false);
            appgc.setFullscreen(true);
            appgc.start();
        } catch (SlickException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        this.gc = gc;
        System.out.println();
    }

    @Override
    public void update(GameContainer gc, int i) throws SlickException {
        listen = new Listener(this, gc);
    }

    @Override
    public void render(GameContainer gc, Graphics g) throws SlickException {
        g.setColor(Color.green);
        g.drawString("Welcome to Tarot Buddy" , 0, gc.getHeight() / 2);
    }
}