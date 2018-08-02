package display;

import card.CardData;
import logic.CardLogic;
import org.newdawn.slick.*;
import org.newdawn.slick.geom.Polygon;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

/**
 * Created by supaFool on 7/27/2018.
 */
public class Display {
    float currentX;
    float currentY;
    Image i;



    public Display(GameContainer gc) {
        init();
    }

    private void init(){
        currentX = 10;
        currentY = 0;
        try {
            i = new Image("card/image/decks/1910/1.jpg");
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

    public void render(Graphics g){
        currentX += 0.05;
        currentY += 0.05;
//        g.draw(new Rectangle(currentX,currentY,10,10));
//        g.drawGradientLine(0.5f,1f,0.5f,1f,.32f,1f,125f *3,125f *3,0.75f,0.2f,0.8f,1);
        g.drawImage(i, currentX,currentY);
        g.setColor(Color.red);
        g.drawOval(currentX,currentY, 5, 5);
    }
}
