package display;

import card.CardData;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

/**
 * Created by supaFool on 7/27/2018.
 */
public class Display {
    private Graphics g;
    private String currentText;
    private GameContainer gc;

    public Display(GameContainer gc) {
        this.gc = gc;
    }

    private void init(){

    }

    public void render(Graphics g){
//        g.drawString(CardData.getCardMeaning(40), gc.getWidth() / 2, gc.getHeight() / 2);
    }
}
