package profile;

import javafx.scene.image.Image;

import java.util.GregorianCalendar;

/**
 * User: Erick
 * Date: 9/18/13
 * Time: 2:23 AM
 */
public class AstroSign {

    public enum Quaternaries {
        CARDINAL, FIXED, MUTABLE
    }

    public enum Element {
        EARTH, FIRE, AIR, WATER
    }

    private GregorianCalendar date;

    private String NO_HOR_SET = "You do not currently have a saved sign";

    /**
     * String Arrays of all names
     */
    protected String[] signsText = new String[]{
            "Aries",
            "Taurus",
            "Gemini",
            "Cancer",
            "Leo",
            "Virgo",
            "Libra",
            "Scorpio",
            "Sagittarius",
            "Capricorn",
            "Aquarius",
            "Pisces"
    };

    protected String[] birthYearRange = new String[]{
            "March 21 to April 19",
            "April 20 to May 20",
            "May 21 to June 21",
            "June 22 to July 22",
            "July 23 to August 22",
            "August 23 to September 22",
            "September 23 to October 23",
            "October 24 to November 22",
            "November 23 to December 21",
            "December 22 to January 19",
            "January 20 to February 18",
            "February 19 to March 20"
    };

    //Char of each sign
    protected String[] CHARACTERISTICS = new String[]{
            "Dynamic, Adventurous, Courageous, Confident, Energetic, Selfish, Impatient, Impulsive and Aggressive",
            "Patient, Reliable, Persistent, Loving, Possessive, Inflexible, Resentful and Greedy",
            "Communicative, Versatile, Intellectual, Alert, Witty, Inconsistent, Nervous and Superficial",
            "Emotional, Loving, Sensitive, Protective, Moody, Touchy, Overemotional and Changeable",
            "Creative, Generous, Faithful, Loving, Dramatic, Intolerant, Bossy and Dogmatic",
            "Modest, Reliable, Intelligent, Practical, Overcritical, Perfectionist, Worrier and Conservative",
            "Diplomatic, Impartial, Impartial, with Balance, Indecisive, Discontent, Gullible and Changeable",
            "Determined, Emotional, Passionate, Magnetic, Cruel, Compulsive, Jealous and Secretive",
            "Expansive, Wise, Optimist, Freedom-loving, Blindly Optimistic, Irresponsible, Superficial and Restless",
            "Responsible, Ambitious, Prudent, Patient, Rigid, Fearful, Pessimist and Fatalist",
            "Friendly, Loyal, Honest, Independent, Unemotional, Detached, Perverse and Unpredictable",
            "Compassionate, Spiritual, Emotional, Intuitive, Idealistic, Secretive, Vague and Weak-willed"
    };


    /**
     * int to get from arrays
     */
    public static int
            ARIES = 0,
            TAURUS = 1,
            GEMINI = 2,
            CANCER = 3,
            LEO = 4,
            VIRGO = 5,
            LIBRA = 6,
            SCORPIO = 7,
            SAGITTARIUS = 8,
            CAPRICORN = 9,
            AQUARIUS = 10,
            PISCES = 11;

    private int sign = 100;

    private Quaternaries quat;
    private Element element;

    public AstroSign(int sign) {
        this.sign = sign;

        //Categorize Quats
        if (sign == ARIES || sign == CANCER || sign == CAPRICORN || sign == LIBRA) {
            quat = Quaternaries.CARDINAL;
        }
        if (sign == TAURUS || sign == LEO || sign == SCORPIO || sign == AQUARIUS) {
            quat = Quaternaries.FIXED;
        }
        if (sign == GEMINI || sign == VIRGO || sign == SAGITTARIUS || sign == PISCES) {
            quat = Quaternaries.MUTABLE;
        }

        //Categorize Elements
        if (sign == ARIES || sign == LEO || sign == SAGITTARIUS) {
            element = Element.FIRE;
        }

        if (sign == TAURUS || sign == VIRGO || sign == CAPRICORN) {
            element = Element.EARTH;
        }

        if (sign == GEMINI || sign == LIBRA || sign == AQUARIUS) {
            element = Element.AIR;
        }

        if (sign == CANCER || sign == SCORPIO || sign == PISCES) {
            element = Element.WATER;
        }

    }

    public String getCharacteristics() {
        return CHARACTERISTICS[sign];
    }

    public String getCharacteristics(int sign) {
        return CHARACTERISTICS[sign];
    }

    public String getId() {
        if (sign == 100) {
            return NO_HOR_SET;
        } else {
            return signsText[sign];
        }
    }

    public String getId(int sign) {
        return signsText[sign];
    }

    public Image getZodiacImage() {
        Image i = new Image("profile/zodiacimages/" + signsText[sign] + ".png");
        return i;
    }

    public Image getZodiacImage(int sign) {
        Image i = new Image("profile/zodiacimages/" + signsText[sign] + ".png");
        return i;
    }

    private String[] loveSigns = new String[]{
            "Fire and Air signs – Aries, Gemini, Leo, Libra, Sagittarius and Aquarius",
            "Earth and Water signs – Taurus, Cancer, Virgo, Scorpio, Capricorn and Pisces",
            "Air and Fire signs – Aries, Gemini, Leo, Libra, Sagittarius and Aquarius",
            "Water and Earth signs – Taurus, Cancer, Virgo, Scorpio, Capricorn and Pisces",
            "Fire and Air signs – Aries, Gemini, Leo, Libra, Sagittarius and Aquarius",
            "Earth and Water signs – Taurus, Cancer, Virgo, Scorpio, Capricorn and Pisces",
            "Air and Fire signs – Aries, Gemini, Leo, Libra, Sagittarius and Aquarius",
            "Water and Earth signs – Taurus, Cancer, Virgo, Scorpio, Capricorn and Pisces",
            "Fire and Air signs – Aries, Gemini, Leo, Libra, Sagittarius and Aquarius",
            "Earth and Water signs – Taurus, Cancer, Virgo, Scorpio, Capricorn and Pisces",
            "Air and Fire signs – Aries, Gemini, Leo, Libra, Sagittarius and Aquarius",
            "Water and Earth signs – Taurus, Cancer, Virgo, Scorpio, Capricorn and Pisces"
    };

    /**
     * @return the String of the current quat
     */
    public String getQuatString() {
        if (quat == Quaternaries.FIXED) {
            return "Fixed";
        }
        if (quat == Quaternaries.MUTABLE) {
            return "Mutable";
        }
        if (quat == Quaternaries.CARDINAL) {
            return "Cardinal";
        } else {
            return NO_HOR_SET;
        }
    }

    public Quaternaries getQuat() {
        return quat;
    }

    public Element getElement() {
        return element;
    }

    public String getBirthYearString() {
        return birthYearRange[sign];
    }

    public String getBirthYearString(int sign) {
        return birthYearRange[sign];
    }
}
