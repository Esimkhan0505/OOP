package lab2.problem2;

public class Pawn extends Piece {
    private boolean white;

    public Pawn(Position position, boolean white) {
        super(position);
        this.white = white;
    }

    @Override
    public boolean isLegalMove(Position target) {
        int direction = white ? 1 : -1;
        int rowChange = target.getRow() - getPosition().getRow();
        int colChange = target.getColumn() - getPosition().getColumn();

        return rowChange == direction && colChange == 0;
    }
}
