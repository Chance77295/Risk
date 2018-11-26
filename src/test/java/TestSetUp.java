import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import twitter4j.TwitterException;

public class TestSetUp {

  @Test
  public void initBoardGame() {
    setUpGame game = new setUpGame();
    game.creatingBoard();

    game.numberOfPlayerPlaying(3);

    game.initPlayer(true);

    game.chooseFirstTurn(true);

    //game.claimCountry(true);

    game.setArmyToCountry(true);
  }

  @Test 
  public void runGameTest() throws TwitterException, IOException{
    setUpGame game = new setUpGame();
    game.runningGame();

  }
}
