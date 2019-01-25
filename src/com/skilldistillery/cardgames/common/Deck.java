package com.skilldistillery.cardgames.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards;

	public Deck() {
		cards = newDeck();
	}

	// In the constructor, initialize the List with all 52 cards.
	private List<Card> newDeck() {
		List<Card> deck = new ArrayList<>(52);
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				deck.add(new Card(s, r));
			}

		}
		return deck;
	}

	private int checkDeckSize() {
		return cards.size();

	}

	private Card dealCard() {
		return cards.remove(0);
	}

	private void shuffle() {
		Collections.shuffle(cards);
	}
}