public class Card {
	int rank;
	final int SET = 13;

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
		return this.rank + 1 == c.rank;
	}

	boolean isNext(Card c) {
		return this.rank == c.rank + 1;
	}

	Card findNext() {
		return new Card(this.rank + 1);
	}

	Card findPrevious() {
		return new Card(this.rank - 1);
	}

}
