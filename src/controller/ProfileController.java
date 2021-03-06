package controller;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import profile.AstroSign;
import utils.T_B_Props;

/**
 * User: Erick
 * Date: 9/21/13
 * Time: 1:55 PM
 */
public class ProfileController {

    private static boolean isSignSelected = false;


    private static T_B_Props props = LoginController.getProps();

    private static AstroSign sign;

    private int signInt = 100;

    @FXML
    private RadioButton aries;

    @FXML
    private RadioButton taurus;

    @FXML
    private RadioButton gemini;

    @FXML
    private RadioButton cancer;

    @FXML
    private RadioButton leo;

    @FXML
    private RadioButton virgo;

    @FXML
    private RadioButton libra;

    @FXML
    private RadioButton scorpio;

    @FXML
    private RadioButton sagittarius;

    @FXML
    private RadioButton capricorn;

    @FXML
    private RadioButton aquarius;

    @FXML
    private RadioButton pisces;

    @FXML
    public void setSign() {

        if (aries.isSelected()) {
            signInt = AstroSign.ARIES;
        }

        if (taurus.isSelected()) {
            signInt = AstroSign.TAURUS;
        }

        if (gemini.isSelected()) {
            signInt = AstroSign.GEMINI;
        }

        if (cancer.isSelected()) {
            signInt = AstroSign.CANCER;
        }

        if (leo.isSelected()) {
            signInt = AstroSign.LEO;
        }

        if (virgo.isSelected()) {
            signInt = AstroSign.VIRGO;
        }

        if (libra.isSelected()) {
            signInt = AstroSign.LIBRA;
        }

        if (scorpio.isSelected()) {
            signInt = AstroSign.SCORPIO;
        }

        if (sagittarius.isSelected()) {
            signInt = AstroSign.SAGITTARIUS;
        }

        if (capricorn.isSelected()) {
            signInt = AstroSign.CAPRICORN;
        }

        if (aquarius.isSelected()) {
            signInt = AstroSign.AQUARIUS;
        }

        if (pisces.isSelected()) {
            signInt = AstroSign.PISCES;
        }

        sign = LoginController.getSign();

        sign.setSign(signInt);
        if (signInt != 100) {
            isSignSelected = true;
        }

        sign.update();
        sign.saveProp();

        System.out.println(props.getProperty("astrology sign"));

        props.setProperty("astrology sign", Integer.toString(signInt));
        String tempFileName = props.getProperty("name");
        props.saveUserInfo(tempFileName);

        Stage.setStage(Stage.MENU);

    }


    public static boolean isSignSelected() {
        return isSignSelected;
    }

    public static void setIsSignSelected(boolean b) {
        isSignSelected = b;
    }

    @FXML
    public void cancel() {
        Stage.setStage(Stage.MENU);
    }


}
