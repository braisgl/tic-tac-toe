package com.codurance.kata;

public class Game {

    Board board = new Board();

    public String[] currentBoard(){
        return board.getCurrentBoard();
    }

    public String play(String token, int position) {
        if(board.getCurrentBoard()[position]!=null){
            return "Position already occupied";
        }
        board.addMove(token, position);
        return "Next move";
    }
}
