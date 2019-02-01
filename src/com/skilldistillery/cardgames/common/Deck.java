package com.skilldistillery.cardgames.common;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
	private ArrayList<Card> cards; // this is a deck of cards

	// In the constructor, initialize the List with all 52 cards.
	public Deck() {
		this.cards = createDeck();
		
		}

	public ArrayList<Card> createDeck() {
		ArrayList<Card> deck = new ArrayList<>(52);
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				deck.add(new Card(r, s));
			}
			
		}
		return deck;
	}

	public Card dealCard() { // give a card to player
		return cards.remove(0);
	}

	public void shuffle() {
		Random random = new Random();
		Card temp;
		for (int i = 0; i < 52; i++) {
			int index1 = random.nextInt(cards.size() - 1);
			int index2 = random.nextInt(cards.size() - 1);
			temp = cards.get(index2);
			cards.set(index2, cards.get(index1));
			cards.set(index1, temp);
		}
	}

	public Card drawCard() { // drawcard from deck
		return cards.remove(0);
	}
}