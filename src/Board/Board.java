package Board;

import Positions.*;

/*
 * Mutable class that contains state of the board.
 */
public class Board {
    private Space[][] board;
    private int size;


    public Board(int size) {
        board = new Space[size][size];
        this.size = size;
    }
    /**
     * Method to place a piece on the board
     * @param p1 Position place piece in.
     * @return Whether piece was placed
     */
    public boolean placePiece(Position p1, Space p2) {
        board[p1.getRow()][p1.getColumn()] = p2;
        return true;
    }

    /**
     * Prints out state of the board
     */
    //TODO some way to identify different objects
    public void printBoard() {
        System.out.print("  ");
        for(int i = 0; i < size; i++){
            System.out.print(i);
        }
        System.out.println();
        for(int i = 0; i < board.length; i++) {
            System.out.print(i + " ");
            for(int j = 0; j < board[i].length; j++) {
                Space s = board[i][j];
                if(s instanceof BlackPiece) {
                   BlackPiece b = (BlackPiece) s;
                   if(b.isKing())
                       System.out.print("B");
                   else
                       System.out.print("b");
                } else if (s instanceof RedPiece) {
                    RedPiece r = (RedPiece) s;
                    if(r.isKing())
                        System.out.print("R");
                    else
                        System.out.print("r");
                } else {
                    EmptyPosition e = (EmptyPosition) s;
                    if(e.isValid())
                        System.out.print("E");
                    else
                        System.out.print(" ");

                }
            }
            System.out.println();
        }
    }
    //TODO Error checking
    //Get specified space at position
    public Space getSpace(Position p) {
        return board[p.getRow()][p.getColumn()];
    }
}
