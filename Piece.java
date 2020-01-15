/**
 * Piece
 */
public abstract class Piece {
    private boolean isWhite;
    private int value;
    private char icon;
    private boolean isFirstMove;

    public abstract boolean validMoves();

    public char getIcon() {
        return this.icon;
    }

    public void setIcon(char icon) {
        this.icon = icon;
    }

    public boolean isFirstMove() {
        return this.isFirstMove;
    }

    public void setFirstMove(boolean isFirstMove) {
        this.isFirstMove = isFirstMove;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isWhite() {
        return this.isWhite;
    }

    public void setWhite(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public abstract void move();

    public Piece(char icon, boolean isWhite) {
        this.setWhite(isWhite);
        this.setFirstMove(true);
        this.setIcon(icon);
    }
}