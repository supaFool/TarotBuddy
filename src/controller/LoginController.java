package controller;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.util.Duration;
import profile.AstroSign;
import utils.T_B_Props;

import java.io.IOException;

/**
 * User: Erick
 * Date: 9/21/13
 * Time: 11:38 PM
 */
public class LoginController {

    public static T_B_Props props = new T_B_Props();

    private static AstroSign sign;

    public static String username;

    public String password;

    @FXML
    private Text loginError;

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField newUsername;

    @FXML
    private PasswordField newPw1;
    @FXML
    private PasswordField newPw2;

    @FXML
    public void login() {

        if (usernameField.getText() == null || passwordField.getText() == null) {
            flashSelection("Fields are empty");
        } else {
            try {
                props.loadUserInfo(usernameField.getText());
            } catch (IOException e) {
                flashSelection("No Profile Exists for " + usernameField.getText());
            }
        }


        if (passwordField.getText().matches(props.getProperty("password"))) {
            sign = new AstroSign(Integer.parseInt(props.getProperty("astrology sign")));
            sign.update();
            ProfileController.setIsSignSelected(true);
            Stage.setStage(Stage.MENU);
        } else {
            flashSelection("Invalid Password or Username");
        }

    }

    public static AstroSign getSign() {
        return sign;
    }

    private void flashSelection(String text) {
        loginError.setText(text);
        Timeline ani = new Timeline();
        KeyFrame frame = new KeyFrame(Duration.millis(0), new KeyValue(loginError.opacityProperty(), 1.0f));
        KeyFrame fadeFrame = new KeyFrame(Duration.millis(7500), new KeyValue(loginError.opacityProperty(), 0.0f));
        ani.getKeyFrames().addAll(frame, fadeFrame);
        ani.play();
    }

    public static T_B_Props getProps() {
        return props;
    }

    @FXML
    public void createProfile() {
        Stage.setStage(Stage.LOG_IN_NEW_PROFILE);
    }

    @FXML
    public void back() {
        Stage.setStage(Stage.LOGIN);
    }

    @FXML
    public void confirmNewAccount() {
        String pw1 = newPw1.getText();
        String pw2 = newPw2.getText();
        String name = newUsername.getText();


        if (pw1.matches("") || pw2.matches("") || name.matches("")) {
            flashSelection("Fields are empty");
        } else {
            props.setProperty("name", newUsername.getText());
            if (pw1.matches(pw2)) {
                props.setProperty("password", pw1);
                props.saveUserInfo(name);
                sign = new AstroSign(Integer.parseInt(props.getProperty("astrology sign")));
                Stage.setStage(Stage.PROFILE);
            } else {
                flashSelection("Passwords did not match");
            }
        }

        System.out.println(newPw2.getText());
    }
}
