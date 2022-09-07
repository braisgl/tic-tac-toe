package com.codurance.kata;

public class Board {

    private final String[] currentBoard;
    public Board(){
        this.currentBoard = new String[9];
        int i = 0;
        while (i < currentBoard.length) {
            currentBoard[i] = ".";
            i++;
        }
    }

    public String[] getCurrentBoard() {
        return currentBoard;
    }

    public void addMove(String playerToken, int position) {
        this.currentBoard[position] = playerToken;
    }
}
