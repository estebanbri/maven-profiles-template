import org.apache.maven.settings.Settings;
import java.util.List;


public class Main {


    public static void main(String[] args) {
        Settings settings = new Settings();
        List<String> perfilesActivos = settings.getActiveProfiles();
        System.out.println(perfilesActivos);


    }
}
