package com.codurance.kata;

public class Player {

	Board board;
	private boolean isPlayerX;

	public Player(Board board) {
		this.board = board;
		this.isPlayerX = true;
	}

	public void addMove(int position) {
		if (isPlayerX) {
			board.setCurrentBoard(position, "X");
			isPlayerX = false;
			return;
		}
		if (!isPlayerX) {
			board.setCurrentBoard(position, "O");
			isPlayerX = true;
		}
	}
}
