import java.io.FileInputStream;
import java.sql.DriverManager;
import java.util.Properties;

public class PasswordExposure {

    public static void main(String[] args) {
        try {
            String url=null,usr=null;
            Properties prop = new Properties();
            prop.load(new FileInputStream("config.properties"));
            String password = prop.getProperty("password");
            DriverManager.getConnection(url, usr, password);// non-compalint

        } catch (Exception e) {

            e.printStackTrace(); /* FLAW: Print stack trace to console on error */
        }

    }
}
