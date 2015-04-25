package Positions;

/**
 * Represents a red(classic color) piece in the checkers game
 */
public class RedPiece implements Piece {
    //Is piece a king?
    private boolean isKing;

    public RedPiece() {
        isKing = false;
    }
    //Returs whether piece is a king
    public boolean isKing() {
        return isKing;
    }

    //turns piece into a king
    public void makeKing() {
        isKing = true;
    }
}
