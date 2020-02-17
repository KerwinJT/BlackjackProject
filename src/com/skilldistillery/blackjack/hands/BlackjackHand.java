package com.skilldistillery.blackjack.hands;

import java.util.*;

import com.skilldistillery.blackjack.cards.Card;

public class BlackjackHand extends Hand {
	private ArrayList<Card> cards;

	public BlackjackHand() {
		super();
		cards = new ArrayList<Card>();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getHandValue() {
		int value = 0;
		if (cards != null) {
			for (Card card : this.cards) {
				value += card.getRank().getValue();
			}
		}
		// TODO Auto-generated method stub]

		return value;
	}

	public void addCard(Card card) {
		this.cards.add(card);
	}

	public boolean isBlackJack(int value) {

		if (value == 21 && this.cards.size() == 2) {
			return true;
		} else {
			// 21 on deal
			return false;
		}
	}

	public boolean isBust(int value) {

		if (value > 21) {
			return true;
		} else {
			// Over 21;
			return false;
		}
	}
	public List<Card> getHand(){
		return this.cards;
	}
	
	public void scuttleHands() {
		this.cards = new ArrayList<Card>();
	}

}
