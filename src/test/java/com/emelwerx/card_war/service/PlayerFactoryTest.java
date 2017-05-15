package com.emelwerx.card_war.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.emelwerx.card_war.model.*;

public class PlayerFactoryTest {
	@InjectMocks
	private PlayerFactory target;
	
	@Mock
	private DeckFactory deckFactory;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void factoryShouldCreatePlayers() {
		//execute
		List<Player> players = target.create(0);
		
		//verify
		assertNotNull(players);
	}
	
	
	@Test
	public void whenCreateThenCallDeckFactoryNTimes() {
		//setup
		int n = 3;

		//execute
		target.create(n);
		
		//verify
		verify(deckFactory, times(n)).create();
	}
}
