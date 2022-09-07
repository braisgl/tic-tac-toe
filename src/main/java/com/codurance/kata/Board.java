package com.codurance.kata;

public class Board {

    private final String[] currentBoard;
    private boolean playerX;
    public Board(){
        this.playerX=true;
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

    public void addMove(int position) {
        if(playerX){
            this.currentBoard[position] = "X";
            playerX = false;
            return;
        }if(!playerX){
            this.currentBoard[position] = "O";
            playerX=true;
        }
    }
}
