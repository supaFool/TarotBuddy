package controller;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;


/**
 * User: Erick
 * Date: 9/21/13
 * Time: 12:42 PM
 */
public class ZodController {

    @FXML
    private ImageView bgLogo;

    @FXML
    private Text rangeText;

    @FXML
    private Text elementText;

    @FXML
    private Text titleText;

    @FXML
    private Text quatText;

    @FXML
    private Text loveText;

    @FXML
    private Text charText;

    @FXML
    private Text home;

    @FXML
    public void homeHover() {
        home.setOpacity(1);
    }

    @FXML
    public void homeUnHover() {
        home.setOpacity(.41);
    }

    @FXML
    public void goHome() {
        System.out.println("Connected");
    }
}
