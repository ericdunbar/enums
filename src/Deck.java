import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Chase on 2015-11-10.
 */
public class Deck {
	List<Card> deck = new ArrayList<>(52);

	public Card dealCard() {
		if (this.deck.size() == 0) {
			return null;
		}
		System.out.print(deck.size() + ", ");
		Card card = deck.get(0);
		deck.remove(0);
		System.out.print(deck.size() + " ");
		return card;
	}

	Deck() {
		/*
		 * Séguret, D. (2012, December 1). Where is the documentation for the
		 * values() method of Enum? Retrieved November 14, 2015, from
		 * http://stackoverflow.com/questions/13659217/where-is-the-
		 * documentation-for-the-values-method-of-enum
		 */

		Suit[] suits = Suit.values();
		CardValue[] cardValues = CardValue.values();

		for (CardValue cardValue : cardValues) {
			for (Suit suit : suits) {
				Card c = new Card(suit, cardValue);
				deck.add(c);
			}
		}

		Collections.shuffle(deck);
	}
}
