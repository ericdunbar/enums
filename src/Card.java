/**
 * Created by Chase on 2015-11-10.
 */
public class Card {
    public final Suit suit;
    public final CardValue cardValue;

    Card(Suit suit, CardValue cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }

    public String toString() {
        return cardValue.getString() + suit.getString();
    }
}
