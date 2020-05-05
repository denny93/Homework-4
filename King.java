package TheKingisDead;

import javafx.scene.effect.Light;

public class King extends Piece {

    private boolean castlingDone = false;
    private Object Spot;

    public King(boolean white) {
        super(white);
    }

    @Override
    public boolean canMove(Board board, Light.Spot start, Light.Spot end) {
        return false;
    }

    public boolean isCastlingDone() {
        return this.castlingDone == true;
    }

    public void setCastlingDone(boolean castlingDone) {
        this.castlingDone = castlingDone;
    }

    @Override
    public boolean canMove(Board board, Spot start, Spot end) {
        //We can`t move piece to a Spot that has a piece of the same color
        if (end.takeWhite().isWhite() == this.isWhite()) {
            return false;
        }
        int x = Math.abs(start.takeX() - end.takeX());
        int y = Math.abs(start.takeY() - end.takeY());
        if (x + y == 1) {
            // check if this move will not result being attacked if so return true
            return true;
        }
        return this.isValidCastling(board, start, end);
    }

    private boolean isValidCastling(Board board, Spot start, Spot end) {
        if (this.isValidCastling()) {
            return false;

        }
    }
}

