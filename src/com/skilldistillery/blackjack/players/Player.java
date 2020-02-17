package com.skilldistillery.blackjack.players;

import com.skilldistillery.blackjack.hands.Hand;

public abstract class Player {
	
	private Hand playerHand;
	private String name;
	
	public Player(String name) {
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	public Player() {
		
	}
	

	public Hand getHand() {
		return playerHand;
	}
	public void setHand(Hand hand) {
		this.playerHand = hand;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
