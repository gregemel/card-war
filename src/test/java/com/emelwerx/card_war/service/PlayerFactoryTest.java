package com.emelwerx.card_war.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.*;

import com.emelwerx.card_war.model.*;

public class PlayerFactoryTest {
	private PlayerFactory target;
	
	@Before
	public void setup() {
		target = new PlayerFactory();
	}

	@Test
	public void factoryShouldCreatePlayers() {
		//execute
		List<Player> players = target.create(0);
		
		//verify
		assertNotNull(players);
	}
	
	@Test
	public void factoryShouldCreateNPlayers() {
		//setup
		int n = 3;
		
		//execute
		List<Player> players = target.create(n);
		
		//verify
		assertEquals(n, players.size());
	}
	
	@Test
	public void newPlayerHasEmptyDeck() {
		//execute
		List<Player> players = target.create(1);
		Deck deck = players.get(0).getDeck();
		
		//verify
		assertNotNull(deck);
	}
}
