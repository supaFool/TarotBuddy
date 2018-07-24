package controller;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ToggleButton;
import javafx.scene.text.Text;
import javafx.util.Duration;
import utils.Utils;

/**
 * User: Erick
 * Date: 9/16/13
 * Time: 11:09 AM
 */
public class OptionsController {

    private static boolean isAnimated = false;

    @FXML
    private ColorPicker colorPicker;

    @FXML
    private ToggleButton aniToggle;

    @FXML
    private Text optionConfirmText;

    //Type of animation toggle
    public static boolean isAnimated() {
        return isAnimated;
    }

    @FXML
    public void setBackGroundColor() {
        Utils.BG_COLOR = colorPicker.getValue();
    }

    private void flashSelection(String text) {
        optionConfirmText.setText(text);
        Timeline ani = new Timeline();
        KeyFrame frame = new KeyFrame(Duration.millis(0), new KeyValue(optionConfirmText.opacityProperty(), 1.0f));
        KeyFrame fadeFrame = new KeyFrame(Duration.millis(2000), new KeyValue(optionConfirmText.opacityProperty(), 0.0f));
        ani.getKeyFrames().addAll(frame, fadeFrame);
        ani.play();
    }

    private void setIsAnimated(boolean isAnimated) {
        OptionsController.isAnimated = isAnimated;
    }

    /**
     * Flashes a message on background animation toggle
     */
    @FXML
    public void listenForAnimationSelection() {
        setIsAnimated(aniToggle.isSelected() ? false : true);
        flashSelection(aniToggle.isSelected() ? "Background Animation Off" : "Background Animation On");
    }
}
