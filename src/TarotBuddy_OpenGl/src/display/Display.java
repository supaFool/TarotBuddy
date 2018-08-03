package display;

import card.Card;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

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


    public Display(GameContainer gc) {
        init();
    }

    private void init() {
        currentX = 0;
        currentY = 0;
        card = new Card(6);
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

    }
}
