package com.qa.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import com.qa.model.Player;


@Transactional(value = TxType.SUPPORTS)
public class PlayerDB implements PlayerRepo{

	@PersistenceContext(unitName = "myPU")
	private EntityManager em;
	
	@Transactional(value = TxType.REQUIRED)
	public Player create(Player player) {
		em.persist(player);
		return player;
	}

	public Player read(int id) {
		Player player = em.find(Player.class, id);
		return player;
	}
	
	public List<Player> readAll() {

		TypedQuery<Player> q = em.createQuery("Select acc from player acc", Player.class);
		List<Player> list = q.getResultList();
		return list;
	}
	
	@Transactional(value = TxType.REQUIRED)
	public Player update(int id, Player newInfo) {
		Player player = read(id);
		player.setName(newInfo.getName());
		System.out.println(read(player.getId()).getName());
		return player;
	}

	@Transactional(value = TxType.REQUIRED)
	public void delete(int id) {
		em.remove(read(id));
	}

}
