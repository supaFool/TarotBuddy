package controller;

import card.CardData;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.util.Duration;
import logic.DealingLogic;
import runner.Main;

import java.util.Random;


/**
 * Created with IntelliJ IDEA.
 * User: Erick
 * Date: 9/2/13
 * Time: 1:21 PM
 */
public class TCSController {
    private Random r = new Random();

    private int pastc = r.nextInt(77);
    private int presentc = r.nextInt(77);
    private int futurec = r.nextInt(77);

    private boolean c1inverted = false;
    private boolean c2inverted = false;
    private boolean c3inverted = false;

    private DealingLogic logic;
    @FXML
    private ImageView past;

    @FXML
    private ImageView present;

    @FXML
    private ImageView future;

    private int counter = 0;

    public static boolean invert = false;

    public TCSController() {

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
    public void done() {

        Main.getStage().getScene().setRoot(Main.getReading());
        Main.getStage().setHeight(132);
        Main.getStage().setWidth(600);
        Main.getStage().centerOnScreen();
        Main.getStage().getScene().setFill(Color.BURLYWOOD);

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

    }

    @FXML
    public void showNext() {
        Timeline t = new Timeline();


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

        if (counter == 0) {

            KeyValue v1 = new KeyValue(past.opacityProperty(), 0);
            KeyValue v2 = new KeyValue(past.opacityProperty(), 1);
            KeyFrame f1 = new KeyFrame(Duration.millis(0), v1);
            KeyFrame f2 = new KeyFrame(Duration.millis(350), v2);
            t.getKeyFrames().addAll(f1, f2);
            past.setImage(CardData.getImageView(pastc).getImage());
            c1inverted = r.nextBoolean();
            if (invert && c1inverted) {
                past.setRotate(180);
            }

            System.out.println("Past card inverted: " + c3inverted);


        }

        if (counter == 1) {

            KeyValue v1 = new KeyValue(present.opacityProperty(), 0);
            KeyValue v2 = new KeyValue(present.opacityProperty(), 1);
            KeyFrame f1 = new KeyFrame(Duration.millis(0), v1);
            KeyFrame f2 = new KeyFrame(Duration.millis(350), v2);
            t.getKeyFrames().addAll(f1, f2);
            present.setImage(CardData.getImageView(presentc).getImage());
            c2inverted = r.nextBoolean();
            if (invert && c2inverted) {
                present.setRotate(180);
            }
            System.out.println("Present card inverted: " + c2inverted);
        }

        if (counter == 2) {

            KeyValue v1 = new KeyValue(future.opacityProperty(), 0);
            KeyValue v2 = new KeyValue(future.opacityProperty(), 1);
            KeyFrame f1 = new KeyFrame(Duration.millis(0), v1);
            KeyFrame f2 = new KeyFrame(Duration.millis(350), v2);
            t.getKeyFrames().addAll(f1, f2);
            future.setImage(CardData.getImageView(futurec).getImage());


            c3inverted = r.nextBoolean();
            if (invert && c3inverted) {
                future.setRotate(180);
            }


            System.out.println("Future card inverted" + c3inverted);
        }
        counter++;
        t.play();

    }
}