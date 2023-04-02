package src.main.test;

public class board {
//depicts one form of board answer 2
    private static String[][] board;

    public void createSquares() {
        board = new String[8][8];
        // initialize the board with empty squares
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = " ";
            }
        }
    }

    public static void printBoard() {
        // print the board with row and column labels
        System.out.print("  a b c d e f g h\n");
        for (int i = 0; i < 8; i++) {
            System.out.print((8 - i) + " ");
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.print((8 - i) + "\n");
        }
        System.out.print("  a b c d e f g h\n");
    }

    public static void main(String[] args) {
        board init_board = new board();
        init_board.createSquares();
        printBoard();
    }
}
