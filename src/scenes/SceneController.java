package scenes;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by supaFool on 7/16/2018.
 */
public class SceneController {

    private int AMOUNT_OF_SCENES = 11;
    private int MENU;
    private int READING;
    private int STUDY;
    private int THREE_CARD_SPREAD;
    private int LOOK_AT_CARDS;
    private int THREE_CARD_NO_HELP;
    private int SWORD_SPREAD;
    private int PROFILE;
    private int ZODIAC;
    private int LOGIN;
    private int LOGIN_NEW;
    private int[] scenes;

    public SceneController() {
        init();
    }

    private void init(){
        try {
            scenes = new int[AMOUNT_OF_SCENES];
            loadAllScenes();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadAllScenes() throws IOException {

        for (int i = 0; i < AMOUNT_OF_SCENES; i++) {
            System.out.println(i + " Printed...");
        }

//        menu = FXMLLoader.load(getClass().getResource("menu.fxml"));
//        reading = FXMLLoader.load(getClass().getResource("reading.fxml"));
//        studyCards = FXMLLoader.load(getClass().getResource("study.fxml"));
////        quiz = FXMLLoader.load(getClass().getResource("quiz.fxml"));
//        tcs = FXMLLoader.load(getClass().getResource("TCS.fxml"));
//        lookAt = FXMLLoader.load(getClass().getResource("lookAtDeck.fxml"));
//        tcsNoHelp = FXMLLoader.load(getClass().getResource("TCSnoHelp.fxml"));
//        swordSpread = FXMLLoader.load(getClass().getResource("SwordSpread.fxml"));
//        profile = FXMLLoader.load(getClass().getResource("Profile.fxml"));
//        zodiac = FXMLLoader.load(getClass().getResource("Zodiac.fxml"));
//        login = FXMLLoader.load(getClass().getResource("login.fxml"));
//        loginNew = FXMLLoader.load(getClass().getResource("loginNewProfile.fxml"));
//        loginConfirm = FXMLLoader.load(getClass().getResource("loginConfirm.fxml"));
        System.out.println("Loaded Scene Cntroller");
    }
}
