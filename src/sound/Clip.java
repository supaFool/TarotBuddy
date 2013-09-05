package sound;

import javafx.scene.media.AudioClip;

/**
 * Created with IntelliJ IDEA.
 * User: Erick
 * Date: 9/4/13
 * Time: 2:46 PM
 */

/**
 * Class for all clip sounds
 * Clip being a piece of sound played directly from memory, Small sound clip
 */
public class Clip {

    //Sound used for scroll menu
    public static AudioClip getScroll_a() {
        return new AudioClip("sound/button/dropdown.wav");
    }

    public static AudioClip getButtonClick_a() {
        return new AudioClip("/sound/button/click.wav");
    }

}
