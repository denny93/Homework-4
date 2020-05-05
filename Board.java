package TheKingisDead;

import javafx.scene.effect.Light;

public class Board {

        Light.Spot[][] boxes;

        public Board() {
            this.resetBoard();
        }

        private void resetBoard() {
        }

        public Light.Spot getBox(int x, int y) throws Exception {

            if (x < 0 || x > 5 || y < 0 || y > 5) {
                throw new Exception("Index out of bound");
            }

            return boxes[x][y];
        }

         public void resetBoard()
        {
        for (int i = 1; i < 4; i++) {
        for (int j = 0; j < 6; j++) {
            boxes[i][j] = new Spot(i, j, null);
        }
    }
    }
}
