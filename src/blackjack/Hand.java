package blackjack;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cardgames.common.Card;

abstract public class Hand {

	ArrayList<Card> hand;

	public Hand() {
		hand = new ArrayList<Card>();
	}

	public int calcHandValue() {
		int totalHandValue = 0;
		List<Card> currentCards = this.hand;
		for (Card card : currentCards) {
			totalHandValue += card.getRank().getValue();
		}
		return totalHandValue;
	}
	public void showPlayerHand() {
		for (Card card : this.hand) {
			System.out.println(card);
		}
	}
 
	// Prints the dealer's first card (the card face up at the beginning of a
	// blackjack game).
	public void showFirstCard() {
		Card[] firstCard = new Card[] {};
		firstCard = hand.toArray(firstCard);
		System.out.println("[" + firstCard[0] + "]");
	}
	public void showDealerHand() {
		for (int i = 0; i < this.hand.size(); i++) {
			if(i == 0) {
				System.out.println("Hidden Card");
			}
			else {
				System.out.println(this.hand.get(i));
			}
		}
	}

	// Gives the dealer another card and updates the value of his hand. Takes into
	// account the value of aces.
	public void addCard(Card card) {
		hand.add(card);
	}

	// Determines if the dealer wants to hit according to classic Blackjack rules.
	public boolean wantToHit() {
		int handvalue = calcHandValue();
		if (handvalue < 17) {
			return true;
		}
		return false;
	}

	// Prints the dealer's hand.

	public void showHand() {
		System.out.println(hand);
	}

	// Determines if a dealer has busted.
	public boolean busted() {
		int handvalue = calcHandValue();
		if (handvalue > 21) {
			System.out.println("The dealer busted!");
			return true;
		}
		return false;
	}

}