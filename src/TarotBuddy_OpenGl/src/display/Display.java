package display;

import card.CardData;
import logic.CardLogic;
import org.newdawn.slick.*;
import org.newdawn.slick.geom.Polygon;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

import java.util.Random;

/**
 * Created by supaFool on 7/27/2018.
 */
public class Display {
    float currentX;
    float currentY;
    Image i;
    int counter = 0;



    public Display(GameContainer gc) {
        init();
    }

    private void init(){
        currentX = 10;
        currentY = 0;

    }

    /**
     * Class responsible for rendering everything
     *
     * @param g Graphics Context
     */
    public void render(Graphics g){
        counter ++;
        currentX += 0.05;
        currentY += 0.05;
//        g.draw(new Rectangle(currentX,currentY,10,10));

        g.drawGradientLine(0.5f,1f,0.5f,1f,.32f,1f,125f *3,125f *3,0.75f,0.2f,0.8f,1);
        try {
            Random r = new Random();
            i = new Image("card/image/decks/1910/"+ r.nextInt(78) +".jpg");
            g.drawImage(i,currentX,currentY );
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
