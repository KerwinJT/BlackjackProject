package com.skilldistillery.blackjack.players;

import com.skilldistillery.blackjack.hands.*;

public class BlackjackPlayer extends Player {
	
	private BlackjackHand playerHand = new BlackjackHand();

	public BlackjackPlayer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public BlackjackPlayer() {
		
	}
	
	public BlackjackHand getHand() {
		return this.playerHand;
	}
	public void setHand(BlackjackHand playerHand) {
		this.playerHand = playerHand;
	}
	

}
