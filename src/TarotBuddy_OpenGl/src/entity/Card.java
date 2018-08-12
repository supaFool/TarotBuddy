package entity;

import org.newdawn.slick.Image;

/**
 * Created by supaFool on 8/12/2018.
 */
public class Card {
    private String title;
    private String meaning;
    private String number;
    private Image image;

    public Card(String title, String meaning, String number, Image image) {
        this.title = title;
        this.meaning = meaning;
        this.number = number;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public String getMeaning() {
        return meaning;
    }

    public String getNumber() {
        return number;
    }

    public Image getImage() {
        return image;
    }
}
