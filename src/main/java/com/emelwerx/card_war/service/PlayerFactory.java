package com.emelwerx.card_war.service;

import java.util.ArrayList;
import java.util.List;

import com.emelwerx.card_war.model.*;

public class PlayerFactory {
	//TODO: use @Autowire
	private DeckFactory deckFactory; 
	
	public List<Player> create(int n) {
		List<Player> players = new ArrayList<Player>();
		deckFactory = new DeckFactory();
		
		for(int i=0; i<n; i++) {
			Player player = new Player();
			Deck deck = deckFactory.create();
			player.setDeck(deck);
			players.add(player);
		}
		
		return players;
	}
}
