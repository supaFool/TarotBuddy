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
        //todo set Close button to save as well
        propNames = new String[]{
                "name",
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
        for (int x = 0; x < pNames.length; x++) {
            setProperty(pNames[x], UNKNOWN_FIELD);
        }
    }

    public void saveUserInfo(String name) {
        try {
            storeToXML(new FileOutputStream("src/" + name + ".tb"), null);
        } catch (IOException e) {
            System.err.println("Could not save " + name + ".tb");
        }
    }

    public void loadUserInfo(String name) {
        try {
            loadFromXML(new FileInputStream("src/" + name + ".tb"));
        } catch (IOException e) {
            System.err.println("Could not load UserInfo");
        }
    }
}
