package VoidGame;

/** Card class */
public class Card {

	/** Card value, from 2 to Ace */
	private int val;

	/** Suit of the card, either clubs, hearts, spades, or diamonds. */
	private String suit;

	/** The suit value. */
	private int suitValue;

	/** The rank of the card, used by cardCompete. */
	private int rank;

	/** Constructor. */
	public Card(int v, String s) {
		val = v;
		suit = s;
		suitValue = 0;
		if (suit == "Diamonds") {
			suitValue = 13;
		} else if (suit == "Hearts") {
			suitValue = 26;
		} else if (suit == "Spades") {
			suitValue = 39;
		}
		rank = suitValue + val;
	}

	public String suit() {
		return suit;
	}

	public int val() {
		return val;
	}

	public int suitValue() {
		return suitValue;
	}

	public int rank() {
		return rank;
	}

	public String toString() {
		String value;
		if (val == 11) {
			value = "Jack";
		} else if (val == 12) {
			value = "Queen";
		} else if (val == 13) {
			value = "King";
		} else if (val == 14) {
			value = "Ace";
		} else {
			value = String.valueOf(val);
		}
		return value + " of " + suit;
	}


}