package com.codurance.kata;

import java.util.Arrays;

public class Game {

    Board board = new Board();

    public String[] currentBoard(){
        return board.getCurrentBoard();
    }

    public String play(int position) {
        if (!board.getCurrentBoard()[position].equals(".")) {
            return "Position already occupied";
        }

        board.addMove(position);

        return checkHorizontalRow(board);

    }

    public String checkHorizontalRow(Board board){

        for (int j = 0; j < 7; j+=3) {
            if (board.getCurrentBoard()[j].equals(board.getCurrentBoard()[j+1]) &&
                    board.getCurrentBoard()[j+1].equals(board.getCurrentBoard()[j+2])) {
                return "YOU WON";
            }

        }
        return "Next move";
    }
}
