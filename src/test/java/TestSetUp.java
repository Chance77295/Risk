import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.lang.StringBuilder;
import java.util.Arrays;
import java.util.Collections;
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
  public void fortifyTest() {
    Players player = new Players("Georgy",200);
    RiskBoard board = new RiskBoard();
    setUpGame game = new setUpGame();
    game.fortifyArmy(player, board, 30);    

  }
}
