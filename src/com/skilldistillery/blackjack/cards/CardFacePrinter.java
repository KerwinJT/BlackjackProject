package com.skilldistillery.blackjack.cards;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.skilldistillery.blackjack.hands.BlackjackHand;

public class CardFacePrinter {

	Card newCard;
	Map<String, String> buildHand;
	public CardFacePrinter() {

	}

	public CardFacePrinter(BlackjackHand hand) {
		printHand(hand);

		// TODO Auto-generated constructor stub
	}

	public void printHand(BlackjackHand hand) {
		buildHand = new LinkedHashMap<String, String>();

		List<Card> printCards = new ArrayList<Card>();
		printCards.addAll(hand.getHand());

		for (Card card : printCards) {
			cardMap(card);
		}
		Set<String> keySet = buildHand.keySet();
		for (String string : keySet) {
			System.out.println(buildHand.get(string));
		}
		System.out.println();

	}

	public void cardMap(Card card) {
		newCard = card;
		String topBottom = "+---+  ";
		String middleRank = "| " + newCard.getRank().getLowerCaseName() + " |  ";
		String topSymbol = "|" + newCard.getSuit().getSymbol() + "  |  ";
		String bottomSymbol = "|  " + newCard.getSuit().getSymbol() + "|  ";
		if (buildHand.get("Top") == null) {
			buildHand.put("Top", topBottom);
			buildHand.put("TopSymbol", topSymbol);
			buildHand.put("MiddleRank", middleRank);
			buildHand.put("BottomSymbol", bottomSymbol);
			buildHand.put("Bottom", topBottom);

		} else {
			buildHand.put("Top", buildHand.get("Top") + topBottom);
			buildHand.put("TopSymbol", buildHand.get("TopSymbol") + topSymbol);
			buildHand.put("MiddleRank", buildHand.get("MiddleRank") + middleRank);
			buildHand.put("BottomSymbol", buildHand.get("BottomSymbol") + bottomSymbol);
			buildHand.put("Bottom", buildHand.get("Bottom") + topBottom);
		}

	}

	public void dealerMap(BlackjackHand hand) {
		buildHand = new LinkedHashMap<String, String>();

		List<Card> dealerHand = new ArrayList<Card>();
		dealerHand.addAll(hand.getHand());

		newCard = dealerHand.get(0);
		String topBottom = "+---+  ";
		String middleRank = "| " + newCard.getRank().getLowerCaseName() + " |  ";
		String topSymbol = "|" + newCard.getSuit().getSymbol() + "  |  ";
		String bottomSymbol = "|  " + newCard.getSuit().getSymbol() + "|  ";
		buildHand.put("Top", topBottom + topBottom);
		buildHand.put("TopSymbol", topSymbol + "|***|");
		buildHand.put("MiddleRank", middleRank + "|***|");
		buildHand.put("BottomSymbol", bottomSymbol + "|***|");
		buildHand.put("Bottom", topBottom + topBottom);

		Set<String> keySet = buildHand.keySet();
		for (String string : keySet) {
			System.out.println(buildHand.get(string));
		}
		System.out.println();
	}

}
