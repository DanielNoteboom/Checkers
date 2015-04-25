
/**
 * Class that plays the actual checkers game
 */
import Board.Position;
import Game.Game;
public class PlayGame {

    public static void main(String[] args) {
        Game g = new Game();
        while(!g.endGame()) {
            String move = getNextMove();
            g.nextMove(new Position('a',0), new Position('a',0));
        }
    }

    public static String getNextMove() {
        return "nextMove";
    }


    public static void introGame() {
        System.out.println("Welcome to checkers");
        System.out.println("Press start to play");//TODO Actually require user to type information to play game
    }

    public static void finalGame() {
        System.out.println("End of Game");
    }
}
