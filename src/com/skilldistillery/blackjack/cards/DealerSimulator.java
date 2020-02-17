package com.skilldistillery.blackjack.cards;

import java.util.Scanner;

import com.skilldistillery.blackjack.hands.BlackjackHand;
import com.skilldistillery.blackjack.hands.Hand;

public class DealerSimulator {
	Scanner keyboard = new Scanner(System.in);
	Deck deck = new Deck();
	CardFacePrinter testPrint = new CardFacePrinter();
	BlackjackHand testHand = new BlackjackHand();

	public DealerSimulator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		DealerSimulator dealer = new DealerSimulator();
		dealer.dealerPrompt();
//		for (int i = 0; i < 154; i++) {
//			System.out.println(deck.dealACard());
//		}
//		deck.cardsLeft();
		// TODO Auto-generated method stub

	}
	
	public void dealerPrompt() {
		System.out.print("How many cards would you like? ");
		int dealMe;
		for (dealMe = keyboard.nextInt(); dealMe > 0; dealMe--) {
			testHand.addCard(deck.dealACard());
		}
		
		testPrint.printHand(testHand);
	
	}

}
