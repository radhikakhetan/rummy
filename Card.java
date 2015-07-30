

public class Card {
	int rank ;
	Card ( int i ) {
		rank = i ;
	}
	boolean isEqual(Card c) {
		return c.rank==this.rank ;
	}
	boolean isPrevious(Card c) {
		return this.rank + 1 == c.rank ;
	}
	boolean isNext(Card c) {
		return this.rank == c.rank + 1 ; 
	}
	Card findNext() {
		return new Card(this.rank + 1 ) ;
	}
	Card findPrevioud() {
		return new Card(this.rank - 1) ;
	}
	
}
