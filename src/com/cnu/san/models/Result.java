package com.cnu.san.models;

public class Result {
	Player winner;

	public Player getWinner() {
		return winner;
	}

	public void setWinner(Player winner) {
		this.winner = winner;
	}

	@Override
	public String toString() {
		return "Result [winner=" + winner + "]";
	}

}
