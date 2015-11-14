/**
 * Created by Chase on 2015-11-10.
 */
public enum CardValue {
    ACE("A", 11),
    C_2("2", 2),
    C_3("3", 3),
    C_4("4", 4),
    C_5("5", 5),
    C_6("6", 6),
    C_7("7", 7),
    C_8("8", 8),
    C_9("9", 9),
    C_10("10", 10),
    JACK("J", 10),
    QUEEN("Q", 10),
    KING("K", 10);

    final String st;
    final int blackJackValue;

    CardValue(String st, int blackJackValue) {
        this.st = st;
        this.blackJackValue = blackJackValue;
    }

    public String getString() {
        return st;
    }

    public int getBlackJackValue() {
        return blackJackValue;
    }
}
