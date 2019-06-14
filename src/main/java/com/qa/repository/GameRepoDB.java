package com.qa.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.qa.model.Game;

public class GameRepoDB implements GameRepo{

	
	@PersistenceContext
	EntityManager manager;
	
	
	
	
	public Game createGame(Game game) {
		// TODO Auto-generated method stub
		return null;
	}

	public Game readGame(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Game> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

//	public Game readGameByPlayerName(String searchName) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public Game readGameByEco(String searchEco) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	public Game updateGame(int game_id, Game newGame) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteGame(int game_id) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
