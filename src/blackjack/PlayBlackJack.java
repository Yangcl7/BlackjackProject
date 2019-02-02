package blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.cardgames.common.Card;
import com.skilldistillery.cardgames.common.Deck;

import jdk.management.resource.internal.TotalResourceContext;

public class PlayBlackJack extends Hand {

	// main program page to play blackjack
	public static void main(String[] args) {
		PlayBlackJack app = new PlayBlackJack();
		do {
			app.runBlackjack();

		} while (app.PlayAgain());
		
		System.out.println("Thanks for playing");

	}
	

	public void runBlackjack() {
		List<Card> hand = new ArrayList<>();
		Deck deck = new Deck();
		deck.shuffle();
		Player player = new Player();
		Player dealer = new Player();

		System.out.println("BBBBBB    ll                         kk           JJJJJ                         kk  ");
		System.out.println("BB   BB   ll                         kk    kk      JJJ                          kk    kk");
		System.out.println("BB   BB   ll                         kk    kk      JJJ                          kk    kk");
		System.out.println("BBBBBB    ll                         kk   kk       JJJ                          kk   kk ");
		System.out.println("BBBBBB    ll    aaaaa         cccccc kk  kk        JJJ   aaaaaaa         cccccc kk  kk  ");
		System.out.println("BB   BB   ll   aa    a      ccc      kkkk          JJJ  aa     aa      ccc      kkkk    ");
		System.out.println("BB    BB  ll  aa     aa    ccc       kkkkk         JJJ aa     aaa     cc        kkkkk  ");
		System.out.println("BB   BB   ll aa     a aa   cc        kk   kk       JJJ aa     aaaa    cc        kk   kk  ");
		System.out.println("BB   BB   ll aa    a  aa    cc       kk    kk  JJ  JJJ aa    aa  aa    cc       kk    kk   ");
		System.out.println("BBBBB     ll aaaaaaa   aa    ccccccc kk     kk  JJJJJJ  aaaaaa    aa    ccccccc kk     kk   ");
		System.out.println("_________________________________________________________________________________________");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("********* Welcome *********");
		System.out.println();
		System.out.println("Here is your hand");
		System.out.println();

		player.addCardtoHand(deck.dealCard());
		dealer.addCardtoHand(deck.dealCard());
		player.addCardtoHand(deck.dealCard());
		dealer.addCardtoHand(deck.dealCard());
		int playerHandValue = player.getPlayHand().calcHandValue();
		player.getPlayHand().showPlayerHand();
		System.out.println("your total value is " + playerHandValue);

		System.out.println("Here is the Dealers hand");
		dealer.getPlayHand().showDealerHand();
		if (playerHandValue == 21) {
			System.out.println("Player win with Black Jack");
		}

//		 if either the deal or play have a 21 game end
//		if(player.getPlayHand() == dealer.getPlayHand()) {
//		System.out.println("It's a tight.");
//		}
		while (playerHandValue < 21) {
			System.out.println("Would you like to hit or stay?");
			System.out.println("1: Hit");
			System.out.println("2: Stay");
			Scanner input = new Scanner(System.in);
			int kb = input.nextInt();

			if (kb == 1) {
				player.addCardtoHand(deck.dealCard());
				player.getPlayHand().showPlayerHand();
				playerHandValue = player.getPlayHand().calcHandValue();
				System.out.println("Your total value is " + playerHandValue);

			}
			if (playerHandValue > 21) {
				System.out.println("bust, you lose");
				break;
			}
			if (playerHandValue == 21) {
				System.out.println("Black Jack, you win!!!");
				break;
			}

			if (kb == 2) {
				System.out.println("Dealers flip hidden card, his second hand is: ");
				dealer.getPlayHand().showPlayerHand();
				int dealerHandTotal = dealer.getPlayHand().calcHandValue();
				System.out.println(+dealerHandTotal);

				while (dealerHandTotal <= 17) {
					System.out.println("Dealer will hit");
					dealer.addCardtoHand(deck.dealCard());
					dealer.getPlayHand().showPlayerHand();
					dealerHandTotal = dealer.getPlayHand().calcHandValue();
					System.out.println(+dealerHandTotal);

				}
				if (dealerHandTotal > 21) {
					System.out.println("Dealer bust, you win!!! ");
					dealerHandTotal = dealer.getPlayHand().calcHandValue();
					break;
				}
				if (dealerHandTotal == 21) {
					System.out.println("Dealer win with Black Jack sorry =(");
					break;
				}
				if (dealerHandTotal > 17) {
					if (dealerHandTotal > playerHandValue) {
						System.out.println("Dealer has bigger hand, dealer win");
						break;
					}
					if (dealerHandTotal < playerHandValue) {
						System.out.println(playerHandValue);
						System.out.println("You has bigger hand, you win");
						break;
					}

				}
			}
		}
	}

	public boolean PlayAgain() {
		Scanner input2 = new Scanner(System.in);
		System.out.println("Would you like to play again? Y or N");
		String play2 = input2.next();
		PlayBlackJack app = new PlayBlackJack();

		if (play2.equalsIgnoreCase("y")) {
			return true;
		} else {
			return false;
		}

	}
}
