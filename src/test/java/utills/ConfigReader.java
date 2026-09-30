package utills;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    static Properties properties;

    public static void loadConfig()
    {
        try {
            FileInputStream file = new FileInputStream("src/test/resources/config/config.properties");
             properties=new Properties();
             properties.load(file);
             file.close();
        }
        catch (Exception ignored)
        {

        }
    }

    public static String get(String key)
    {
        return properties.getProperty(key);
    }


}
