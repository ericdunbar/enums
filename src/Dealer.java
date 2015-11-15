
/**
 * Created by Chase on 2015-11-10.
 */
public class Dealer {
	public static void main(String[] args) {
		Deck deck = new Deck();
		
		for (int i = 0; i < 53; i++) {
			// Card topCard = deck.deck.get(0);
			Card topCard = deck.dealCard();
			System.out.println(topCard);
		}
	}
}
