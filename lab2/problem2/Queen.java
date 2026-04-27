package lab2.problem2;

public class Queen extends Piece {
    public Queen(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position target) {
        boolean rookMove = getPosition().getRow() == target.getRow()
                || getPosition().getColumn() == target.getColumn();
        boolean bishopMove = rowDifference(target) == columnDifference(target);
        return rookMove || bishopMove;
    }
}
