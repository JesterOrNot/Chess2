/**
 * Piece
 */
public abstract class Piece {
    private boolean isWhite;
    private boolean isFirstMove;
    public abstract boolean validMoves();
    public abstract void move();
}