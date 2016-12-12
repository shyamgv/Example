package example;

import java.util.Scanner;

/**
 * Question 11
 */
public class TicTacToe {

    public static Scanner sc = new Scanner(System.in);
    final static int SIZE = 3;
    static char[][] board = new char[SIZE][SIZE];

    public static void main(String[] args) {
        System.out.println("Welcome! Tic-Tac-Toe is a two player game.\n");
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard(board);
        System.out.println(ticTacToeBoard.toString());
        System.out.println("Enter player one's name:");
        String playerOneName = sc.next();
        System.out.println("Enter player Two's name:");
        String playerTwoName = sc.next();

        char playerOneSymbol = 'x';
        char playerTwoSymbol = 'o';
        System.out.println();

        int turn;
        int remainCount = SIZE * SIZE;
        turn = 0;
        board = playerPlay(board, playerOneSymbol, playerOneName);
        turn = 1;
        board = playerPlay(board, playerTwoSymbol, playerTwoName);

        showBoard(board);
        remainCount--;

        boolean done = false;
        int winner = -1;

        while (!done && remainCount > 0) {
            done = ticTacToeBoard.isWin();

            if (done)
                winner = turn;
            else {
                turn = (turn + 1) % 2;

                if (turn == 0)
                    playerPlay(board, playerOneSymbol, playerOneName);
                else
                    playerPlay(board, playerTwoSymbol, playerTwoName);

                showBoard(board);
                remainCount--;
            }
        }

        if (winner == 0)
            System.out.println("\n** Game Over - " + playerOneName + " WINS!!!");
        else if (winner == 1)
            System.out.println("\n** Game Over - " + playerTwoName + " WINS!!!");
        else
            System.out.println("\nIts a Tie");

    }

    public static char[][] playerPlay(char[][] brd, char sym, String playerName) {
        System.out.println("\nIt is " + playerName + " turn.");
        System.out.println("Pick a row between 1 and 3:");
        int rowIndex = sc.nextInt() - 1;
        System.out.println("Pick a column between 1 and 3:");
        int colIndex = sc.nextInt() - 1;

        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard(brd);
        boolean illegalOrNot = ticTacToeBoard.makeMove(rowIndex, colIndex, sym);
        if (!illegalOrNot){
            System.out.print("\nILLEGAL CHOICE! TRY AGAIN... ");
            rowIndex = sc.nextInt() - 1;
            colIndex = sc.nextInt() - 1;
        }

        brd[rowIndex][colIndex] = sym;
        return brd;
    }


    public static void showBoard(char[][] brd)
    {
        int numRow = brd.length;
        int numCol = brd[0].length;
        System.out.print("    ");
        System.out.print('\n');

        for (int i = 0; i < numRow; i++) {
            System.out.print(" " + "|");
            for (int j = 0; j < numCol; j++) {
                System.out.print("   "+brd[i][j]);
            }
            System.out.println("|");
        }
        System.out.println();
    }

}
