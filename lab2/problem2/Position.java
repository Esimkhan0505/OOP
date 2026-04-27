package lab2.problem2;

public class Position {
    private int row;
    private int column;

    public Position(int row, int column) {
        if (row < 1 || row > 8 || column < 1 || column > 8) {
            throw new IllegalArgumentException("Row and column must be from 1 to 8.");
        }
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    @Override
    public String toString() {
        return "(" + row + ", " + column + ")";
    }
}
