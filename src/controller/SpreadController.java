package controller;

import card.CardData;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.util.Duration;

import java.util.Random;


/**
 * Created with IntelliJ IDEA.
 * User: Erick
 * Date: 9/2/13
 * Time: 1:21 PM
 */
public class SpreadController {
    private Random r = new Random();

    private String pastPositionMeaning;
    private String presentPositionMeaning;
    private String futurePositionMeaning;


    private String[] meanings = new String[3];

    private int pastCardNumber = r.nextInt(77);
    private int presentCardNumber = r.nextInt(77);
    private int futureCardNumber = r.nextInt(77);

    //Wants help
    public static boolean help = true;
    public static ReadingController.DeckType deck;

    private boolean pastIsShowing = false;
    private boolean presentIsShowing = false;
    private boolean futureIsShowing = false;

    private boolean c1inverted = false;
    private boolean c2inverted = false;
    private boolean c3inverted = false;

    @FXML
    private ImageView past;

    @FXML
    private ImageView present;

    @FXML
    private ImageView future;


    @FXML
    private Text meaningTitle;

    @FXML
    private Text meaningText;

    private int counter = 0;

    public static boolean invert = true;

    public SpreadController() {

//        HashSet<ImageView> views = new HashSet<ImageView>();
//        views.add(past);
//        views.add(present);
//        views.add(future);
//        logic = new DealingLogic(3, views, false);
//        Image[] images = logic.getCards();
//        past.setImage(images[0]);
//        present.setImage(images[1]);
//        future.setImage(images[2]);


    }

    /**
     * flips over the Present Card
     */
    @FXML
    public void showPresentCard() {

    }

    /**
     * Checks to make sure the Present Card is showing,
     * then flips over Past Card
     */
    @FXML
    public void showPastCard() {

    }

    /**
     * Checks to make sure the Present and Past cards are showing,
     * then flips over Future Card
     */
    @FXML
    public void showFutureCard() {

    }

    @FXML
    public void showPresentMeaning() {
        if (presentIsShowing) {
            if (help) {
                try {
                    meaningTitle.setText(CardData.getCardTitle(presentCardNumber));
                    meaningText.setText(CardData.getCardMeaning(presentCardNumber));
                }catch (NullPointerException n){

                }
            }
        }
    }

    @FXML
    public void showPastMeaning() {
        if (pastIsShowing) {
            if (help) {
                try {
                    meaningTitle.setText(CardData.getCardTitle(pastCardNumber));
                    meaningText.setText(CardData.getCardMeaning(pastCardNumber));
                }catch (NullPointerException n){

                }
            }
        }
    }

    @FXML
    public void showFutureMeaning() {
        if (futureIsShowing) {
            if (help) {
                try {
                meaningTitle.setText(CardData.getCardTitle(futureCardNumber));
                meaningText.setText(CardData.getCardMeaning(futureCardNumber));
                }catch (NullPointerException n){

                }
            }
        }
    }

    /**
     * Done with Reading
     */
    @FXML
    public void done() {

        Stage.setStage(Stage.READING);

        //Reset everything for next time;
        past.setImage(null);
        present.setImage(null);
        future.setImage(null);

        //init cards for next time
        pastCardNumber = r.nextInt(77);
        presentCardNumber = r.nextInt(77);
        futureCardNumber = r.nextInt(77);
        counter = 0;


        past.setRotate(0);


        present.setRotate(-0);

        future.setRotate(-0);

        c1inverted = false;
        c3inverted = false;
        c2inverted = false;

        pastIsShowing = false;
        presentIsShowing = false;
        futureIsShowing = false;

        if (meaningText != null) {
            meaningText.setText(null);
            meaningTitle.setText(null);
        }
        Integer readingcounter = Integer.parseInt(LoginController.getProps().getProperty("spreads looked at"));
        readingcounter++;
        LoginController.getProps().setProperty("spreads looked at", readingcounter.toString());

    }

    @FXML
    public void hoverPast() {

    }


    @FXML
    public void showNext() {
        Timeline t = new Timeline();


        try {
            if (pastCardNumber == presentCardNumber || pastCardNumber == futureCardNumber) {
                System.out.println("Changing Past Card");
                pastCardNumber = r.nextInt(77);
            }

            if (pastCardNumber == presentCardNumber || presentCardNumber == futureCardNumber) {
                System.out.println("Changing Present Card");
                presentCardNumber = r.nextInt(77);
            }

            if (futureCardNumber == presentCardNumber || pastCardNumber == futureCardNumber) {
                System.out.println("Changing Future Card");
                futureCardNumber = r.nextInt(77);
            }

            if (counter == 1) {

                KeyValue v1 = new KeyValue(past.opacityProperty(), 0);
                KeyValue v2 = new KeyValue(past.opacityProperty(), 1);
                KeyFrame f1 = new KeyFrame(Duration.millis(0), v1);
                KeyFrame f2 = new KeyFrame(Duration.millis(3000), v2);
                t.getKeyFrames().addAll(f1, f2);
                if (deck == ReadingController.DeckType.WIATE) {
                    past.setImage(CardData.getImageView(pastCardNumber, CardData.WIADEC).getImage());

                }
                if (deck == ReadingController.DeckType.MARC) {
                    past.setImage(CardData.getImageView(pastCardNumber, CardData.MERC_DECK).getImage());
                }
                if (deck == ReadingController.DeckType.WIA_ART) {
                    past.setImage(CardData.getImageView(pastCardNumber, CardData.WIA_ART_DECK).getImage());
                }
            }
            meanings[counter] = CardData.getCardMeaning(pastCardNumber);

//            if (invert && r.nextBoolean()) {
//                past.setRotate(180);
//            }
            pastIsShowing = true;

            System.out.println("Past card inverted: " + c3inverted);


            if (counter == 0) {

                if (deck == ReadingController.DeckType.WIATE) {
                    present.setImage(CardData.getImageView(presentCardNumber, CardData.WIADEC).getImage());

                }
                if (deck == ReadingController.DeckType.MARC) {

                    present.setImage(CardData.getImageView(presentCardNumber, CardData.MERC_DECK).getImage());

                }
                if (deck == ReadingController.DeckType.WIA_ART) {

                    present.setImage(CardData.getImageView(presentCardNumber, CardData.WIA_ART_DECK).getImage());

                }
                KeyValue v1 = new KeyValue(present.opacityProperty(), 0);
                KeyValue v2 = new KeyValue(present.opacityProperty(), 1);
                KeyFrame f1 = new KeyFrame(Duration.millis(0), v1);
                KeyFrame f2 = new KeyFrame(Duration.millis(350), v2);
                t.getKeyFrames().addAll(f1, f2);
                meanings[counter] = CardData.getCardMeaning(presentCardNumber);
//                if (invert && r.nextBoolean()) {
//                    present.setRotate(180);
//                }
                presentIsShowing = true;
                System.out.println("Present card inverted: " + c2inverted);
            }

            if (counter == 2) {
                if (deck == ReadingController.DeckType.WIATE) {

                    future.setImage(CardData.getImageView(futureCardNumber, CardData.WIADEC).getImage());
                }
                if (deck == ReadingController.DeckType.MARC) {
                    future.setImage(CardData.getImageView(futureCardNumber, CardData.MERC_DECK).getImage());
                }
                if (deck == ReadingController.DeckType.WIA_ART) {
                    future.setImage(CardData.getImageView(futureCardNumber, CardData.WIA_ART_DECK).getImage());
                }
            }

            KeyValue v1 = new KeyValue(future.opacityProperty(), 0);
            KeyValue v2 = new KeyValue(future.opacityProperty(), 1);
            KeyFrame f1 = new KeyFrame(Duration.millis(0), v1);
            KeyFrame f2 = new KeyFrame(Duration.millis(350), v2);
            t.getKeyFrames().addAll(f1, f2);
            meanings[counter] = CardData.getCardMeaning(futureCardNumber);


//            if (invert && r.nextBoolean()) {
//                future.setRotate(180);
//            }

            futureIsShowing = true;
            System.out.println("Future card inverted" + c3inverted);

            counter++;
            t.play();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("That is all the cards that are in the spread");
        }

    }
}





