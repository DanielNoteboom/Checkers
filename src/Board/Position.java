package Board;

/**
 * Represents the postion on the game board. Immutable class. For standard
 * game row valid position should be every other in 1-8 and Column should be 1-8.
 */
public class Position {
    //Row of position
    private int row;
    //Column of Position
    private int column;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }
    //get the row
    public int getRow() {
        return row;
    }
    //get the column
    public int getColumn() {
        return column;
    }
}
