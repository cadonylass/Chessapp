package src.main.test.chesstools;

public class Pawn extends Piecesfoundation {

    int xPosition;
    int yPosition;
    boolean isWhite;


    public Pawn(boolean isWhite) {
        super(isWhite);
    }

    public boolean ValidMove(int x, int y) {
        if (isWhite) {
            if (y == yPosition + 1 && Math.abs(x - xPosition) == 1) {
                return true;
            } else if (y == yPosition + 2 && x == xPosition && yPosition == 1) {
                return true;
            } else {
                return false;
            }
        } else {
            if (y == yPosition - 1 && Math.abs(x - xPosition) == 1) {
                return true;
            } else if (y == yPosition - 2 && x == xPosition && yPosition == 6) {
                return true;
            } else {
                return false;
            }
        }
    }
}