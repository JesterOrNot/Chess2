/**
 * Game
 */
public class Game {

    private int whiteScore;
    private int blackScore;
    private char[][] board;
    private boolean isWhiteTurn;

    public char[][] getBoard() {
        return this.board;
    }

    public void setBoard(char[][] board) {
        this.board = board;
    }

    public int getWhiteScore() {
        return this.whiteScore;
    }

    public boolean isWhiteTurn() {
        return this.isWhiteTurn;
    }

    public void setWhiteTurn(boolean isWhiteTurn) {
        this.isWhiteTurn = isWhiteTurn;
    }

    public int getBlackScore() {
        return this.blackScore;
    }

    public void setBlackScore(int blackScore) {
        this.blackScore = blackScore;
    }

    public void setWhiteScore(int whiteScore) {
        this.whiteScore = whiteScore;
    }
}