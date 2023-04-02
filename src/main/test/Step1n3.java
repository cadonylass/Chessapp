package src.main.test;

import com.siteintel.progtest.input.UserInputFile;

///Users/theodorewarren/Documents/mydev/mydevelopment/vault/test/data/sample-moves.txt"
public class Step1n3 {
    public void playGame() {
        try {
            // Create a new instance of UserInputFile
            UserInputFile input = new UserInputFile("/Users/theodorewarren/Documents/mydev/mydevelopment/vault/test/data/sample-moves.txt");

            // Initialize the starting positions
            int[] from = new int[2];
            int[] to = new int[2];
            int player = 1;

            // Keep making moves until there are no more moves to make
            while (input.nextMove(from, to)) {
                // Print the move that the player makes
                System.out.println("Player " + player + " moves from (" + from[0] + "," + from[1] + ") to (" + to[0] + "," + to[1] + ")");

                // Switch to the next player
                player = player == 1 ? 2 : 1;
            }

            // Print a message to indicate that the game has ended
            System.out.println("Game over.");

        } catch (Exception e) {
            // Print an error message if an exception occurs
            e.printStackTrace();
            System.exit(1);
        }
    }
}