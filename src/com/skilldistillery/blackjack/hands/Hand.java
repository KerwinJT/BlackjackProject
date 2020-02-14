package com.skilldistillery.blackjack.hands;

import java.util.*;

import com.skilldistillery.blackjack.cards.Card;

public abstract class Hand {
	private List<Card> cards;
	
	public Hand() {
		cards = new ArrayList<Card>();
		// TODO Auto-generated constructor stub
	}
	
	public void addCard(Card card) {
		cards.add(card);
	}
	
	public void clear() {
		cards = new ArrayList<Card>();
//		cards.removeAll(cards); //What will this do?
	}
	
	public abstract int getHandValue();

	@Override
	public String toString() {
		
		//If statement (call a boolean to get or set if you are showing cards)
		return "Hand [cards=" + cards + "]";
	}
	
	
}
