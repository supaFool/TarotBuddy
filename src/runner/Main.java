package runner;

import card.CardData;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    /**
     * I guess you have to initialize all .fxml in menu class
     */

    //Root for all the Scenes
    private static Parent reading;
    private static Parent studyCards;
    private static Parent quiz;
    private static Parent lookAt;
    private static Parent menu;
    private static Parent tcs;
    //

    private static Stage ps;

    private static double version = 1.0;
    public static String ver = "Beta ver." + version;

    public static String TITLE = "Tarot-Buddy " + ver;

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Init all fxml, should not have to do this way i don't think, but i can figure it out
        menu = FXMLLoader.load(getClass().getResource("menu.fxml"));
        reading = FXMLLoader.load(getClass().getResource("reading.fxml"));
        studyCards = FXMLLoader.load(getClass().getResource("study.fxml"));
        quiz = FXMLLoader.load(getClass().getResource("quiz.fxml"));
        tcs = FXMLLoader.load(getClass().getResource("TCS.fxml"));
        lookAt = FXMLLoader.load(getClass().getResource("lookAtDeck.fxml"));

        //Set Stage so we can retrieve it later
        Main.ps = primaryStage;

        Platform.setImplicitExit(true);

        //set stage props
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setResizable(false);
        primaryStage.getIcons().add(new Image(CardData.getImageFile(CardData.THE_MAGUS)));
        primaryStage.setTitle("Tarot Buddy");
        primaryStage.setScene(new Scene(reading, Color.BURLYWOOD));
        primaryStage.show();
    }


    /**
     * @return the reading parent
     */
    public static Parent getReading() {
        return reading;
    }

    public static Parent getMenu() {
        return menu;
    }

    public static Parent getTCS() {
        return tcs;
    }

    public static Stage getStage() {
        return ps;
    }

    /**
     * @return the look at cards parent
     */
    public static Parent getStudyCards() {
        return studyCards;
    }

    /**
     * @return the quiz parent
     */
    public static Parent getQuiz() {
        return quiz;
    }

    /**
     * @return the lookAt parent
     */
    public static Parent getLookAt() {
        return lookAt;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
