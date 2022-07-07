package machine;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GameMachine {
    private ArrayList<Game> games = new ArrayList<>();
    private double paidAmount;

    GameMachine() {
    }

    public void pay(double amount) {
        paidAmount = amount;
    }

    public double getPaidAmount() {
        return paidAmount;
    }
    public ArrayList<Game> readGames() {
        File file = null;
        try {
            file = new File("src\\main\\java\\machine\\games.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Game game = mapLineToGame(line);
                games.add(game);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku!");
            e.printStackTrace();
        }

        return games;
    }


    private Game mapLineToGame(String line) {
        try {
            String[] elements = line.split(";");
            String title = elements[0];
            double price = Double.parseDouble(elements[1]);
            Game game = new Game(title, price);
            return game;
        } catch (Exception exception) {
            //throw new Exception("Niepoprawny format pliku!!!! dla linii: " + line);
            //throw new BookMappingException("Niepoprawny format pliku!!!! dla linii: " + line, line);
        }
        return null;
    }
}
