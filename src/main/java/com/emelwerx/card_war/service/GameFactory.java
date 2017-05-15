package com.emelwerx.card_war.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emelwerx.card_war.model.Deck;
import com.emelwerx.card_war.model.Game;
import com.emelwerx.card_war.model.Player;

@Service
public class GameFactory {
	
	@Autowired
	private PlayerFactory playerFactory;
	
	@Autowired
	private DeckFactory deckFactory;
	
	public Game create(int players) {
		Game game = new Game();
		
		List<Player> playerList = playerFactory.create(players);
		game.setPlayers(playerList);

		Deck deckGame = deckFactory.createFrench();
		game.setDeckGame(deckGame);

		Deck deckPot = deckFactory.create();
		game.setDeckPot(deckPot);
		
		return game;
	}
}
