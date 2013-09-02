package card;

import javafx.animation.Timeline;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


/**
 * Created with IntelliJ IDEA.
 * User: Erick
 * Date: 9/2/13
 * Time: 12:05 PM
 */
public class TarotCard {
    private String cardTitle;
    private String cardMeaning;
    private int cardNumber;
    private boolean invert;
    private boolean isShowing;
    private Timeline flipAnimation;
    private ImageView view;

    public TarotCard(int cardNumber, boolean allowReversed) {
        this.cardNumber = cardNumber;
        this.invert = allowReversed;
//        initCard();

    }

    public String getCardTitle() {
        return cardTitle;
    }

    public String getCardMeaning() {
        return cardMeaning;
    }

    public Image getImage() {
        return CardData.getImageView(cardNumber).getImage();
    }

    public void show() {
        if (!isShowing) {
            flipAnimation.play();
            isShowing = true;
        } else {
            System.out.println("Card is already showing");
        }
    }

//    private void buildAnimation() {
//        this.flipAnimation = new Timeline();
//        KeyFrame f1 = new KeyFrame(Duration.millis(0), new KeyValue(view.opacityProperty(), 0f));
//        KeyFrame f2 = new KeyFrame(Duration.millis(750), new KeyValue(view.opacityProperty(), 1f));
//        flipAnimation.getKeyFrames().addAll(f1, f2);
//    }

    private void initCard() {
        //init card
        view.setImage(CardData.getImageView(cardNumber).getImage());
        this.cardTitle = CardData.getCardTitle(cardNumber);
        this.cardMeaning = CardData.getCardMeaning(cardNumber);

    }
}
