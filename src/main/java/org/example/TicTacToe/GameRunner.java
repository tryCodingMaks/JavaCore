package org.example.TicTacToe;

public class GameRunner {
    public static void main(String[] args) {
        GameLogic game = new GameLogic(3, 'X');
        game.play();
    }
}
