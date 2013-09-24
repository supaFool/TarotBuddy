package controller;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import profile.AstroSign;
import runner.Main;
import utils.Utils;


/**
 * User: Erick
 * Date: 9/21/13
 * Time: 12:42 PM
 */
public class ZodController {

    AstroSign sign;

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

    public ZodController() {

    }

    @FXML
    public void goHome() {
        Main.getStage().getScene().setRoot(Main.getMenu());
        Main.getStage().getScene().setFill(Color.DARKCYAN);
        Main.getStage().setWidth(540.0 + Utils.FRAME_OFFSET);
        Main.getStage().setHeight(160.0 + Utils.FRAME_OFFSET);
        Main.getStage().centerOnScreen();
    }

    @FXML
    public void refresh() {
        sign = LoginController.getSign();
        bgLogo.setImage(sign.getZodiacImage());
        rangeText.setText(sign.getBirthYearString());
        elementText.setText(sign.getElement().toString());
        titleText.setText(sign.getId());
        quatText.setText(sign.getQuat().toString());
        charText.setText(sign.getCharacteristics());
        System.out.println("Refreshes");
    }
}
