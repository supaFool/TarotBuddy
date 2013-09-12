package controller;

import card.CardData;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import runner.Main;
import utils.Utils;

/**
 * User: Erick
 * Date: 9/2/13
 * Time: 10:05 PM
 */

/**
 * Also gets used as study Controller
 */
public class LookAtController {
    private int currentCard = 0;

    @FXML
    private ImageView view;

    @FXML
    private Text cardTitle;

    @FXML
    private Text cardMeaning;

    /**
     * Show next card;
     */
    @FXML
    public void next() {
        currentCard++;
        if (currentCard > 77) {
            currentCard = 0;
        }
        view.setImage(CardData.getImageView(currentCard, CardData.WIADEC).getImage());
        //Change meaning if we are studying
        if (Main.getStage().getScene().getRoot() == Main.getStudyCards()) {
            cardTitle.setText(CardData.getCardTitle(currentCard));
            cardMeaning.setText(CardData.getCardMeaning(currentCard));
        }
    }

    /**
     * Goes back to menu screen
     */
    @FXML
    public void home() {
        Main.getStage().getScene().setRoot(Main.getMenu());
        Main.getStage().getScene().setFill(Utils.BG_COLOR);
        Main.getStage().setWidth(540.0 + Utils.FRAME_OFFSET);
        Main.getStage().setHeight(160.0 + Utils.FRAME_OFFSET);
        Main.getStage().centerOnScreen();
    }

    /**
     * Show previous card
     */
    @FXML
    public void prev() {
        currentCard--;
        if (currentCard < 0) {
            currentCard = 77;
        }
        view.setImage(CardData.getImageView(currentCard, CardData.WIADEC).getImage());
        //Change meaning if we are studying
        if (Main.getStage().getScene().getRoot() == Main.getStudyCards()) {
            cardTitle.setText(CardData.getCardTitle(currentCard));
            cardMeaning.setText(CardData.getCardMeaning(currentCard));
        }
    }

}
