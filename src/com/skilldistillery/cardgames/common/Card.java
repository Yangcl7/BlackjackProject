package com.skilldistillery.cardgames.common;

public class Card {
	private Rank rank;
	private Suit suit;
	
	public int getValue() {
		return rank.getValue();
	}


	public Card(Rank rank, Suit suit) {
		super();
		this.rank = rank;
		this.suit = suit;
	}


	@Override
	public String toString() {
		return "Card [rank=" + rank + ", suit=" + suit + "]";
	}


	public Rank getRank() {
		return rank;
	}


	public void setRank(Rank rank) {
		this.rank = rank;
	}


	public Suit getSuit() {
		return suit;
	}


	public void setSuit(Suit suit) {
		this.suit = suit;
	}

}
