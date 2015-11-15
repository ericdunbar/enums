/**
 * Created by Chase on 2015-11-10.
 */
public enum Suit {
    CLUBS("C"),
    DIAMONDS("D"),
    HEARTS("H"),
    SPADES("S");

    final String theSuit;

    Suit(String st) {
        this.theSuit = st;
    }

    public String getString() {
        return theSuit;
    }
}
