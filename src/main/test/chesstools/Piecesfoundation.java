package src.main.test.chesstools;

public abstract class Piecesfoundation {
    private int xPosition;
    private int yPosition;
    private boolean isWhite;

    public Piecesfoundation(int xPosition, int yPosition, boolean isWhite) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.isWhite = isWhite;
    }

    public Piecesfoundation(boolean isWhite) {
    //    this.xPosition = xPosition;
  //      this.yPosition = yPosition;
        this.isWhite = isWhite;
    }


    public abstract boolean ValidMove(int newX, int newY);

    public int getXPosition() {
        return xPosition;
    }

    public void setXPosition(int newXPosition) {
        xPosition = newXPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

    public void setYPosition(int newYPosition) {
        yPosition = newYPosition;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean isWhite) {
        this.isWhite = isWhite;
    }
}

