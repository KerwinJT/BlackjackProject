package com.skilldistillery.blackjack.cards;

public enum Suit { //Helps facilitate the building of cards
	HEARTS("Hearts", "\u2665"),
	CLUBS("Clubs", "\u2663"),
	SPADES("Spades", "\u2660"),
	DIAMONDS("Diamonds", "\u2666");
	
//	Suit(){
//		
//	}
	
	Suit(String name, String symbol){
		this.name = name;
		this.symbol = symbol;
	}
	
	private String name;
	private String symbol;
	
	@Override
	public String toString() {
		return name + " " + symbol;
		
	}
	public String getSymbol() {
		return this.symbol;
	}
	
}

