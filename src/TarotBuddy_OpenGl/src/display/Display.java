package display;

import logic.CardLogic;
import logic.SpreadLogic;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

import java.util.Random;

/**
 * Created by supaFool on 7/27/2018.
 */
public class Display {
    float currentX;
    float currentY;
    int counter = 0;
    float speed = 0.75f;
    float scale = 1f;
    Shape shape;
    Random r;
    GameContainer gc;

    CardLogic logic;



    public Display(GameContainer gc) {
        this.gc = gc;
        init();
    }

    private void init() {
        currentX = 0;
        currentY = 0;
        r = new Random();
        logic = new CardLogic();
        shape = new Rectangle(currentX, currentY, logic.getCardImage(15).getWidth(), logic.getCardImage(15).getHeight());

    }

    /**
     * Class responsible for rendering everything
     *
     * @param g Graphics Context
     */
    public void render(Graphics g) {
        counter++;
        currentX += speed;
        currentY += speed;

        g.drawImage(logic.getCardImage(18).getScaledCopy(scale), gc.getWidth() /2, currentY);
        new SpreadLogic(10,1,1);
    }
}
