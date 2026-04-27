package lab2.problem2;

public abstract class Piece {
    private Position position;

    public Piece(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void moveTo(Position newPosition) {
        if (isLegalMove(newPosition)) {
            position = newPosition;
        } else {
            System.out.println("Illegal move from " + position + " to " + newPosition);
        }
    }

    public abstract boolean isLegalMove(Position target);

    protected int rowDifference(Position target) {
        return Math.abs(position.getRow() - target.getRow());
    }

    protected int columnDifference(Position target) {
        return Math.abs(position.getColumn() - target.getColumn());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " at " + position;
    }
}
