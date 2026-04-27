package lab2.problem2;

public class Bishop extends Piece {
    public Bishop(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position target) {
        return rowDifference(target) == columnDifference(target);
    }
}
