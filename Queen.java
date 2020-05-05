package TheKingisDead;

import javafx.scene.effect.Light;

public class Queen {
    private final Object start;

    public boolean Queen(boolean white) {
        public boolean canMove (Board board, Light.Spot start, Light.Spot Object end;
        end){ 
            return false; }
            
            public boolean canMoved (Board board, Spot start, Spot end){
            if (end.takeWhite().isWhite() == this.isWhite()) {
                return false;
            }
            int x = Math.abs(start.takeX() - end.takeX());
            int y = Math.abs(start.takeY() - end.takeY());
            if (x + y == 2) {
                // check if this move will not result being attacked if so return true
                return true;
            }
        }
    }
}
  