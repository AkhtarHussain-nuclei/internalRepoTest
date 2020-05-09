import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utils {
    public Properties fetchFromPropertiesFile(){
        Properties properties = new Properties();
        try {
            File file = new File("src/test/resources/config.properties");
            FileInputStream fileInput = new FileInputStream(file);
            properties.load(fileInput);
            fileInput.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }

        return properties;
    }
}
