package com.skilldistillery.blackjack.cards;

public enum Suit {
	HEARTS("Hearts"),
	CLUBS("Clubs"),
	SPADES("Spades"),
	DIAMONDS("Diamonds");
	
//	Suit(){
//		
//	}
	
	Suit(String name){
		this.name = name;
	}
	
	private String name;
	
	@Override
	public String toString() {
		return name;
		
	}
	
}

