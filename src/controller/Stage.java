package controller;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.paint.Color;
import javafx.util.Duration;
import runner.Main;
import utils.Utils;

/**
 * User: Erick
 * Date: 9/24/13
 * Time: 3:52 AM
 */
public class Stage {
    public static int LOGIN = 0;
    public static int LOG_IN_NEW_PROFILE = 1;
    public static int LOOK_AT_DECK = 2;
    public static int MENU = 3;
    public static int PROFILE = 4;
    public static int QUIZ = 5;
    public static int READING = 6;
    public static int STUDY = 7;
    public static int SWORD_SPREAD = 8;
    public static int TCS = 9;
    public static int TCS_NO_HELP = 10;
    public static int ZODIAC = 11;

    public static void setStage(int stage) {
        double width = 0;
        double height = 0;
        if (stage == LOGIN) {
            Main.getStage().getScene().setRoot(Main.getLogin());
            Main.getStage().getScene().setFill(Utils.BG_COLOR);
            Main.getStage().getScene().setFill(Color.BLACK);
            Main.getStage().centerOnScreen();
        }

        if (stage == LOG_IN_NEW_PROFILE) {
            Main.getStage().getScene().setRoot(Main.getNewProfile());
            Main.getStage().getScene().setFill(Utils.BG_COLOR);
            Main.getStage().getScene().setFill(Color.BLACK);
            Main.getStage().centerOnScreen();
        }

        if (stage == LOOK_AT_DECK) {
            Main.getStage().getScene().setRoot(Main.getLookAt());
            width = Utils.LOOK_AT_DECK_SIZE[0];
            height = Utils.LOOK_AT_DECK_SIZE[1];
            Main.getStage().setWidth(Utils.LOOK_AT_DECK_SIZE[0]);
            Main.getStage().setHeight(Utils.LOOK_AT_DECK_SIZE[1]);
            Main.getStage().getScene().setFill(Utils.BG_COLOR);
            Main.getStage().getScene().setFill(Color.BLACK);
            Main.getStage().centerOnScreen();
        }

        if (stage == MENU) {
            Main.getStage().getScene().setRoot(Main.getMenu());
            width = Utils.MENU_SIZE[0];
            height = Utils.MENU_SIZE[1];
            Main.getStage().setWidth(Utils.MENU_SIZE[0]);
            Main.getStage().setHeight(Utils.MENU_SIZE[1]);
            Main.getStage().getScene().setFill(Utils.BG_COLOR);
            Main.getStage().getScene().setFill(Color.BLACK);
            Main.getStage().centerOnScreen();
        }

        if (stage == READING) {
            Main.getStage().getScene().setRoot(Main.getReading());
            width = Utils.READING_SIZE[0];
            height = Utils.READING_SIZE[1];
            Main.getStage().setWidth(Utils.READING_SIZE[0]);
            Main.getStage().setHeight(Utils.READING_SIZE[1]);
            Main.getStage().getScene().setFill(Utils.BG_COLOR);
            Main.getStage().getScene().setFill(Color.BLACK);
            Main.getStage().centerOnScreen();
        }

        if (stage == STUDY) {
            Main.getStage().getScene().setRoot(Main.getStudyCards());
            width = Utils.STUDY_SIZE[0];
            height = Utils.STUDY_SIZE[1];
            Main.getStage().setWidth(Utils.STUDY_SIZE[0]);
            Main.getStage().setHeight(Utils.STUDY_SIZE[1]);
            Main.getStage().getScene().setFill(Utils.BG_COLOR);
            Main.getStage().getScene().setFill(Color.BLACK);
            Main.getStage().centerOnScreen();
        }

        if (stage == PROFILE) {
            Main.getStage().getScene().setRoot(Main.getProfile());
            Main.getStage().getScene().setFill(Utils.BG_COLOR);
            Main.getStage().getScene().setFill(Color.BLACK);
            Main.getStage().centerOnScreen();
        }

        if (stage == TCS) {
            Main.getStage().getScene().setRoot(Main.getTCS());
            width = Utils.TCS_SIZE[0];
            height = Utils.TCS_SIZE[1];
            Main.getStage().setWidth(Utils.TCS_SIZE[0]);
            Main.getStage().setHeight(Utils.TCS_SIZE[1]);
            Main.getStage().getScene().setFill(Utils.BG_COLOR);
            Main.getStage().getScene().setFill(Color.BLACK);
            Main.getStage().centerOnScreen();
        }

        if (stage == TCS_NO_HELP) {
            Main.getStage().getScene().setRoot(Main.getTcsNoHelp());
            width = Utils.TCS_NO_HELP_SIZE[0];
            height = Utils.TCS_NO_HELP_SIZE[1];
            Main.getStage().setWidth(Utils.TCS_SIZE[0]);
            Main.getStage().setHeight(Utils.TCS_SIZE[1]);
            Main.getStage().getScene().setFill(Utils.BG_COLOR);
            Main.getStage().getScene().setFill(Color.BLACK);
            Main.getStage().centerOnScreen();
        }

        if (stage == ZODIAC) {
            Main.getStage().getScene().setRoot(Main.getZodiac());
            width = Utils.ZODIAC_SIZE[0];
            height = Utils.ZODIAC_SIZE[1];
            Main.getStage().setWidth(Utils.ZODIAC_SIZE[0]);
            Main.getStage().setHeight(Utils.ZODIAC_SIZE[1]);
            Main.getStage().getScene().setFill(Utils.BG_COLOR);
            Main.getStage().getScene().setFill(Color.BLACK);
            Main.getStage().centerOnScreen();
        }
       // getStageAni(width, height).play();
    }

    /**
     * @return the fade animation for the stage fade effect
     */
    private static Timeline getStageAni(double width, double height) {
        Timeline fadeAni = new Timeline();
        KeyFrame f1 = new KeyFrame(Duration.millis(0), new KeyValue(Main.getStage().opacityProperty(), 0.0f));
        KeyFrame f2 = new KeyFrame(Duration.millis(750), new KeyValue(Main.getStage().opacityProperty(), 1.0f));
        KeyFrame f3 = new KeyFrame(Duration.millis(0), new KeyValue(Main.getStage().maxHeightProperty(), 0));
//        KeyFrame f4 = new KeyFrame(Duration.millis(0), new KeyValue(Main.getStage().maxWidthProperty(), 0));
        KeyFrame f5 = new KeyFrame(Duration.millis(750), new KeyValue(Main.getStage().maxHeightProperty(), height));
//        KeyFrame f6 = new KeyFrame(Duration.millis(2000), new KeyValue(Main.getStage().maxWidthProperty(), 899 + Utils.FRAME_OFFSET));
        KeyFrame f7 = new KeyFrame(Duration.millis(0), new KeyValue(Main.getStage().minHeightProperty(), 0));
//        KeyFrame f8 = new KeyFrame(Duration.millis(0), new KeyValue(Main.getStage().minWidthProperty(), 0));
        KeyFrame f9 = new KeyFrame(Duration.millis(720), new KeyValue(Main.getStage().minHeightProperty(), height));
//        KeyFrame f10 = new KeyFrame(Duration.millis(2000), new KeyValue(Main.getStage().minWidthProperty(), 899 + Utils.FRAME_OFFSET));
        fadeAni.getKeyFrames().addAll(f1, f2, f3, f5, f7, f9);
        return fadeAni;
    }
}
