package com.emelwerx.card_war.service;

import java.util.List;

import com.emelwerx.card_war.model.Deck;
import com.emelwerx.card_war.model.Game;
import com.emelwerx.card_war.model.Player;

public class GameFactory {
	
	//TODO: use @Autowire
	private PlayerFactory playerFactory;
	
	//TODO: use @Autowire
	private DeckFactory deckFactory;
	
	public Game create(int players) {
		Game game = new Game();
		
		//TODO: use @Autowire
		playerFactory = new PlayerFactory();
		List<Player> playerList = playerFactory.create(players);
		game.setPlayers(playerList);

		//TODO: use @Autowire
		deckFactory = new DeckFactory();
		Deck deckGame = deckFactory.createFrench();
		game.setDeckGame(deckGame);

		Deck deckPot = deckFactory.createFrench();
		game.setDeckPot(deckPot);
		
		return game;
	}
}
