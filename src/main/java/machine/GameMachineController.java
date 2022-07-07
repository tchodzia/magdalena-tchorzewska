package machine;

import java.util.ArrayList;
import java.util.Scanner;

public class GameMachineController {
    GameMachine gameMachine = new GameMachine();
    GameMachineController() {}

    public void listGames(ArrayList<Game> games) {
        for (Game game : games) {
            System.out.println(game);
        }
    }

    public String chooseGameByUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose game by title: ");
        String gameName = scanner.nextLine();
        return gameName;
    }

    public Game getGame(ArrayList<Game> games, String name) {
        for (Game game : games) {
            if (game.name.trim().equals(name.trim())) {
                return game;
            }
        }
        return null;
    }

    public boolean payForGame(Game game, double amount) {
        gameMachine.pay(amount);
        if (game.price > gameMachine.getPaidAmount()) {
            System.out.println("You paid " + gameMachine.getPaidAmount() + " only.");
            //throw new GameMachineControllerException("");
            return false;
        } else if (game.price < gameMachine.getPaidAmount()) {
            System.out.println("You paid more (" + gameMachine.getPaidAmount() + ") than price.");
            System.out.println("Return amount: " + (gameMachine.getPaidAmount() - game.price));
            return true;
        } else {
            System.out.println("You bought a game!");
            return true;
        }

    }
}