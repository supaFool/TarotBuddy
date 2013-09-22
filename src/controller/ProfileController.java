package controller;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import profile.AstroSign;
import runner.Main;

/**
 * User: Erick
 * Date: 9/21/13
 * Time: 1:55 PM
 */
public class ProfileController {

    private static boolean isSignSelected = false;

    private static AstroSign aSign = Main.getSign();

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
        int sign = 100;
        if (aries.isSelected()) {
            sign = AstroSign.ARIES;
        }

        if (taurus.isSelected()) {
            sign = AstroSign.TAURUS;
        }

        if (gemini.isSelected()) {
            sign = AstroSign.GEMINI;
        }

        if (cancer.isSelected()) {
            sign = AstroSign.CANCER;
        }

        if (leo.isSelected()) {
            sign = AstroSign.LEO;
        }

        if (virgo.isSelected()) {
            sign = AstroSign.VIRGO;
        }

        if (libra.isSelected()) {
            sign = AstroSign.LIBRA;
        }

        if (scorpio.isSelected()) {
            sign = AstroSign.SCORPIO;
        }

        if (sagittarius.isSelected()) {
            sign = AstroSign.SAGITTARIUS;
        }

        if (capricorn.isSelected()) {
            sign = AstroSign.CAPRICORN;
        }

        if (aquarius.isSelected()) {
            sign = AstroSign.AQUARIUS;
        }

        if (pisces.isSelected()) {
            sign = AstroSign.PISCES;
        }

        aSign.setSign(sign);
        if (sign != 100) {
            isSignSelected = true;
        }

    }


    public static boolean isSignSelected() {
        return isSignSelected;
    }

    @FXML
    public void cancel() {

    }

    public static AstroSign getSign() {
        if (aSign != null) {
            return aSign;
        } else {
            throw new NullPointerException("..No sign has been saved..");
        }
    }

}
