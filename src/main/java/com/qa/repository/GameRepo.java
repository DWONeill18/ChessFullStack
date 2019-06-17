package com.qa.repository;

import com.qa.model.Game;

public interface GameRepo {

	public Game createGame(Game game);

	public Game readGame(int id);

	public Game updateGame(int game_id, Game newGame);

	public void deleteGame(int game_id);

}
