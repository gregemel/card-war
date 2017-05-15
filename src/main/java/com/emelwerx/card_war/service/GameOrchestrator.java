package com.emelwerx.card_war.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emelwerx.card_war.model.Card;
import com.emelwerx.card_war.model.Game;

@Service("gameOrchestrator")
public class GameOrchestrator {
	private Game game;
	
	@Autowired
	private GameFactory gameFactory;
	
	public void start(int playerCount) {
		System.out.println("starting game...");
		game = gameFactory.create(playerCount);
		
		displayDeck();
	}
	
	public void battle() {
//		for(Player player: game.getPlayers()) {
//			
//		}
	}
	
	public void run() {
		//create game with deck and players
		
			//TODO: use game factory
		
		//play round
		
		//determine winner or war
		
		//check if any players are eliminated
		
		//if only one player left, then declare winner and game over
	}
	
	private void displayDeck() {
		for(Card card: game.getDeckGame().getCards()) {
			System.out.println(card);
		}
	}

}
