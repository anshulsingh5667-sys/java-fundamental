package cscorner;

import java.util.Scanner;

public class Studentregis{
    public void displayBoard(int[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 1) {
                    System.out.print("X ");
                } else if (board[i][j] == 0) {
                    System.out.print("O ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
    public boolean makeMove(int[][] board, int row, int col, int player) {
        if (board[row][col] == 9) {
            board[row][col] = player;
            return true;
        }
        return false;
    }
    public static boolean checkWin(int[][] board, int player) {
        // Check rows, columns, and diagonals
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) return true;
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) return true;
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) return true;
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) return true;
        return false;
    }

    public static boolean isDraw(int[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 9) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Tic Tac Toe game started!");
        int[][] board = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = 9;
            }
        }
        TicTacToe game = new TicTacToe();
        game.displayBoard(board);
        boolean gameOn = true;
        int turn = 0;
        Scanner scanner = new Scanner(System.in);
        while (gameOn) {
            int currentPlayer = turn % 2;
            System.out.println("Player " + (currentPlayer == 0 ? "X" : "O") + ", enter your move (row and column 0-2): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            if (row < 0 || row > 2 || col < 0 || col > 2) {
                System.out.println("Invalid input. Row and column must be between 0 and 2.");
                continue;
            }
            if (game.makeMove(board, row, col, currentPlayer)) {
                game.displayBoard(board);
                if (checkWin(board, currentPlayer)) {
                    System.out.println("Player " + (currentPlayer == 0 ? "X" : "O") + " wins!");
                    break;
                }
                if (isDraw(board)) {
                    System.out.println("It's a draw!");
                    break;
                }
                turn++;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
        scanner.close();
    }
}