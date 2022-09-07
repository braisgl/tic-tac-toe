package com.codurance.kata;

public class Board {

    private String[] currentBoard;
    public Board(){
        this.setCurrentBoard(new String[9]);
    }

    public String[] getCurrentBoard() {
        return currentBoard;
    }

    public void setCurrentBoard(String[] currentBoard) {
        this.currentBoard = currentBoard;
    }
}
