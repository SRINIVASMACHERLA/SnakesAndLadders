package com.cnu.san.models;

public class Board {
	private Cell[][] board;

	public Cell[][] getBoard() {
		return board;
	}

	public Board(Cell[][] board) {
		this.board = board;
	}

}
