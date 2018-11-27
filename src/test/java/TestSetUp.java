import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import twitter4j.TwitterException;
import java.io.ByteArrayInputStream;
import java.util.Properties;
import java.io.File;
import java.io.FileReader;

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
  public void doNOTfortifyTest() {
    Players player = new Players("Georgy",200);
    RiskBoard board = new RiskBoard();
    setUpGame game = new setUpGame();
    ByteArrayInputStream in = new ByteArrayInputStream("-1".getBytes());
    System.setIn(in);
    game.fortifyArmy(player, board, 30);

    System.setIn(System.in);
  }

  @Test
  public void testClaimCountry () {
    setUpGame game = new setUpGame();
    game.claimCountry(true);

  }

/*
  @Test
  public void runningGameTest() throws TwitterException, IOException{
    setUpGame game = new setUpGame();
    Properties p = new Properties();
    p.load(new FileReader(new File("secrets_CTC.prop")));
    game.runningGame();

  }
*/
  /*
  @Test
  public void listFortifyTest() {
    Players player = new Players("Georgy",200);
    RiskBoard board = new RiskBoard();
    setUpGame game = new setUpGame();
    ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
    System.setIn(in);
    game.fortifyArmy(player, board, 30);

    System.setIn(System.in);
  }
*/

}