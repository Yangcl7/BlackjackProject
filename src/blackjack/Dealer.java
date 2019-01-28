package blackjack;

import java.util.ArrayList;

import com.skilldistillery.cardgames.common.Card;
import com.skilldistillery.cardgames.common.Deck;

public class Dealer {

	// Dealer has a pair of hand, Dealer only shows 1 card

	// Dealer will have to hit on a soft 17
	// Dealer wins with 21(blackJack)
	// dealer will stand if hand is > 17
	ArrayList<Card> hand;
	private int handValue = 0; //this is the dealers hand starts at 0
	private Card[] dealerHand;

	public Dealer(Deck deck) {
		hand = new ArrayList<>();
		for (int i = 0; i <= 2; i++) {

			hand.add(deck.dealCard());// call from Deck to deal card
			}
		dealerHand = hand.toArray(dealerHand);
		for (int i = 0; i < dealerHand.length; i++) {// i <= 2 because there are two cards
			handValue += dealerHand[i].getValue();
			if (dealerHand[i].getValue() == 11) {

			}

		}
	}
	public void dealerFirstCard() { // 
		Card[] dealer1Card = new Card[2];
				dealer1Card = hand.toArray(dealer1Card);
				System.out.println(dealer1Card[0]);
		}
	public boolean dealerHasBlackjack() {
		if (hand.size() == 2 && handValue == 21) {
			System.out.println("Dealer win with black jack");
			return true;
		}
		else {
			return false;
		}
	}
	}
