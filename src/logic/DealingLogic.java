package logic;

/**
 * Created with IntelliJ IDEA.
 * User: Erick
 * Date: 8/31/13
 * Time: 4:54 AM
 */

import card.TarotCard;
import javafx.animation.Timeline;
import javafx.scene.image.Image;

import java.util.HashSet;
import java.util.Random;

/**
 * This Class is used to Deal Cards
 */
public class DealingLogic {
    //Fade effect vars
    private Timeline cardFadeAnimation;


    // Holds the card images that are going to be shown in spread
    private HashSet<Image> spreadCards;

    //card numbers
    private int[] cardNumbers;

    // How many cards to getSpreadCardImages
    private int amountToDeal = 0;

    //Should cards be inverted
    private boolean isInverted = false;

    public DealingLogic(int amountToDeal, boolean inverted) {
        this.amountToDeal = amountToDeal;
        isInverted = inverted;

        //Init card array
        spreadCards = new HashSet();

        //init card numbers
        cardNumbers = new int[amountToDeal];

    }
    //Constructor END//

    public HashSet<Image> getSpreadCardImages() {
        //todo Finish


        Random r = new Random();

        //Get random numbers to call the cards with
        for (int card = 0; card < amountToDeal; card++) {
            Image image = TarotCard.getImageView(r.nextInt(77)).getImage();

            while (spreadCards.contains(image)) {
                image = TarotCard.getImageView(r.nextInt(77)).getImage();
            }
            spreadCards.add(image);

        }

        return spreadCards;
    }


    // Shows the card, animation should be played here
    public void showCard(int cardToShow) {


        //Make animation
        cardFadeAnimation = new Timeline();


        //Play animation
        cardFadeAnimation.play();
    }
}
