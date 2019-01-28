package blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.cardgames.common.Card;
import com.skilldistillery.cardgames.common.Deck;
import com.skilldistillery.cardgames.common.Hand;

public abstract class playBlackJack {

	// main program page to play blackjack
	public static void main(String[] args) {
		List<Card> hand = new ArrayList<>();
		Deck deck = new Deck();
		Dealer dealer = new Dealer(deck);

		System.out.println("Welcome, lets play some blackjack, here is your hand");
		System.out.println(hand);
		int handValue = Hand.getHandValue(hand);

		System.out.println("Here is the Dealers hand");
		dealer.dealerFirstCard();

		// if either the deal or play have a 21 game end
		if (BlackjackHand.hasBlackjack(handValue) && dealer.dealerHasBlackjack()) {
			System.out.println("It's a tight.");
		
		} else if (BlackjackHand.hasBlackjack(handValue)) {
			System.out.println("You have BlackJack! YOU WIN ");
		
		} else if (dealer.dealerHasBlackjack()) {
			System.out.println("Dealer win, you lost.");
		}

		System.out.println();
		System.out.println("What would you like to do?");
		System.out.println("1: Hit");
		System.out.println("2: Stay");
		Scanner input = new Scanner(System.in);
		int kb = input.nextInt();
		// If hit, need to pass a single card to player
		
		if (kb ==1 ) {
			

		}
		
	}
	public static void playerHit(Deck deck, List<Card> hand) {
		hand.add(deck.drawCard());
		Card[] aHand = new Card[1];
		aHand = hand.toArray(aHand);
			
		}
	}

