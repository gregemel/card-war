package com.emelwerx.card_war.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.emelwerx.card_war.model.Deck;

public class DeckFactoryTest {
	
	private DeckFactory target;
	
	@Before
	public void setup() {
		target = new DeckFactory();
	}
	
	@Test
	public void factoryCreateMakesADeck() {
		//execute
		Deck deck = target.create();
		
		//verify
		assertNotNull(deck);
	}
	
	@Test
	public void newDeckHasCards() {
		//execute
		Deck deck = target.create();
		
		//verify
		assertNotNull(deck.getCards());
	}
	
	@Test
	public void newFrenchDeckHas52Cards() {
		//execute
		Deck deck = target.createFrench();
		
		//verify
		assertEquals(52, deck.getCards().size());
	}
	
	@Test
	public void newFrenchDeckShoudlBeShuffled() {
		//TODO: need to verify this behavior
	}

}
