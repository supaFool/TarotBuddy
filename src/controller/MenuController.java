package controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.MenuButton;
import runner.Main;
import runner.saves.Save;
import utils.Utils;

/**
 * Created with IntelliJ IDEA.
 * User: Erick
 * Date: 8/30/13
 * Time: 2:13 AM
 */
public class MenuController {

    private boolean wantsStudy = false;
    private boolean wantsReading = false;
    private boolean wantsQuiz = false;
    private boolean wantsLookAt = false;
    private boolean wantsAstrology = false;


    @FXML
    private MenuButton todo;

//    @FXML
//    private Text title;

    private String coming = "Coming Soon...";


    public MenuController() {
    }


    @FXML
    public void getReading() {
        todo.setText(todo.getItems().get(0).getText());

        wantsStudy = false;
        wantsReading = true;
        wantsQuiz = false;
        wantsLookAt = false;
        wantsAstrology = false;

        System.out.println("Saving...");
        new Save();
    }

    @FXML
    public void setColor() {
    }


    @FXML
    public void setRequestedStage() {
//        System.out.println("Read " + wantsReading + ", Quiz " + wantsQuiz +
//                ", Study " + wantsStudy + ", Look At " + wantsLookAt);

        if (wantsReading) {
            Stage.setStage(Stage.READING);
//            Clip.getButtonClick_a().play();

        }
        if (wantsLookAt) {
            Stage.setStage(Stage.LOOK_AT_DECK);
//            Clip.getButtonClick_a().play();
        }
        if (wantsQuiz) {
            //Set 3 Card Stage
//            Stage s = new Stage();
//            s.initModality(Modality.APPLICATION_MODAL);
//            s.initStyle(StageStyle.UNDECORATED);
//            Scene scene = new Scene(Main.getQuiz(), Color.BURLYWOOD);
//            s.setScene(scene);
//            s.show();
        }
        if (wantsStudy) {
            Stage.setStage(Stage.STUDY);
//            Clip.getButtonClick_a().play();
        }
        if (wantsAstrology) {

            if (ProfileController.isSignSelected()) {
                Stage.setStage(Stage.ZODIAC);
            }

        }

    }

    @FXML
    public void studyCards() {
        todo.setText(todo.getItems().get(1).getText());
        wantsStudy = true;
        wantsReading = false;
        wantsQuiz = false;
        wantsLookAt = false;
        wantsAstrology = false;
    }

    @FXML
    public void takeQuiz() {
        todo.setText(coming);
        wantsStudy = false;
        wantsReading = false;
        wantsQuiz = true;
        wantsLookAt = false;
        wantsAstrology = false;
    }

    @FXML
    public void lookAtTarotDeck() {
        todo.setText(todo.getItems().get(3).getText());
        wantsStudy = false;
        wantsReading = false;
        wantsQuiz = false;
        wantsLookAt = true;
        wantsAstrology = false;
    }

    @FXML
    public void wantsAstrology() {
        if (ProfileController.isSignSelected()) {
            todo.setText(todo.getItems().get(4).getText());
            wantsStudy = false;
            wantsReading = false;
            wantsQuiz = false;
            wantsLookAt = false;
            wantsAstrology = true;
        } else {
            todo.setText("No Astrology Profile Found");
            wantsStudy = false;
            wantsReading = false;
            wantsQuiz = false;
            wantsLookAt = false;
            wantsAstrology = false;
        }
    }

    @FXML
    public void close() {
//        Clip.getButtonClick_a().play();
        Platform.exit();
    }


    @FXML
    public void showProgress() {
        System.out.println("Progress");
    }

    @FXML
    public void setColorPref() {

    }

    @FXML
    public void openProfile() {
        Main.getStage().setWidth(319 + Utils.FRAME_OFFSET);
        Main.getStage().setHeight(600 + Utils.FRAME_OFFSET);
        Main.getStage().getScene().setFill(Utils.BG_COLOR);
        Main.getStage().getScene().setRoot(Main.getProfile());
        Main.getStage().centerOnScreen();
    }

}
