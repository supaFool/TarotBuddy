package display;

import card.Card;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Circle;

import java.util.Random;

/**
 * Created by supaFool on 7/27/2018.
 */
public class Display {
    float currentX;
    float currentY;
    int counter = 0;
    float speed = 0.25f;
    Card card;
    Random r;


    public Display(GameContainer gc) {
        init();
    }

    private void init() {
        currentX = 0;
        currentY = 0;
        r = new Random();
    }

    /**
     * Class responsible for rendering everything
     *
     * @param g Graphics Context
     */
    public void render(Graphics g) {
        counter++;
        currentX += speed;
        currentY += speed / 2;

        g.draw(new Circle(currentX, currentY, 15, r.nextInt(5) + 1));
    }
}
