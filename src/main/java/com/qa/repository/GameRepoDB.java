package com.qa.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import com.qa.model.Game;

@Transactional(TxType.SUPPORTS)
public class GameRepoDB implements GameRepo{
	
	@PersistenceContext(unitName = "myPU")
	EntityManager manager;
	
	@Transactional(TxType.REQUIRED)
	public Game createGame(Game game) {
		manager.persist(game);
		return game;
	}

	public Game readGame(int id) {
		Game game = manager.find(Game.class, id);
		return game;
	}
	
	public List<Game> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Game updateGame(int game_id, Game newGame) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteGame(int game_id) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
