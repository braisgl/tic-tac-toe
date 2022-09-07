package com.codurance.kata;

public class Game {

    Board board = new Board();

    public String[] currentBoard(){
        return board.getCurrentBoard();
    }

    public String play(String token, int position) {
        if (!board.getCurrentBoard()[position].equals(".")) {
            return "Position already occupied";
        }

        board.addMove(token, position);

        if (board.getCurrentBoard()[0].equals("X") &&
                board.getCurrentBoard()[1].equals("X") &&
                board.getCurrentBoard()[2].equals("X")) {
            return "YOU WON";
        }
        return "Next move";
    }
}
