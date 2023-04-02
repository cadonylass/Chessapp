package src.main.test.chesstools;

public class King extends Piecesfoundation {

    int xPosition;
    int yPosition;
    boolean isWhite = true;


    public King(boolean isWhite) {
        super(isWhite);
        this.isWhite = isWhite;

      ;
    }

    @Override
    public boolean ValidMove(int newX, int newY) {
        return false;
    }

//    public boolean ValidMove(int x, int y) {
//        if (isWhite) {
//            if (y == yPosition + 1 && Math.abs(x - xPosition) == 1) {
//                return true;
//            } else if (y == yPosition + 2 && x == xPosition && yPosition == 1) {
//                return true;
//            } else {
//                return false;
//            }
//        } else {
//            if (y == yPosition - 1 && Math.abs(x - xPosition) == 1) {
//                return true;
//            } else if (y == yPosition - 2 && x == xPosition && yPosition == 6) {
//                return true;
//            } else {
//                return false;
//            }
//        }
    }




