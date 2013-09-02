package controller;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import logic.DealingLogic;
import runner.Main;

import java.util.HashSet;


/**
 * Created with IntelliJ IDEA.
 * User: Erick
 * Date: 9/2/13
 * Time: 1:21 PM
 */
public class TCSController {

    private DealingLogic logic;
    @FXML
    private ImageView past;

    @FXML
    private ImageView present;

    @FXML
    private ImageView future;

    public TCSController() {
        past = new ImageView();
        present = new ImageView();
        future = new ImageView();
        HashSet<ImageView> views = new HashSet<ImageView>();
        views.add(past);
        views.add(present);
        views.add(future);
        logic = new DealingLogic(3, views, false);
        Image[] images = logic.getCards();
        past.setImage(images[0]);
        present.setImage(images[1]);
        future.setImage(images[2]);
    }

    @FXML
    public void done() {
        Main.getStage().getScene().setRoot(Main.getReading());
        Main.getStage().setHeight(132);
        Main.getStage().setWidth(600);
        Main.getStage().centerOnScreen();
        Main.getStage().getScene().setFill(Color.BURLYWOOD);
    }
}
