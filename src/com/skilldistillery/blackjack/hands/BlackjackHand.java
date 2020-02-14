package com.skilldistillery.blackjack.hands;

public class BlackjackHand extends Hand {

	public BlackjackHand() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getHandValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public boolean isBlackJack() {
		//21 on deal
		return false;
	}
	
	public boolean isBust() {
		//Over 21;
		return false;
	}

}
