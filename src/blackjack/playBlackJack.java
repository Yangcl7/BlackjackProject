package blackjack;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.cardgames.common.Card;
import com.skilldistillery.cardgames.common.Hand;

public abstract class playBlackJack {
	
	
	// main program page to play blackjack
	public static void main(String[] args) {
		Hand hand = new Hand();
		System.out.println("Welcome, lets play some blackjack, here is your hand");
		System.out.println(hand.getHandValue((List<Card>) hand));
		System.out.println("Here is the Dealers hand");
		System.out.println(hand.getHandValue((List<Card>) hand));
		
		
		System.out.println();
		System.out.println("What would you like to do?");
		System.out.println("1: Hit");
		System.out.println("2: Stay");
	}

}
