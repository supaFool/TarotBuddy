package controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.MenuButton;
import runner.Main;
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
    }

    @FXML
    public void setColor() {
        //todo set color
    }


    @FXML
    public void setRequestedStage() {
//        System.out.println("Read " + wantsReading + ", Quiz " + wantsQuiz +
//                ", Study " + wantsStudy + ", Look At " + wantsLookAt);

        if (wantsReading) {
            System.out.println(wantsReading + " Wants Reading");
            Main.getStage().setWidth(601 + Utils.FRAME_OFFSET);
            Main.getStage().setHeight(161 + Utils.FRAME_OFFSET);
            Main.getStage().getScene().setRoot(Main.getReading());
//            Clip.getButtonClick_a().play();

        }
        if (wantsLookAt) {
            Main.getStage().setWidth(674 + Utils.FRAME_OFFSET);
            Main.getStage().setHeight(405 + Utils.FRAME_OFFSET);
            Main.getStage().getScene().setFill(Utils.READING_COLOR);
            Main.getStage().getScene().setRoot(Main.getLookAt());
            Main.getStage().centerOnScreen();
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
            Main.getStage().setWidth(675 + Utils.FRAME_OFFSET);
            Main.getStage().setHeight(650 + Utils.FRAME_OFFSET);
            Main.getStage().getScene().setFill(Utils.BG_COLOR);
            Main.getStage().getScene().setRoot(Main.getStudyCards());
            Main.getStage().centerOnScreen();
//            Clip.getButtonClick_a().play();
        }
//        Clip.getButtonClick_a().play();
    }

    @FXML
    public void studyCards() {
        todo.setText(todo.getItems().get(1).getText());
        wantsStudy = true;
        wantsReading = false;
        wantsQuiz = false;
        wantsLookAt = false;
    }

    @FXML
    public void takeQuiz() {
        todo.setText(coming);
        wantsStudy = false;
        wantsReading = false;
        wantsQuiz = true;
        wantsLookAt = false;
    }

    @FXML
    public void lookAtTarotDeck() {
        todo.setText(todo.getItems().get(3).getText());
        wantsStudy = false;
        wantsReading = false;
        wantsQuiz = false;
        wantsLookAt = true;
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

}
