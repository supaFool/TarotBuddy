package runner.saves;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Created by supaFool on 7/19/2018.
 * <p>
 * Newly added feature, Is on the todo To fix this.
 */
public class Save {
    private static Logger logger;
    private FileHandler fileHandler;

    public Save() {
        System.out.println("init info");
        logger = Logger.getLogger("Game Logger");
        init();
    }

    public static void logInfo(String info, Level level) {
        logger.log(level, info + "\n");
    }

    private void init() {
        //Make the gamelog.txt file and set the logging level.
        try {
            fileHandler = new FileHandler("src\\runner\\saves\\saves.txt", true);
            logger.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
            logger.setLevel(Level.ALL);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
