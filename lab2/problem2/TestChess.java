package lab2.problem2;

public class TestChess {
    public static void main(String[] args) {
        Piece rook = new Rook(new Position(1, 1));
        Piece bishop = new Bishop(new Position(3, 3));
        Piece queen = new Queen(new Position(4, 4));
        Piece knight = new Knight(new Position(2, 2));
        Piece king = new King(new Position(5, 5));
        Piece pawn = new Pawn(new Position(2, 1), true);

        System.out.println(rook + " to (1, 8): " + rook.isLegalMove(new Position(1, 8)));
        System.out.println(bishop + " to (6, 6): " + bishop.isLegalMove(new Position(6, 6)));
        System.out.println(queen + " to (4, 8): " + queen.isLegalMove(new Position(4, 8)));
        System.out.println(knight + " to (4, 3): " + knight.isLegalMove(new Position(4, 3)));
        System.out.println(king + " to (6, 6): " + king.isLegalMove(new Position(6, 6)));
        System.out.println(pawn + " to (3, 1): " + pawn.isLegalMove(new Position(3, 1)));
    }
}
