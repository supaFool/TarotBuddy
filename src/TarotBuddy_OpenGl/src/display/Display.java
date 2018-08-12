package display;

import logic.DealLogic;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

/**
 * Created by supaFool on 7/27/2018.
 */
public class Display {
    float currentX;
    float currentY;
    int counter = 0;
    float speed = 0.75f;
    float scale = 1f;
    GameContainer gc;


    DealLogic deal;

    public Display(GameContainer gc) {
        this.gc = gc;
        init();
    }

    private void init() {
        currentX = 0;
        currentY = 0;
        deal = new DealLogic(4);
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

        deal.render(g);
    }
}
