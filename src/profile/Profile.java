package profile;

import java.util.GregorianCalendar;

/**
 * User: Erick
 * Date: 9/18/13
 * Time: 2:13 AM
 */
public class Profile {

    public enum Rating {
        NOVICE, MASTER
    }

    private Rating rating;

    private int cardAmount = 78;

    private int cardsKnown = 0;

    private String name = null;
    private GregorianCalendar birthday = null;
    private AstroSign sign = null;
    private int luckyNumber = 0;
    private int favCard = 100;
    private int unluckyNum = 0;


    public Profile(String name) {
        if (name == null) {
            this.name = name;
            rating = Rating.NOVICE;
            initProfile();
        } else {
            System.out.println("Name already exists");
        }


    }


    private void initProfile() {
        birthday = new GregorianCalendar();

    }
}
