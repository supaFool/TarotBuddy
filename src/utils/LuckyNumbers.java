package utils;

import java.util.Random;

/**
 * Created by supafool on 12/17/2014.
 */
public class LuckyNumbers {

    private int[] luckyNumbers;

    public int[] getLuckyNumbers(int how_many_numbers) {
        luckyNumbers = new int[how_many_numbers];
         for (int x = 0; x<how_many_numbers; x++) {
             luckyNumbers[x] = new Random().nextInt();
         }
        return luckyNumbers;
//         TEST
    }

}
