package com.codurance.kata;

import java.util.Arrays;

public class Game {

    Board board = new Board();
    Player player = new Player(board);
    public String[] currentBoard(){
        return board.getCurrentBoard();
    }

    public String play(int position) {
        if (!board.getCurrentBoard()[position].equals(".")) {
            return "Position already occupied";
        }

        player.addMove(position);
        return winChecker(board);

    }

    private String winChecker(Board board) {
        if(checkVerticalRow(board)||checkHorizontalRow(board)){
            return "YOU WON";
        } return"Next Move";
    }

    public boolean checkHorizontalRow(Board board){

        for (int j = 0; j < 7; j+=3) {
            if (board.getCurrentBoard()[j].equals(board.getCurrentBoard()[j+1]) &&
                    board.getCurrentBoard()[j+1].equals(board.getCurrentBoard()[j+2])) {
                return true;
            }
        }
        return false;
    }

    public boolean checkVerticalRow(Board board){

        for (int j = 0; j < 2; j++) {
            if (board.getCurrentBoard()[j].equals(board.getCurrentBoard()[j+3]) &&
                    board.getCurrentBoard()[j+3].equals(board.getCurrentBoard()[j+6])) {
                return true;
            }
        }
        return false;
    }
}
