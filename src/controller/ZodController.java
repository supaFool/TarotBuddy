package controller;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import profile.AstroSign;
import utils.T_B_Props;


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
        Stage.setStage(Stage.MENU);
    }

    @FXML
    public void refresh() {
        T_B_Props props = LoginController.getProps();
        sign = LoginController.getSign();
        sign.setSign(Integer.parseInt(props.getProperty("astrology sign")));
        sign.update();
        bgLogo.setImage(sign.getZodiacImage());
        rangeText.setText(sign.getBirthYearString());
        elementText.setText(sign.getElement().toString());
        titleText.setText(sign.getId());
        quatText.setText(sign.getQuat().toString());
        charText.setText(sign.getCharacteristics());
        System.out.println("Refreshes");
    }
}
