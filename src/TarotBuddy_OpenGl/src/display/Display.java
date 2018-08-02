package display;

import card.CardData;
import logic.CardLogic;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Polygon;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

/**
 * Created by supaFool on 7/27/2018.
 */
public class Display {
    private Graphics g;
    private String currentText;
    private GameContainer gc;
    float currentX;
    float currentY;



    public Display(GameContainer gc) {
        this.gc = gc;
    }

    private void init(){
        currentX = 10;
        currentY = 0;
    }

    public void render(Graphics g){
        currentX += 0.05;
        currentY += 0.05;
        g.draw(new Rectangle(currentX,currentY,10,10));
        g.drawGradientLine(0.5f,1f,0.5f,1f,.32f,1f,125f *3,125f *3,0.75f,0.2f,0.8f,1);
    }
}
