package com.emelwerx.card_war.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.emelwerx.card_war.model.Game;

public class GameFactoryTest {
	private GameFactory target;
	
	@Before
	public void setup() {
		target = new GameFactory();
	}
	
	@Test
	public void factoryCreatesAGame() {
		//execute
		Game game = target.create(0);
		
		//verify
		assertNotNull(game);
	}
	
	@Test
	public void gameShouldNHavePlayers() {
		//setup
		int n = 3;
		
		//execute
		Game game = target.create(n);
		
		//verify
		assertNotNull(game.getPlayers());
		assertEquals(n, game.getPlayers().size());
	}
	
	@Test
	public void gameShouldHaveFrenchGameDeck() {
		//execute
		Game game = target.create(0);
		
		//verify
		assertNotNull(game.getDeckGame());
		assertEquals(52, game.getDeckGame().getCards().size());
	}
	
	@Test
	public void gameShouldHaveEmptyPotDeck() {
		//execute
		Game game = target.create(0);
		
		//verify
		assertNotNull(game.getDeckPot());
	}
}
