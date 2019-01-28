package blackjack;

public class BlackjackHand {
	
	public static boolean hasBlackjack(int bjValue) {
		if(bjValue == 21) {
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
