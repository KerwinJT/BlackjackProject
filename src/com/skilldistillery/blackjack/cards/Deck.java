package com.skilldistillery.blackjack.cards;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	private ArrayList<Card> deckOfCards = new ArrayList<Card>();
	public Deck() {
		newDeck();
		shuffleDeck();
		// TODO Auto-generated constructor stub
	}
	private ArrayList<Card> newDeck() {
		
		Rank[] rankCollection = Rank.values();
		Suit[] suitCollection = Suit.values();
		
		for (Suit suit : suitCollection) {
			for (Rank rank : rankCollection) {
				
				deckOfCards.add(new Card(suit, rank));
			}
		}
		
		return (deckOfCards);
		
	}
	protected void shuffleDeck(){
		Collections.shuffle(deckOfCards);
		Collections.shuffle(deckOfCards);
		Collections.shuffle(deckOfCards);
		Collections.shuffle(deckOfCards);
		Collections.shuffle(deckOfCards);
		Collections.shuffle(deckOfCards);
		Collections.shuffle(deckOfCards);
		Collections.shuffle(deckOfCards);
		Collections.shuffle(deckOfCards);
		Collections.shuffle(deckOfCards);
		Collections.shuffle(deckOfCards);
	}
	
	protected void cardsLeft() {
		System.out.println("Cards left in the deck: " + deckOfCards.size());
	}
	
	public Card dealACard() {
		
		try {
			return deckOfCards.remove(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			System.out.println("*** Dealing new deck ***".toUpperCase());
			newDeck();
			shuffleDeck();
			return deckOfCards.remove(0);
		}
	}

}
