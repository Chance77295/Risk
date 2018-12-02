import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import twitter4j.TwitterException;
import java.io.IOException;

public class TestMain {

    @Test
    public void testMain() throws TwitterException, IOException {
        String[0] args = "TEST";
        Main.main(args);
    }

}