package Positions;
        ;

/**
 * Represents a black(classic color) piece in the checkers game
 */
public class BlackPiece implements Piece {
    //Is piece a king?
    private boolean isKing;

    public BlackPiece() {
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
