package src.main.test;

import com.bullionvault.test.chesstools.*;

public class board2 {

    private static Piecesfoundation[][] Board2;
  //  depicts 2nd form of board
    ////depicts one form of board answer 2



    public board2() {
        Board2 = new Piecesfoundation[8][8];
        // Initialize white pieces
        Board2[0][0] = new Rook(true);
        Board2[0][1] = new Knight(true);
        Board2[0][2] = new Bishop(true);
        Board2[0][3] = new Queen(true);
        Board2[0][4] = new King(true);
        Board2[0][5] = new Bishop(true);
        Board2[0][6] = new Knight(true);
        Board2[0][7] = new Rook(true);
        for (int i = 0; i < 8; i++) {
            Board2[1][i] = new Pawn(true);
        }
        // Initialize black pieces
        Board2[7][0] = new Rook(false);
        Board2[7][1] = new Knight(false);
        Board2[7][2] = new Bishop(false);
        Board2[7][3] = new Queen(false);
        Board2[7][4] = new King(false);
        Board2[7][5] = new Bishop(false);
        Board2[7][6] = new Knight(false);
        Board2[7][7] = new Rook(false);
        for (int i = 0; i < 8; i++) {
            Board2[6][i] = new Pawn(false);
        }
    }

    // Implement getters and setters for the board array
    public static Piecesfoundation getPiece(int x, int y) {
        return Board2[x][y];
    }

    public void setPiece(int x, int y, Piecesfoundation piece) {
        Board2[x][y] = piece;
    }
}
