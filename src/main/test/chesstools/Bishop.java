package src.main.test.chesstools;

public class Bishop extends Piecesfoundation{


    int xPosition;
    int yPosition;
    boolean isWhite;


    public Bishop(boolean isWhite) {
        super(isWhite);
        this.isWhite = isWhite;

        ;
    }


    public boolean ValidMove(int x, int y) {
        int currX = getXPosition();
        int currY = getYPosition();
        return true;
}



}


