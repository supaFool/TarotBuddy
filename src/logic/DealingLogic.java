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
import javafx.scene.image.ImageView;

import java.util.HashSet;
import java.util.Random;

/**
 * This Class is used to Deal Cards
 */
public class DealingLogic {
    //Fade effect vars
    private Timeline cardFadeAnimation;


    // Holds the card images that are going to be shown in spread
    private HashSet<TarotCard> spreadCards;
    private HashSet<ImageView> views;

    //card numbers
    private int[] cardNumbers;

    // How many cards to getCards
    private int amountToDeal = 0;

    //Should cards be inverted
    private boolean isInverted = false;

    public DealingLogic(int amountToDeal, HashSet<ImageView> views, boolean inverted) {
        this.amountToDeal = amountToDeal;
        this.views = views;
        isInverted = inverted;

        //Init card array
        spreadCards = new HashSet();

        //init card numbers
        cardNumbers = new int[amountToDeal];

    }
    //Constructor END//

    public Image[] getCards() {
        //todo Finish
        Image[] image = new Image[amountToDeal];
        Random r = new Random();
        ImageView v = views.iterator().next();

        for (int i = 0; i < amountToDeal; i++) {


            TarotCard card = new TarotCard(r.nextInt(77), false);

            //Make sure card is not already drawn
            if (spreadCards.contains(card)) {
                card = new TarotCard(r.nextInt(77), false);
            }

            if (views.iterator().hasNext()) {
                v = views.iterator().next();
            } else {
                System.out.println("HashSet is empty");
            }

        }
        int ii = 0;
        for (TarotCard c : spreadCards) {
            image[ii] = c.getImage();
            ii++;
        }

        return image;
    }

    //Create animation
    public void initAnimation() {

        for (TarotCard im : spreadCards) {

        }

    }


    // Shows the card, animation should be played here
    public void showCard(int cardToShow) {


        //Play animation
        cardFadeAnimation.play();
    }
}
