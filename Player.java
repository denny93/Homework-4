package TheKingisDead;

public class Player {

    public boolean whiteSide;
    public boolean blackSide;

    public boolean isWhiteSide() {
        return this.whiteSide;
    }

    public boolean isBlackSide() {
        return this.blackSide;
    }

    public class Player1 extends Player {

        public Player1(boolean whiteSide) {
            this.whiteSide = whiteSide;
            this.whiteSide = true;
        }
    }

    public class Player2 extends Player {

        public Player2(boolean whiteSide) {
            this.whiteSide = blackSide;
            this.whiteSide = false;
        }
    }
}