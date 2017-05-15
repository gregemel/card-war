package com.emelwerx.card_war.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.emelwerx.card_war.model.*;

@Service
public class DeckFactory {

	public Deck create() {
		Deck deck = new Deck();
		
		List<Card> cards = new ArrayList<Card>();
		
		deck.setCards(cards);
		
		return deck;
	}
	
	public Deck createFrench() {
		Deck deck = create();
		
		List<Card> cards = deck.getCards();
		
		for(Suit suit: Suit.values()) {
			for(Rank rank: Rank.values()) {
				Card card = new Card(suit, rank);
				cards.add(card);
			}
		}

		return deck;
	}
}
