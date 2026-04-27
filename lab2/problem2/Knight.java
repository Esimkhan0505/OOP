package lab2.problem2;

public class Knight extends Piece {
    public Knight(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position target) {
        int rowDiff = rowDifference(target);
        int colDiff = columnDifference(target);
        return (rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2);
    }
}
