package com.codurance.kata;

public class Game {

    Board board = new Board();

    public String[] currentBoard(){
        return board.getCurrentBoard();
    }

    public void play(String token, int position) {
        board.addMove(token, position);
    }
}
