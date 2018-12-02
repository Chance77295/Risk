
import java.io.IOException;
import twitter4j.TwitterException;


public class Main {
  public static void main(String[] args) throws TwitterException, IOException {
    if(args[0] == "TEST") {
      setUpGame game = new setUpGame();
      game.runningGame(true);
    }
    else{
      setUpGame game = new setUpGame();
      game.runningGame();
    }
  }
}
