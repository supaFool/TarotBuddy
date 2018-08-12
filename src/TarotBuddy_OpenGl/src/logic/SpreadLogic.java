package logic;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by supaFool on 8/12/2018.
 */
public class SpreadLogic {
    private int amount_in_spread;
    private ArrayList<Integer> cards_in_spread;

    public SpreadLogic(int amount_in_spread) {
        this.amount_in_spread = amount_in_spread;

        init();

        populateSpread();
    }

    private void init(){
        cards_in_spread = new ArrayList<>();
    }

    public int getAmount_in_spread() {
        return amount_in_spread;
    }

    public ArrayList<Integer> getCards_in_spread() {
        return cards_in_spread;
    }

    private void populateSpread(){
        Random r = new Random();
        for (int i = 0; i < amount_in_spread; i++) {
            cards_in_spread.add(i, r.nextInt(78));
        }
    }

}
