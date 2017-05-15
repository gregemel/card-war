package com.emelwerx.card_war.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emelwerx.card_war.model.*;

@Service
public class PlayerFactory {
	@Autowired
	private DeckFactory deckFactory; 
	
	public List<Player> create(int n) {
		List<Player> players = new ArrayList<Player>();
		
		for(int i=0; i<n; i++) {
			Player player = new Player();
			Deck deck = deckFactory.create();
			player.setDeck(deck);
			players.add(player);
		}
		
		return players;
	}
}
