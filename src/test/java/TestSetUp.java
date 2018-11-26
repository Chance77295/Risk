import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import twitter4j.TwitterException;
import java.io.ByteArrayInputStream;

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
  public void fortifyTest() {
    Players player = new Players("Georgy",200);
    RiskBoard board = new RiskBoard();
    setUpGame game = new setUpGame();
    ByteArrayInputStream in = new ByteArrayInputStream("China".getBytes());
    System.setIn(in);
    game.fortifyArmy(player, board, 30);

    System.setIn(System.in);
  }
  public void doNOTfortifyTest() {
    Players player = new Players("Georgy",200);
    RiskBoard board = new RiskBoard();
    setUpGame game = new setUpGame();
    ByteArrayInputStream in = new ByteArrayInputStream("-1".getBytes());
    System.setIn(in);
    game.fortifyArmy(player, board, 30);

    System.setIn(System.in);
  }

  public void listFortifyTest() {
    Players player = new Players("Georgy",200);
    RiskBoard board = new RiskBoard();
    setUpGame game = new setUpGame();
    ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
    System.setIn(in);
    game.fortifyArmy(player, board, 30);

    System.setIn(System.in);
  }
}
