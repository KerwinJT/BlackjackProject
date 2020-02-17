package com.skilldistillery.blackjack.hands;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.blackjack.cards.Card;

public abstract class Hand {
	private List<Card> cards;
	
	public Hand() {}
	public List<Card> getHand(){
		return cards;}
	
	public void addCard(Card card) {}
	
	public void clear() {}
	
	public int getHandValue() {
		int value = 0;
		for (Card card : cards) {
			value += card.getRank().getValue();
		}
		return value;
	}

	@Override
	public String toString() {
		
		//If statement (call a boolean to get or set if you are showing cards)
		return "Hand [cards=" + cards + "]";
	}
	
	
	public void scuttleHands() {
		this.cards = new ArrayList<Card>();
	}
	
}
