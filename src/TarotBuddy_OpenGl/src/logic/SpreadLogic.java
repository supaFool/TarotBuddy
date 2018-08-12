package logic;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by supaFool on 8/12/2018.
 */
public class SpreadLogic {
    private int amount_in_spread;
    private int card_width;
    private int card_height;
    private ArrayList<Integer> cards_in_spread;

    public SpreadLogic(int amount_in_spread, int card_width, int card_height) {
        this.amount_in_spread = amount_in_spread;
        this.card_width = card_width;
        this.card_height = card_height;

        init();

        loadSpread();
    }

    private void init(){
        cards_in_spread = new ArrayList<>();
    }

    public int getAmount_in_spread() {
        return amount_in_spread;
    }

    public int getCard_width() {
        return card_width;
    }

    public int getCard_height() {
        return card_height;
    }

    private void loadSpread(){
        Random r = new Random();
        for (int i = 0; i < amount_in_spread; i++) {
            cards_in_spread.add(i, r.nextInt(78));
            System.out.println(cards_in_spread.get(i));
        }
        System.out.println("----------------------------------------------");
    }

//    public abstract void renderSpread();
}
