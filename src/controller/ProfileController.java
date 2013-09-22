package controller;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import profile.AstroSign;
import runner.Main;
import utils.Utils;

/**
 * User: Erick
 * Date: 9/21/13
 * Time: 1:55 PM
 */
public class ProfileController {

    private static boolean isSignSelected = false;

    private static AstroSign aSign = Main.getSign();

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

        aSign.setSign(signInt);
        if (signInt != 100) {
            isSignSelected = true;
        }

        System.out.println(aSign.getId());

        Main.getStage().getScene().setRoot(Main.getMenu());
        Main.getStage().setWidth(540.0 + Utils.FRAME_OFFSET);
        Main.getStage().setHeight(160.0 + Utils.FRAME_OFFSET);
        Main.getStage().centerOnScreen();

    }


    public static boolean isSignSelected() {
        return isSignSelected;
    }

    @FXML
    public void cancel() {
        Main.getStage().getScene().setRoot(Main.getMenu());
        Main.getStage().setWidth(540.0 + Utils.FRAME_OFFSET);
        Main.getStage().setHeight(160.0 + Utils.FRAME_OFFSET);
        Main.getStage().centerOnScreen();
    }

    public static AstroSign getSign() {
        if (aSign != null) {
            return aSign;
        } else {
            throw new NullPointerException("..No sign has been saved..");
        }
    }


}
