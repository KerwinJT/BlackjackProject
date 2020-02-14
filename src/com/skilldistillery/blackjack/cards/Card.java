package com.skilldistillery.blackjack.cards;

public class Card {

	private Rank rank;
	private Suit suit;
	public Card() {
		// TODO Auto-generated constructor stub
	}
	public Card (Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}
	@Override
	public String toString() {
		return (this.rank.getLowerCaseName() + " of " + this.suit);
	}
	

}
