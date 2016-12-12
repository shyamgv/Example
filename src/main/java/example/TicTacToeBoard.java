package example;


public class TicTacToeBoard {

    final static int SIZE = 3;
    private static char[][] board;

    public TicTacToeBoard(char[][] board) {
        this.board = board;
    }

    private static char character = ' ';
    private int resetCount = 0;


    // tries to play c (X or O) at row, col
// returns true if square was legal and not occupied
    public boolean makeMove(int row, int col, char c) {
        character = c;
        while (board[row][col] != ' ') {
            return false;
        }
        return true;
    }

    // returns a string representation of the board
    public String toString() {
        if (resetCount == 0) {
            for (int i = 0; i < board.length; i++)
                for (int j = 0; j < board[0].length; j++)
                    board[i][j] = ' ';
        }
        resetCount++;

        int numRow = board.length;
        int numCol = board[0].length;
        StringBuffer str = new StringBuffer("   ");
        str.append('\n');
        for (int i = 0; i < numRow; i++) {

            str.append(" " + "|");
            for (int j = 0; j < numCol; j++) {
                str.append("   " + board[i][j]);
            }

            str.append("|\n");
        }
        System.out.println();
        return str.toString();
    }


    public boolean isWin() {
        int i, j;
        boolean win = false;

        // Check win by a row
        for (i = 0; i < board.length && !win; i++) {
            for (j = 0; j < board[0].length; j++) {
                if (board[i][j] != character)
                    break;
            }
            if (j == board[0].length)
                win = true;
        }

        // Check win by a column
        for (j = 0; j < board[0].length && !win; j++) {
            for (i = 0; i < board.length; i++) {
                if (board[i][j] != character)
                    break;
            }
            if (i == board.length)
                win = true;
        }

        // Check win by a diagonal (1)
        if (!win) {
            for (i = 0; i < board.length; i++) {
                if (board[i][i] != character)
                    break;
            }
            if (i == board.length)
                win = true;
        }

        // Check win by a diagonal (2)
        if (!win) {
            for (i = 0; i < board.length; i++) {
                if (board[i][board.length - 1 - i] != character)
                    break;
            }
            if (i == board.length)
                win = true;
        }

        // Finally return win
        return win;
    }
}