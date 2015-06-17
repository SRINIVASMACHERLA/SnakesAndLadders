package com.cnu.san.test;

import java.util.ArrayList;
import java.util.List;

import com.cnu.san.models.Board;
import com.cnu.san.models.Cell;
import com.cnu.san.models.Game;
import com.cnu.san.models.Player;
import com.cnu.san.models.Result;
import com.cnu.san.service.GameService;

public class Test {
	public static void main(String[] args) {
		Cell[][] cells = new Cell[10][10];
		Board board = new Board(cells);
		List<Player> players = new ArrayList<Player>();
		Game game = new Game(board, players);
		GameService gameService = new GameService(game);
		while (!gameService.hasGameOver()) {
			Player player = gameService.nextTurn();
			gameService.play(player);
		}
		Result result = gameService.getResult();
		System.out.println("Game Result: " + result);
	}
}
