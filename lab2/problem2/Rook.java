package lab2.problem2;

public class Rook extends Piece {
    public Rook(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position target) {
        return getPosition().getRow() == target.getRow()
                || getPosition().getColumn() == target.getColumn();
    }
}
