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
    RiskBoard Board = new RiskBoard();
    game.creatingBoard("src/test/java/Countries.txt","src/test/java/BorderingCountries.txt","src/test/java/Continents.txt", Board);

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
    RiskBoard Board = new RiskBoard();
    final String[] countries = {"Alaska","Alberta","Central America","Eastern United States",
								"Greenland","Northwest Territory","Ontario","Quebec","Western United States",
								"Argentina","Brazil","Venezuela","Great Britain","Iceland","Northern Europe",
								"Scandinavia","Southern Europe","Ukraine","Western Europe","Congo","East Africa",
								"Egypt","Madagascar","North Africa","South Africa","Afghanistan","China","India",
								"Irkutsk","Japan","Kamchatka","Middle East","Mongolia","Siam","Siberia","Ural",
                "Yakutsk","Eastern Australia","Indonesia","LotR","New Guinea","Western Australia"};
    final String[] continents = {"North America","South America","Asia","Africa","Europe","Australia"};
    final String[] borders = {};
    RiskBoard board = new RiskBoard();
    board.SetBoard(countries, continents, borders);
    game.claimCountry(true,Board);

  }

  @Test
  public void TestTwoPlayers() {
    setUpGame game = new setUpGame();
    RiskBoard Board = new RiskBoard();

    game.creatingBoard("src/test/java/Countries.txt","src/test/java/BorderingCountries.txt","src/test/java/Continents.txt", Board);

    game.numberOfPlayerPlaying(2);

    game.initPlayer(true);

    game.chooseFirstTurn(true);

    game.setArmyToCountry(true);
  }

  @Test
  public void TestFourPlayers() {
    setUpGame game = new setUpGame();
    RiskBoard Board = new RiskBoard();

    game.creatingBoard("src/test/java/Countries.txt","src/test/java/BorderingCountries.txt","src/test/java/Continents.txt", Board);

    game.numberOfPlayerPlaying(4);

    game.initPlayer(true);

    game.chooseFirstTurn(true);

    game.setArmyToCountry(true);
  }

  @Test
  public void TestFivePlayers() {
    setUpGame game = new setUpGame();
    RiskBoard Board = new RiskBoard();

    game.creatingBoard("src/test/java/Countries.txt","src/test/java/BorderingCountries.txt","src/test/java/Continents.txt", Board);

    game.numberOfPlayerPlaying(5);

    game.initPlayer(true);

    game.chooseFirstTurn(true);

    game.setArmyToCountry(true);
  }

  @Test
  public void TestSixPlayers() {
    setUpGame game = new setUpGame();
    RiskBoard Board = new RiskBoard();

    game.creatingBoard("src/test/java/Countries.txt","src/test/java/BorderingCountries.txt","src/test/java/Continents.txt", Board);

    game.numberOfPlayerPlaying(6);

    game.initPlayer(true);

    game.chooseFirstTurn(true);

    game.setArmyToCountry(true);
  }

  public void TestClaimCountry() {
    setUpGame game = new setUpGame();
    RiskBoard Board = new RiskBoard();

    game.creatingBoard("src/test/java/Countries.txt","src/test/java/BorderingCountries.txt","src/test/java/Continents.txt", Board);

    game.numberOfPlayerPlaying(3);

    game.initPlayer(true);

    game.chooseFirstTurn(true);

    game.claimCountry(true,Board);

    game.setArmyToCountry(true);
  }

}