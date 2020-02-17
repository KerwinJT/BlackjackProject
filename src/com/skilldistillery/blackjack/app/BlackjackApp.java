package com.skilldistillery.blackjack.app;

import java.util.Scanner;

import com.skilldistillery.blackjack.cards.CardFacePrinter;
import com.skilldistillery.blackjack.cards.Deck;
import com.skilldistillery.blackjack.players.BlackjackDealer;
import com.skilldistillery.blackjack.players.BlackjackPlayer;

public class BlackjackApp {
	private Scanner keyboard = new Scanner(System.in);
	private BlackjackPlayer blackJackPlayer = new BlackjackPlayer();
	private BlackjackDealer dealer = new BlackjackDealer();
	private CardFacePrinter cardPrinter = new CardFacePrinter();
	private Deck bjDeck = new Deck();

	public BlackjackApp() {
	}

	public static void main(String[] args) {
		BlackjackApp playBlackJack = new BlackjackApp();
		playBlackJack.run();
	}

	private void run() {
		
		dealer = new BlackjackDealer();
		System.out.println("Welcome to the Blackjack App.");
		System.out.print("Please enter your name: ");
		String name = keyboard.nextLine();
		blackJackPlayer = new BlackjackPlayer(name);
		System.out.println("Hello, " + blackJackPlayer.getName() + ". Let's begin!");
		
		boolean letsPlay = true;
		while (letsPlay) {
			
			
			rulesOfBlackJack();
			System.out.println();
			System.out.print("Would you like to play again (y or n)? ");
			String playAgain = keyboard.nextLine();
			if (playAgain.contains("y")) {
				letsPlay = true;
			} else {
				letsPlay = false;
			}

		}

	}

	private void hit(BlackjackPlayer player) {
		player.getHand().addCard(bjDeck.dealACard());
	}

	private void deal() {
//		resetHands();
		blackJackPlayer.getHand().addCard(bjDeck.dealACard());
		dealer.getHand().addCard(bjDeck.dealACard());
		blackJackPlayer.getHand().addCard(bjDeck.dealACard());
		dealer.getHand().addCard(bjDeck.dealACard());
	}

	private void noReveal() {
		System.out.println(blackJackPlayer.getName() + " has: ");
		cardPrinter.printHand(blackJackPlayer.getHand());
		System.out.println(dealer.getName() + " has: ");
		cardPrinter.dealerMap(dealer.getHand());
	}

	private void fullReveal() {
		System.out.println(blackJackPlayer.getName() + " has: ");
		cardPrinter.printHand(blackJackPlayer.getHand());
		System.out.println(dealer.getName() + " has: (Revealed) ");
		cardPrinter.printHand(dealer.getHand());
	}

	private void rulesOfBlackJack() {
		deal();
		noReveal();

		if (blackJackPlayer.getHand().isBlackJack(blackJackPlayer.getHand().getHandValue())) {
			System.out.println("Blackjack! You win!");
			fullReveal();

		} else if (dealer.getHand().isBlackJack(dealer.getHand().getHandValue())) {
			System.out.println("Dealer wins! BlackJack!");
			fullReveal();
		} else {

			
			boolean playRound = true;
			while (playRound) {
				System.out.print("Would you like to (1)hit or (2)stay? ");
				playRound = makeMove();
				
			}
		}
		
		resetHands();
	}

	private boolean makeMove() {
		try {
			int choice = keyboard.nextInt();
			keyboard.nextLine();
			if (choice == 1) {
				hit(blackJackPlayer);
				if (blackJackPlayer.getHand().isBust(blackJackPlayer.getHand().getHandValue())) {
					System.out.println("\nYou have " + blackJackPlayer.getHand().getHandValue());
					System.out.println("Dealer wins, you busted.");
					fullReveal();
					return false;
				}
				noReveal();
			} else if (choice == 2) {
				dealerMoves();
				return false;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Please \"hit\" or \"stay\".");
			keyboard.nextLine();
		}
		return true;
	}
	private void resetHands() {
		blackJackPlayer.getHand().scuttleHands();
		dealer.getHand().scuttleHands();
		// TODO Auto-generated method stub
		
	}

	private void checkWin() {
		if (dealer.getHand().getHandValue() > blackJackPlayer.getHand().getHandValue()) {
			System.out.println("Dealer win.");
		} else if (dealer.getHand().getHandValue() < blackJackPlayer.getHand().getHandValue()) {
			System.out.println("Players win.");
		} else {
			System.out.println("Game Push. No winners.");
		}
	}

	private void dealerMoves() {
		boolean dealerFinished = false;
		while (!(dealerFinished == true)) {
			System.out.println("Going into dealer moves");
			fullReveal();
			if (dealer.getHand().getHandValue() < 17) {
				hit(dealer);
			} else if (dealer.getHand().getHandValue() >= 17) {
				if (dealer.getHand().isBust(dealer.getHand().getHandValue())) {
					System.out.println("Dealer busted. You win!");
					dealerFinished = true;
				} else if (!dealer.getHand().isBust(dealer.getHand().getHandValue())) {
					checkWin();
					dealerFinished = true;
				}
			}
		}
	}

}
