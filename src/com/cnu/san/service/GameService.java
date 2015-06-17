package com.cnu.san.service;

import com.cnu.san.models.Game;
import com.cnu.san.models.Player;
import com.cnu.san.models.Result;

public class GameService {
	protected Game game;

	public GameService(Game game) {
		this.game = game;
	}

	public void play(Player player) {

	}

	public Player nextTurn() {
		return null;
	}

	public boolean hasGameOver() {
		return false;
	}

	public Result getResult() {
		return null;
	}

}
