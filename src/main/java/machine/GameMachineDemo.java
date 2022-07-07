package machine;

import java.util.ArrayList;

public class GameMachineDemo {
    public static void main(String[] args) {
        GameMachine gameMachine = new GameMachine();
        ArrayList<Game> games = gameMachine.readGames();
        GameMachineController gameMachineController = new GameMachineController();
        gameMachineController.listGames(games);
        String gameName = gameMachineController.chooseGameByUser();
        System.out.println(gameName);
        Game chosenGame = gameMachineController.getGame(games, gameName);
        System.out.println(chosenGame);
        gameMachineController.payForGame(chosenGame, 200);
    }
}
