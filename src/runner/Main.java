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
    private static Parent tcsNoHelp;
    private static Parent swordSpread;
    private static Parent profile;
    private static Parent zodiac;
    private static Parent login;
    private static Parent loginNew;
    private static Parent loginConfirm;
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
        tcsNoHelp = FXMLLoader.load(getClass().getResource("TCSnoHelp.fxml"));
        swordSpread = FXMLLoader.load(getClass().getResource("SwordSpread.fxml"));
        profile = FXMLLoader.load(getClass().getResource("Profile.fxml"));
        zodiac = FXMLLoader.load(getClass().getResource("Zodiac.fxml"));
        login = FXMLLoader.load(getClass().getResource("login.fxml"));
        loginNew = FXMLLoader.load(getClass().getResource("loginNewProfile.fxml"));
        loginConfirm = FXMLLoader.load(getClass().getResource("loginConfirm.fxml"));


        //Set Stage so we can retrieve it later
        Main.ps = primaryStage;

        Platform.setImplicitExit(true);

//        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
//            @Override
//            public void handle(WindowEvent windowEvent) {
//                props.saveUserInfo("Erick");
//            }
//        });

        //set stage props
        primaryStage.initStyle(StageStyle.UTILITY);
        primaryStage.setResizable(false);
        primaryStage.getIcons().add(new Image(CardData.getImageFile(CardData.THE_MAGUS, CardData.MERC_DECK)));
        primaryStage.setTitle("Tarot Buddy");
        primaryStage.setScene(new Scene(login, Color.BLACK));
        primaryStage.show();
    }


    /**
     * @return the reading parent
     */
    public static Parent getReading() {
        return reading;
    }

    public static Parent getZodiac() {
        return zodiac;
    }

    public static Parent getMenu() {
        return menu;
    }

    public static Parent getSwordSpread() {
        return swordSpread;
    }

    public static Parent getTcsNoHelp() {
        return tcsNoHelp;
    }

    public static Parent getLogingConfirm() {
        return loginConfirm;
    }

    public static Parent getTCS() {
        return tcs;
    }

    public static Parent getNewProfile() {
        return loginNew;
    }

    public static Parent getLogin() {
        return login;
    }

    public static Parent getProfile() {
        return profile;
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
