package com.qa.repository;

import java.util.List;

import com.qa.model.Player;

public interface PlayerRepo {
	
	//Create
	public Player create(Player account);
	//Read
	public Player read(int id);
	public List<Player> readAll();	
	//Update
	public Player update(int id, Player account);
	//Delete
	public void delete(int id);
	

}
