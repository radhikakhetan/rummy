import java.util.Comparator;

public class Card {
	int rank;
	final String suit = "CDHS";
	final String name = "A23456789TJQK";
	final int HAND_COUNT = 13;
	final int TOTAL_SUITS = 4;
	final int JOKER_NUMBER = 53;

	Card(int i) {
		rank = i;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;

		if (!(o instanceof Card))
			return false;

		return ((Card) o).rank == this.rank;
	}

	boolean isPrevious(Card c) {
		if (this.rank % HAND_COUNT == 0)
			return this.rank == c.rank + HAND_COUNT - 1;
		return this.rank + 1 == c.rank;
	}

	boolean isNext(Card c) {
		if (this.rank % HAND_COUNT == 1)
			return this.rank + HAND_COUNT - 1 == c.rank;
		return this.rank == c.rank + 1;
	}
	
	@Override
	public String toString() {
		if ( this.rank == JOKER_NUMBER )
			return "JJ";
		return  suit.charAt(this.rank % HAND_COUNT) + "" + name.charAt(this.rank % TOTAL_SUITS);
	}
}

class RankComparator implements Comparator<Card> {
	@Override
	public int compare(Card one, Card two) {
		return one.rank - two.rank;
	}
}

class SuitComparator implements Comparator<Card> {
	final int HAND_COUNT = 13;
	@Override
	public int compare(Card one, Card two) {
		return (one.rank % HAND_COUNT) - (two.rank % HAND_COUNT);
	}
}
