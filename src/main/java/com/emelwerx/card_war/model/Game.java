package com.emelwerx.card_war.model;

import java.util.List;

public class Game {
	private List<Player> players;
	private Deck deckGame;
	private Deck deckPot;

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public Deck getDeckGame() {
		return deckGame;
	}

	public void setDeckGame(Deck deckGame) {
		this.deckGame = deckGame;
	}

	public Deck getDeckPot() {
		return deckPot;
	}

	public void setDeckPot(Deck deckPot) {
		this.deckPot = deckPot;
	}

}
