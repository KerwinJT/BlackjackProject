package com.skilldistillery.blackjack.cards;

public enum Rank { //Facilitates the building of a card.
	TWO(2,"2"),
	THREE(3, "3"),
	FOUR(4, "4"),
	FIVE(5, "5"),
	SIX(6, "6"),
	SEVEN(7, "7"),
	EIGHT(8, "8"),
	NINE(9, "9"),
	TEN(10, "T"),
	JACK(10, "J"),
	QUEEN(10, "Q"),
	KING(10, "K"),
	ACE(11, "A");
	
	private int value;
	private String lowerCaseName;
	
	Rank(int value, String lowerCaseName){
		this.value = value;
		this.lowerCaseName = lowerCaseName;
	}
	
	public int getValue() {
		return this.value;
	}
	public String getLowerCaseName() {
		return this.lowerCaseName;
	}

}
