package blackjack;

public class BlackjackHand extends Hand{
	
	public boolean hasBlackjack(int BlackJack) {
		if(BlackJack == 21) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getHandValue() {
		return 0;
		
	}

}
