package blackjack;

import com.skilldistillery.cardgames.common.Card;

public class Player {
	private Hand playHand;
	
	
	public Player() {
		playHand = new BlackjackHand();
	}
	public void addCardtoHand(Card card) {
		playHand.addCard(card);
	}
	public Hand getPlayHand() {
		return playHand;
	}
	public void setPlayHand(Hand playHand) {
		this.playHand = playHand;
	}
	

}
