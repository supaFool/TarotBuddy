import display.Display;
import listener.Listener;
import logic.CardLogic;
import org.newdawn.slick.*;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This Class is the Main Class for the new starting branch on OpenGl, This is the only branch being maintained.
 */

public class Game extends BasicGame {

//    SETTINGS
    private static boolean isFullScreen = true;
    private static boolean isVSync = false; //Causing FPS to stay at 30FPS?

    private Listener listen;
    private Display display;
    private CardLogic logic;


    public Game(String gamename) {
        super(gamename);
    }

    public static void main(String[] args) {
        try {
            AppGameContainer appgc;
            appgc = new AppGameContainer(new Game("Tarot Buddy"));
            appgc.setDisplayMode(appgc.getScreenWidth(), appgc.getScreenHeight(), isFullScreen);
            appgc.setTargetFrameRate(60);
            appgc.setVSync(isVSync);
            appgc.setMultiSample(3);
            appgc.start();
        } catch (SlickException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        this.listen = new Listener();
        this.display = new Display(gc);
    }

    @Override
    public void update(GameContainer gc, int i) throws SlickException {
        listen.listen(gc);
    }

    @Override
    public void render(GameContainer gc, Graphics g) throws SlickException {
        display.render(g);
    }
    private void loadSpecialScene(AppGameContainer appgc){
        appgc.setTitle("Testing");
        System.out.println("For you enjoyment we now do a what if");

    }
}