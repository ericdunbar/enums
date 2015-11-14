/**
 * Created by Chase on 2015-11-10.
 */
public enum Suit {
    CLUBS("C"),
    DIAMONDS("D"),
    HEARTS("H"),
    SPADES("S");

    final String st;

    Suit(String st) {
        this.st = st;
    }

    public String getString() {
        return st;
    }
}
