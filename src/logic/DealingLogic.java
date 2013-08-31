package logic;

/**
 * Created with IntelliJ IDEA.
 * User: Erick
 * Date: 8/31/13
 * Time: 4:54 AM
 */

import javafx.animation.Timeline;

import java.util.HashSet;

/**
 * This Class is used to Deal Cards
 */
public class DealingLogic {
    //Fade effect vars
    private Timeline cardFadeAnimation;


    // Holds the card images that are going to be shown in spread
    private HashSet spreadCards;

    // How many cards to deal
    private int amountToDeal = 0;

    //Should cards be inverted
    private boolean isInverted = false;

    public DealingLogic(int amountToDeal, boolean inverted) {
        this.amountToDeal = amountToDeal;
        isInverted = inverted;

        //Init card array
        spreadCards = new HashSet();

    }
    //Constructor END//

    public void deal() {
        //todo Finish


//        Random r = new Random();
//
//        int c1 = r.nextInt(77);
//        int c2 = r.nextInt(77);
//        int c3 = r.nextInt(77);
//
//        if (c1 == c2 || c1 == c3) {
//            do {
//                c1 = r.nextInt(77);
//                System.out.println("Changed c1");
//            } while (c1 == c2 || c1 == c3);
//        }
//
//        if (c2 == c1 || c2 == c3) {
//            do {
//                c2 = r.nextInt(77);
//                System.out.println("Changed c2");
//            } while (c2 == c3);
//        }
//
//
//
//        // Present Card
//        presentCard = new TarotCard(c1, g);
//
//        // if the group doesnt contain the card ten add it
//        if (!g.getChildren().contains(presentCard)) {
//            g.getChildren().add(presentCard);
//        } else {
//            // If the card is already in the spread, then choose another card
//            presentCard = new TarotCard(r.nextInt(77), g);
//            g.getChildren().add(presentCard);
//        }
//
//
//        // Past Card
//        pastCard = new TarotCard(c2, g);
//
//
//        // if the group doesnt contain the card ten add it
//        if (!g.getChildren().contains(pastCard)) {
//            g.getChildren().add(pastCard);
//        } else {
//            // If the card is already in the spread, then choose another card
//            pastCard = new TarotCard(r.nextInt(77), g);
//            g.getChildren().add(pastCard);
//        }
//
//
//        //Future Card
//        futureCard = new TarotCard(c3, g);
//
//
//        // if the group doesnt contain the card ten add it
//        if (!g.getChildren().contains(futureCard)) {
//            g.getChildren().add(futureCard);
//        } else {
//            // If the card is already in the spread, then choose another card
//            futureCard = new TarotCard(r.nextInt(77), futureCard);
//            g.getChildren().add(futureCard);
//        }
//
//        // Set the Layout for drawnCards
//        setFaceLayout();
//
//        //Randomize Rotaion
//        randomizeRotation();
//
//        //Set the backs
//        setBacks();
//
//        scRoot.getChildren().add(g);
    }

    // Shows the card, animation should be played here
    public void showCard(int cardToShow) {


        //Make animation
        cardFadeAnimation = new Timeline();


        //Play animation
        cardFadeAnimation.play();
    }
}
