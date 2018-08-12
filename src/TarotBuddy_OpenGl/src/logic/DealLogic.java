package logic;

import entity.Card;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

import java.util.ArrayList;

/**
 * Created by supaFool on 8/12/2018.
 */
public class DealLogic {
    private CardLogic cardLogic;
    private SpreadLogic spreadLogic;
    private int how_many_cards_to_deal;
    private ArrayList<Integer> card_numbers;
    private ArrayList<Card> cards;

    public DealLogic(int how_many_cards_to_deal) {
        this.how_many_cards_to_deal = how_many_cards_to_deal;
        init();
    }

    private void init(){
        cardLogic = new CardLogic();
        spreadLogic = new SpreadLogic(how_many_cards_to_deal);
        cards = new ArrayList<>(how_many_cards_to_deal);

        card_numbers = spreadLogic.getCards_in_spread();

        for (int i = 0; i < how_many_cards_to_deal; i++) {
            String meaning = cardLogic.getCARD_MEANINGS(card_numbers.get(i));
            String title = cardLogic.getCARD_TITLE(card_numbers.get(i));
            Image image = cardLogic.getCardImage(card_numbers.get(i));
            Card c = new Card(title,meaning,card_numbers.get(i).toString(), image);
            cards.add(i, c);
        }
    }

    public void render(Graphics g){
        float x = 10;
        for (Card c :
                cards) {
            g.drawImage(c.getImage(),x += c.getImage().getWidth() , 100);
        }
    }
}
