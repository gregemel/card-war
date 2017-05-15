package com.emelwerx.card_war.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.emelwerx.card_war.model.Game;

public class GameFactoryTest {
	@InjectMocks
	private GameFactory target;
	
	@Mock
	private PlayerFactory playerFactory;

	@Mock
	private DeckFactory deckFactory;

	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void factoryCreatesAGame() {
		//execute
		Game game = target.create(0);
		
		//verify
		assertNotNull(game);
	}
	
	@Test
	public void whenCreateThenCallPlayerFactoryForNPlayers() {
		//setup
		int n = 3;
		
		//execute
		target.create(n);
		
		//verify
		verify(playerFactory, times(1)).create(n);
	}
	
	@Test
	public void whenCreateThenCallDeckFactoryForFrenchGameDeck() {
		//execute
		target.create(0);
		
		//verify
		verify(deckFactory, times(1)).createFrench();
	}
	
	@Test
	public void whenCreateThenCallDeckFactoryCreateForEmptyPotDeck() {
		//execute
		target.create(0);

		//verify
		verify(deckFactory, times(1)).create();
	}
}
