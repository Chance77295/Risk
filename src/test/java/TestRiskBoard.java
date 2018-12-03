import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.BufferedReader;
import java.lang.StringBuilder;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class TestRiskBoard {
/*
  @Test
  public void testSetBoard() throws FileNotFoundException,IOException {
        setUpGame game = new setUpGame();
        final String[] countries = {"Alaska","Alberta","Central America","Eastern United States",
                                    "Greenland","Northwest Territory","Ontario","Quebec","Western United States",
                                    "Argentina","Brazil","Venezuela","Great Britain","Iceland","Northern Europe",
                                    "Scandinavia","Southern Europe","Ukraine","Western Europe","Congo","East Africa",
                                    "Egypt","Madagascar","North Africa","South Africa","Afghanistan","China","India",
                                    "Irkutsk","Japan","Kamchatka","Middle East","Mongolia","Siam","Siberia","Ural",
                    "Yakutsk","Eastern Australia","Indonesia","LotR","New Guinea","Western Australia"};
        final String[] continents = {"North America","South America", "Australia", "Asia", "Africa", "Europe"};
        String fileLine;
       BufferedReader reader = new BufferedReader(new FileReader("src/test/java/BorderingCountries.txt"));
  		StringBuilder stringBuilder = new StringBuilder();
  		while((fileLine = reader.readLine()) != null){
  			stringBuilder.append(fileLine);
  		}
  		String fileInput = stringBuilder.toString();
  		final String[] borderingCountries = fileInput.split("\t");
        RiskBoard board = new RiskBoard();
        board.SetBoard(countries, continents, borderingCountries);
        board.returnCountries();
        board.returnNameOfCountry("China");
        board.returnContinents();
        board.returnNameOfContinent("North America");
  }
  
  @Test
  public void testSetArmy() throws IOException,FileNotFoundException {
    setUpGame game = new setUpGame();
        final String[] countries = {"Alaska","Alberta","Central America","Eastern United States",
                                    "Greenland","Northwest Territory","Ontario","Quebec","Western United States",
                                    "Argentina","Brazil","Venezuela","Great Britain","Iceland","Northern Europe",
                                    "Scandinavia","Southern Europe","Ukraine","Western Europe","Congo","East Africa",
                                    "Egypt","Madagascar","North Africa","South Africa","Afghanistan","China","India",
                                    "Irkutsk","Japan","Kamchatka","Middle East","Mongolia","Siam","Siberia","Ural",
                    "Yakutsk","Eastern Australia","Indonesia","LotR","New Guinea","Western Australia"};
        final String[] continents = {"North America","South America", "Australia", "Asia", "Africa", "Europe"};
        String fileLine;
       BufferedReader reader = new BufferedReader(new FileReader("src/test/java/BorderingCountries.txt"));
  		StringBuilder stringBuilder = new StringBuilder();
  		while((fileLine = reader.readLine()) != null){
  			stringBuilder.append(fileLine);
  		}
  		String fileInput = stringBuilder.toString();
  		final String[] borderingCountries = fileInput.split("\t");
        Players player = new Players("Georgy",30);
        RiskBoard board = new RiskBoard();
        board.SetBoard(countries, continents, borderingCountries);
        board.setPlayer("China", player);
        board.returnPlayer("China");
        board.setNumOfArmies("China", 5);
        board.returnNumOfArmies("China");

  }
  */
  @Test
  public void testReturnMap(){
    
    String countryFile = "src/test/java/Countries.txt";
    String borderingCountryFile = "src/test/java/BorderingCountries.txt";
    String continentFile = "src/test/java/Continents.txt";
    String fileLine;
    RiskBoard board = new RiskBoard();
    
    try{
  		BufferedReader reader = new BufferedReader(new FileReader(countryFile));
  		StringBuilder stringBuilder = new StringBuilder();
  		while((fileLine = reader.readLine()) != null) {
  			stringBuilder.append(fileLine);
		   }
  		String fileInput = stringBuilder.toString();
  		String[] Countries = fileInput.split("\t");
  		System.out.println(Arrays.toString(Countries) + "\n");

  		reader = new BufferedReader(new FileReader(borderingCountryFile));
  		stringBuilder = new StringBuilder();
  		while((fileLine = reader.readLine()) != null){
  			stringBuilder.append(fileLine);
  		}
  		fileInput = stringBuilder.toString();
  		String[] borderingCountries = fileInput.split("\t");
  		System.out.println(Arrays.toString(borderingCountries));

  		reader = new BufferedReader(new FileReader(continentFile));
  		stringBuilder = new StringBuilder();
  		while((fileLine = reader.readLine()) != null) {
  			stringBuilder.append(fileLine);
  		}
  		fileInput = stringBuilder.toString();
  		String[] Continents = fileInput.split("\t");
  		System.out.println(Arrays.toString(Continents) + "\n");

		  board.SetBoard(Countries, Continents, borderingCountries);
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(IOException e) {
			System.out.println(e.getMessage());
    }
    
    board.returnCountries();
    board.returnNameOfCountry("China");

    board.returnBorders("China");
    board.verifyBorder("China", "India");
    board.verifyBorder("China", "Brazil");

    board.returnContinents();
    board.returnNameOfContinent("Asia");
    board.returnLocalCountries("Asia");
    
    
  }

  @Test
  public void testCountryStatus(){
    
    String countryFile = "src/test/java/Countries.txt";
    String borderingCountryFile = "src/test/java/BorderingCountries.txt";
    String continentFile = "src/test/java/Continents.txt";
    String fileLine;
    RiskBoard board = new RiskBoard();
    Players player = new Player("Georgy",10);
    
    try{
  		BufferedReader reader = new BufferedReader(new FileReader(countryFile));
  		StringBuilder stringBuilder = new StringBuilder();
  		while((fileLine = reader.readLine()) != null) {
  			stringBuilder.append(fileLine);
		   }
  		String fileInput = stringBuilder.toString();
  		String[] Countries = fileInput.split("\t");
  		System.out.println(Arrays.toString(Countries) + "\n");

  		reader = new BufferedReader(new FileReader(borderingCountryFile));
  		stringBuilder = new StringBuilder();
  		while((fileLine = reader.readLine()) != null){
  			stringBuilder.append(fileLine);
  		}
  		fileInput = stringBuilder.toString();
  		String[] borderingCountries = fileInput.split("\t");
  		System.out.println(Arrays.toString(borderingCountries));

  		reader = new BufferedReader(new FileReader(continentFile));
  		stringBuilder = new StringBuilder();
  		while((fileLine = reader.readLine()) != null) {
  			stringBuilder.append(fileLine);
  		}
  		fileInput = stringBuilder.toString();
  		String[] Continents = fileInput.split("\t");
  		System.out.println(Arrays.toString(Continents) + "\n");

		  board.SetBoard(Countries, Continents, borderingCountries);
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(IOException e) {
			System.out.println(e.getMessage());
    }
    board.returnExtraArmies("Asia");

    board.setPlayer("China", player);
    board.returnPlayer("China");
    
    board.setNumOfArmies("China", 5);
    board.returnNumOfArmies("China");

    board.returnVacancy();
    
  }
}