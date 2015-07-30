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
		if ( this.rank % SET == 0 )
			return this.rank == c.rank + SET - 1 ;
		return this.rank + 1 == c.rank;
	}

	boolean isNext(Card c) {
		if ( this.rank  % SET == 1)
			return this.rank + SET - 1 == c.rank ;
		return this.rank == c.rank + 1;
	}

}
