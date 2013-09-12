package controller;

import card.CardData;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.util.Duration;
import runner.Main;
import utils.Utils;

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

    private int pastc = r.nextInt(77);
    private int presentc = r.nextInt(77);
    private int futurec = r.nextInt(77);

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

    public static boolean invert = false;

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

    @FXML
    public void showPresentMeaning() {
        if (presentIsShowing) {
            if (help) {
                meaningTitle.setText(CardData.getCardTitle(presentc));
                meaningText.setText(CardData.getCardMeaning(presentc));
            }
        }
    }

    @FXML
    public void showPastMeaning() {
        if (pastIsShowing) {
            if (help) {
                meaningTitle.setText(CardData.getCardTitle(pastc));
                meaningText.setText(CardData.getCardMeaning(pastc));
            }
        }
    }

    @FXML
    public void showFutureMeaning() {
        if (futureIsShowing) {
            if (help) {
                meaningTitle.setText(CardData.getCardTitle(futurec));
                meaningText.setText(CardData.getCardMeaning(futurec));
            }
        }
    }

    @FXML
    public void done() {

        Main.getStage().getScene().setRoot(Main.getReading());
        Main.getStage().setWidth(601 + 25);
        Main.getStage().setHeight(161 + 25);
        Main.getStage().centerOnScreen();
        Main.getStage().getScene().setFill(Utils.BG_COLOR);

        //Reset everything for next time;
        past.setImage(null);
        present.setImage(null);
        future.setImage(null);

        //init cards for next time
        pastc = r.nextInt(77);
        presentc = r.nextInt(77);
        futurec = r.nextInt(77);
        counter = 0;

        if (c1inverted && invert) {
            past.setRotate(-180);
        }
        if (c2inverted && invert) {
            present.setRotate(-180);
        }
        if (c3inverted && invert) {
            future.setRotate(-180);
        }
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

    }

    @FXML
    public void hoverPast() {

    }


    @FXML
    public void showNext() {
        Timeline t = new Timeline();


        try {
            if (pastc == presentc || pastc == futurec) {
                System.out.println("Changing Past Card");
                pastc = r.nextInt(77);
            }

            if (pastc == presentc || presentc == futurec) {
                System.out.println("Changing Present Card");
                presentc = r.nextInt(77);
            }

            if (futurec == presentc || pastc == futurec) {
                System.out.println("Changing Future Card");
                futurec = r.nextInt(77);
            }

            if (counter == 1) {

                KeyValue v1 = new KeyValue(past.opacityProperty(), 0);
                KeyValue v2 = new KeyValue(past.opacityProperty(), 1);
                KeyFrame f1 = new KeyFrame(Duration.millis(0), v1);
                KeyFrame f2 = new KeyFrame(Duration.millis(3000), v2);
                t.getKeyFrames().addAll(f1, f2);
                if (deck == ReadingController.DeckType.WIATE) {
                    past.setImage(CardData.getImageView(pastc, CardData.WIADEC).getImage());
                }
                if (deck == ReadingController.DeckType.MARC) {
                    past.setImage(CardData.getImageView(pastc, CardData.MERC_DECK).getImage());
                }
                if (deck == ReadingController.DeckType.WIA_ART) {
                    past.setImage(CardData.getImageView(pastc, CardData.WIA_ART_DECK).getImage());
                }
            }
            meanings[counter] = CardData.getCardMeaning(pastc);
            c1inverted = r.nextBoolean();
            if (invert && c1inverted) {
                past.setRotate(180);
            }
            pastIsShowing = true;

            System.out.println("Past card inverted: " + c3inverted);


            if (counter == 0) {

                if (deck == ReadingController.DeckType.WIATE) {
                    present.setImage(CardData.getImageView(presentc, CardData.WIADEC).getImage());

                }
                if (deck == ReadingController.DeckType.MARC) {
                    present.setImage(CardData.getImageView(presentc, CardData.MERC_DECK).getImage());

                }
                if (deck == ReadingController.DeckType.WIA_ART) {
                    present.setImage(CardData.getImageView(presentc, CardData.WIA_ART_DECK).getImage());

                }
                KeyValue v1 = new KeyValue(present.opacityProperty(), 0);
                KeyValue v2 = new KeyValue(present.opacityProperty(), 1);
                KeyFrame f1 = new KeyFrame(Duration.millis(0), v1);
                KeyFrame f2 = new KeyFrame(Duration.millis(350), v2);
                t.getKeyFrames().addAll(f1, f2);
                meanings[counter] = CardData.getCardMeaning(presentc);
                c2inverted = r.nextBoolean();
                if (invert && c2inverted) {
                    present.setRotate(180);
                }
                presentIsShowing = true;
                System.out.println("Present card inverted: " + c2inverted);
            }

            if (counter == 2) {
                if (deck == ReadingController.DeckType.WIATE) {
                    future.setImage(CardData.getImageView(futurec, CardData.WIADEC).getImage());
                }
                if (deck == ReadingController.DeckType.MARC) {
                    future.setImage(CardData.getImageView(futurec, CardData.MERC_DECK).getImage());
                }
                if (deck == ReadingController.DeckType.WIA_ART) {
                    future.setImage(CardData.getImageView(futurec, CardData.WIA_ART_DECK).getImage());
                }
            }

            KeyValue v1 = new KeyValue(future.opacityProperty(), 0);
            KeyValue v2 = new KeyValue(future.opacityProperty(), 1);
            KeyFrame f1 = new KeyFrame(Duration.millis(0), v1);
            KeyFrame f2 = new KeyFrame(Duration.millis(350), v2);
            t.getKeyFrames().addAll(f1, f2);
            meanings[counter] = CardData.getCardMeaning(futurec);


            c3inverted = r.nextBoolean();
            if (invert && c3inverted) {
                future.setRotate(180);
            }

            futureIsShowing = true;
            System.out.println("Future card inverted" + c3inverted);

            counter++;
            t.play();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("That is all the cards that are in the spread");
        }

    }
}





