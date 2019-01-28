package com.skilldistillery.cardgames.common;

import java.util.ArrayList;
import java.util.List;

public class Hand {
	List<Card> cards = new ArrayList<Card>();

	public Hand() {

	}

	public static int getHandValue(List<Card> hand) {
		Card[] aHand = new Card[] {};
		aHand = hand.toArray(aHand);
		int handValue = 0;
		for (int i = 0; i < aHand.length; i++) {
			handValue += aHand[i].getValue();
			if (aHand[i].getValue() == 11) {
			}

		}

		return handValue;
	}

	public void addCard(int Card) {
		// when player choose to hit it will add a card to player
		

	}

	public void clearHand() {

	}

	public List<Card> getCards = new ArrayList<>();{
	}

	@Override
	public String toString() {
		return "Hand [toString()=" + super.toString() + "]";
	}
	public void dealerHand() {
		// make a dealerHand, and give the hand a value
		ArrayList<Card> hand;
		int handValue = 0;
		
	}
	

}
