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
	
	@Transactional(value = TxType.REQUIRED)
	public Game updateGame(int game_id, Game newInfo) {
		Game game = readGame(game_id);
		game.setWhite(newInfo.getWhite());
		System.out.println(readGame(game.getGame_id()).getWhite());
		game.setBlack(newInfo.getBlack());
		System.out.println(readGame(game.getGame_id()).getBlack());
		game.setResult(newInfo.getResult());
		System.out.println(readGame(game.getGame_id()).getResult());
		game.setEco(newInfo.getEco());
		System.out.println(readGame(game.getGame_id()).getEco());
		game.setNotation(newInfo.getNotation());
		System.out.println(readGame(game.getGame_id()).getNotation());
		return game;
	}

	@Transactional(value = TxType.REQUIRED)
	public void deleteGame(int game_id) {
		manager.remove(readGame(game_id));
	}
	
	
	

}
