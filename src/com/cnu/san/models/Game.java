package com.cnu.san.models;

import java.util.List;

public class Game {
	private Board board;
	private List<Player> players;

	public Game(Board board, List<Player> players) {
		this.board = board;
		this.players = players;
	}

	@Override
	public String toString() {
		return "Game [board=" + board + ", players=" + players + "]";
	}

}
