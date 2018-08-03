package card;

import org.newdawn.slick.Image;

/**
 * Created by supaFool on 8/2/2018.
 */
public class Card {
    private int card_id;
    private Image card_image;
    private String meaning;
    private String title;


    public Card(int ID) {
        this.card_id = ID;
        System.out.println(getCard_id());
    }

    public int getCard_id() {
        return card_id;
    }

    public Image getCard_image() {
        return card_image;
    }

    public String getMeaning() {
        return meaning;
    }

    public String getTitle() {
        return title;
    }
}
