package Game;

import Board.Position;
import Positions.*;
import Board.Board;
/**
 * Game class keeps track of state of a checkers game. Board is standard
 * 8 X 8 and should have a max of 12 pieces of either black or red, of which
 * can only be on certain diagonals on the board. Game state should reflect
 * moves that have happened previously in the game. Rules are standard checkers rules
 *
 * I-Invalid
 * E-Emtpy
 * R-Red Piece
 * W-Black Piece
 */
public class Game {
    private static final String INITIAL_BOARD =
            "IRIRIRIR\nRIRIRIRI\nIRIRIRIR\nEIEIEIEI\nIEIEIEIE\nBIBIBIBI\nIBIBIBIB\nBIBIBIBI";
    private static final int SIZE = 8;
    //Variable that says whose turn it is
    private Piece currentPlayer;
    //curent gameBoard
    private Board gameBoard;


    /**
     * Initiliazes checker game to proper starting positions
     */
    public void initializeGame() {
        currentPlayer = new RedPiece();
        gameBoard = new Board(SIZE);
        String[] rows = INITIAL_BOARD.split("\n");

        for(int i = 0; i < rows.length; i++) {
            for(int j = 0; j < rows[i].length(); j++) {
                char c = rows[i].charAt(j);
                Position p = new Position(i,j);

                switch (c) {
                    case 'I':
                        EmptyPosition e = new EmptyPosition(false);
                        gameBoard.placePiece(p, e);
                        break;
                    case 'E':
                        e = new EmptyPosition(true);
                        gameBoard.placePiece(p, e);
                        break;
                    case 'R':
                        RedPiece r = new RedPiece();
                        gameBoard.placePiece(p, r);
                        break;
                    case 'B':
                        BlackPiece b = new BlackPiece();
                        gameBoard.placePiece(p, b);
                        break;

                }
            }
        }
    }

    /**
     *
     * @param p1 initial position piece
     * @param p2 position piece
     * @return true if valid move, false otherwise
     *
     * nextMove takes in a requested Move and performs it
     * if it's a fair move.
     */
    //TODO Implement rules
    public boolean nextMove(Position p1, Position p2) {
        gameBoard.placePiece(p2, gameBoard.getSpace(p1));
        return true;
    }


    /**
     *
     * @return true if game is over, false otherwise
     */
    public boolean endGame() {
        throw new UnsupportedOperationException("not implemented yet");
    }

    public void printBoard() {
        gameBoard.printBoard();
    }
}
