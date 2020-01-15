/**
 * Game
 */
public class Game {

    private int whiteScore;
    private int blackScore;
    private boolean isWhiteTurn;

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