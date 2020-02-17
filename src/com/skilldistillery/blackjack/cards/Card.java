package com.skilldistillery.blackjack.cards;

public class Card { //A simple class to represent a card

	private Rank rank;
	private Suit suit;
	public Rank getRank() {
		return rank;
	}
	public void setRank(Rank rank) {
		this.rank = rank;
	}
	public Suit getSuit() {
		return suit;
	}
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	public Card() {
		// TODO Auto-generated constructor stub
	}
	public Card (Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "+---+\n"+
				"|"+this.suit.getSymbol()+"  |\n"+
				"| "+this.rank.getLowerCaseName()+" |\n"+
				"|  "+this.suit.getSymbol()+"|\n"+
				"+---+";
	}
//	private String r = this.rank.getLowerCaseName();
//	private String s = this.suit.getSymbol();
//	private String cardFace = 	"+---+"+
//								"|"+this.suit.getSymbol()+"  |"+
//								"| "+this.rank.getLowerCaseName()+" |"+
//								"|  "+this.suit.getSymbol()+"|"+
//								"+---+";
	

}
