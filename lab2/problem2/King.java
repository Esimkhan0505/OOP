package lab2.problem2;

public class King extends Piece {
    public King(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position target) {
        return rowDifference(target) <= 1 && columnDifference(target) <= 1;
    }
}
