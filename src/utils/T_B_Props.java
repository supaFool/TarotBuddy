package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * User: Erick
 * Date: 9/18/13
 * Time: 12:09 AM
 */
public class T_B_Props extends Properties {
    private String[] propNames;
    private String UNKNOWN_FIELD = "Unknown";

    public T_B_Props() {

        /**
         * names of the properties saved to the .tb file
         */
        propNames = new String[]{
                "name",
                "password",
                "age",
                "astrology sign",
                "birthday",
                "martial status",
                "favorite card",
                "most dealt card",
                "lucky number",
                "unlucky number",
                "favorite color",
                "rating"

        };
        initProperties(propNames);
    }

    private void initProperties(String[] pNames) {

        for (String pName : pNames) {
            setProperty(pName, UNKNOWN_FIELD);
        }

        setProperty("astrology sign", "100");
        setProperty("name", "default");
        setProperty("rating", "1");

    }

    /**
     * Creates a .tb file saving all the users profile data
     *
     * @param name the name that will be used to name the output .tb file produced
     *             by this method
     */
    public void saveUserInfo(String name) {

        try {
            storeToXML(new FileOutputStream("src/saveddata/" + name + ".tb"), null);

        } catch (IOException e) {
            System.err.println("Could not save " + name + ".tb");
        }
    }

    /**
     *
     * @param name Name of the .tb file you are needing
     *
     * @throws IOException if no file is found with given parameter
     */
    public void loadUserInfo(String name) throws IOException {

        loadFromXML(new FileInputStream("src/" + name + ".tb"));

    }
}
