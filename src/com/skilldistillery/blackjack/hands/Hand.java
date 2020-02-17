package com.skilldistillery.blackjack.hands;

import java.util.List;

import com.skilldistillery.blackjack.cards.Card;

public abstract class Hand {
	private List<Card> cards;

	public Hand() {
	}

	public abstract List<Card> getHand();

	public abstract void addCard(Card card);

	public abstract int getHandValue();

	@Override
	public String toString() {

		// If statement (call a boolean to get or set if you are showing cards)
		return "Hand [cards=" + cards + "]";
	}

	public abstract void scuttleHands();

}
