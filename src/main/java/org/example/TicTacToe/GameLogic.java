package org.example.TicTacToe;

import java.util.Scanner;

public class GameLogic {
    private final Field field;
    private final char playerMark;
    private final char computerMark;

    public GameLogic(int size, char playerMark) {
        field = new Field(size);
        this.playerMark = playerMark;
        if (playerMark == 'X') {
            computerMark = 'O';
        } else {
            computerMark = 'X';
        }
    }

    public void play() {
        System.out.println("Приветствуем Вас в игре Крестики Нолики!");
        System.out.println("Вы играете за: " + playerMark);
        field.displayBoard();
        while (true) {
            playerTurn();
            if (field.checkForWin(playerMark)) {
                field.displayBoard();
                System.out.println("Поздравляю! Ты выиграл!");
                return;
            }
            if (field.isBoardFull()) {
                field.displayBoard();
                System.out.println("Ничья! Попробуй еще раз");
                return;
            }
            computerTurn();
            if (field.checkForWin(computerMark)) {
                field.displayBoard();
                System.out.println("Ты проиграл. Испытай свою удачу еще раз!");
                return;
            }
            field.displayBoard();
        }
    }

    private void playerTurn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите строку(ряд) и столбец (1-" + (field.getSize()) + "):");
        int rows = scanner.nextInt() - 1;
        int columns = scanner.nextInt() - 1;
        while (!field.placeMark(rows, columns, playerMark)) {
            System.out.println("Вы ввели неверные координаты. Попробуйте еще раз: ");
            rows = scanner.nextInt() - 1;
            columns = scanner.nextInt() - 1;
        }
    }

    private void computerTurn() {
        int rows, columns;
        do {
            rows = (int) (Math.random() * field.getSize());
            columns = (int) (Math.random() * field.getSize());
        } while (!field.placeMark(rows, columns, computerMark));
        System.out.println("Компьютер ходит:" + " по координатам (" + (rows + 1) + "," + (columns + 1) + ")");
    }
}