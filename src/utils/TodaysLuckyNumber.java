package utils;

/**
 * Class to generate a single int as a lucky number for the day, Resets after 24 hours
 * <p>
 * Created by supafool on 12/17/2014.
 */
public class TodaysLuckyNumber extends LuckyNumbers {
    private int[] ln = getLuckyNumbers(1);

    public int[] getDaily_n() {
        return ln;
    }

    public void setDaily_n(int[] ln) {
        this.ln = ln;
    }
}
