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

        if (board.getCurrentBoard()[3].equals("X") &&
                board.getCurrentBoard()[4].equals("X") &&
                board.getCurrentBoard()[5].equals("X")) {
            return "YOU WON";
        }

        if (board.getCurrentBoard()[6].equals("X") &&
                board.getCurrentBoard()[7].equals("X") &&
                board.getCurrentBoard()[8].equals("X")) {
            return "YOU WON";
        }
        return "Next move";
    }

    public String checkHorizontalRow(Board board){

        String i = board.getCurrentBoard()[0];
        for (int j = 0; j < board.getCurrentBoard(); j++) {

        }

        String x = board.getCurrentBoard()[3];
        String z = board.getCurrentBoard()[6];

        return null;
    }
}
