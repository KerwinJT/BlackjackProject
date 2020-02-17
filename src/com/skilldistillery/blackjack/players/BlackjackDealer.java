package com.skilldistillery.blackjack.players;

//import com.skilldistillery.blackjack.hands.Hand;
import com.skilldistillery.blackjack.hands.BlackjackHand;

public class BlackjackDealer extends BlackjackPlayer {
//	private Deck deck;
	private BlackjackHand dealerHand;

	public BlackjackDealer() {
		super("Dealer");
		this.dealerHand = new BlackjackHand();
//		this.deck = deck;
		// TODO Auto-generated constructor stub
	}
	
	
//	public Deck  getDeck() {
//		return this.deck;
//	}

}
