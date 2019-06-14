package com.qa.repository;

import java.util.List;

import com.qa.model.Game;

public interface GameRepo {

//C
	
	public Game createGame(Game game);
	
	
//R
	
	public Game readGame(int id);
	public List<Game> readAll();

	//added readAll method, commented out readPlayerName and readEco
	//	changed game_id to id to make simpler
	
	//	public Game readGameByPlayerName(String searchName);
	//	public Game readGameByEco(String searchEco);
	
//U
	
	public Game updateGame(int game_id, Game newGame);
	
	
//D
	
	public void deleteGame(int game_id);
	
	
	
	
}
