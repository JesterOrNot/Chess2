/**
 * Piece
 */
public abstract class Piece {
    private boolean isWhite;
    public char icon;
    private boolean isFirstMove;

    public abstract boolean validMoves();

    public abstract void move();

    public Piece(char icon, boolean isWhite) {
        this.isWhite = isWhite;
        this.isFirstMove = true;
        this.icon = icon;
    }
}