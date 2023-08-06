package org.example.TicTacToe;

public class Field {
    private final char[][] board;
    private final int size;



    public Field(int size) {
        this.size = size;
        board = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void displayBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isBoardFull() {
        boolean isFull = true;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == '-') {
                    isFull = false;
                }
            }
        }
        return isFull;
    }

    public boolean placeMark(int rows, int columns, char mark) {
        if (rows >= 0 && rows < size && columns >= 0 && columns < size) {
            if (board[rows][columns] == '-') {
                board[rows][columns] = mark;
                return true;
            }
        }
        return false;
    }

    public boolean checkForWin(char mark) {
        // Проверяем ряды(строки)
        for (int i = 0; i < size; i++) {
            int count = 0;
            for (int j = 0; j < size; j++) {
                if (board[i][j] == mark) {
                    count++;
                }
            }
            if (count == size) {
                return true;
            }
        }

        // Проверяем столбцы
        for (int i = 0; i < size; i++) {
            int count = 0;
            for (int j = 0; j < size; j++) {
                if (board[j][i] == mark) {
                    count++;
                }
            }
            if (count == size) {
                return true;
            }
        }

        // Проверяем диагонали
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (board[i][i] == mark) {
                count++;
            }
        }
        if (count == size) {
            return true;
        }

        count = 0;
        for (int i = 0; i < size; i++) {
            if (board[i][size - i - 1] == mark) {
                count++;
            }
        }
        if (count == size) {
            return true;
        }

        return false;
    }
    public int getSize() {
        return size;
    }
}
