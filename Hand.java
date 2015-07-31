import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Hand {
	ArrayList<Card> cards;
	boolean canasta;
	int requiredCards;
	int jokerCount;

	public Hand() {
		cards = new ArrayList<Card>();
		requiredCards = 0;
	}

	public void dealCard(Card c) {
		cards.add(c);
	}

	private List<ArrayList<Card>> findSequences() {
		Collections.sort(cards, new RankComparator());
		List<ArrayList<Card>> sequence = new ArrayList<ArrayList<Card>>();
		int count = 0;
		sequence.get(count).add(cards.get(0));
		for (int i = 1; i < cards.size(); i++) {
			if (cards.get(i).isNext(cards.get(i - 1))) {
				sequence.get(count).add(cards.get(i));
			} else {
				count++;
			}
		}
		return sequence;
	}

	private List<ArrayList<Card>> findTriplets() {
		Collections.sort(cards, new SuitComparator());
		List<ArrayList<Card>> triplet = new ArrayList<ArrayList<Card>>();
		int count = 0;
		triplet.get(count).add(cards.get(0));
		for (int i = 1; i < cards.size(); i++) {
			if ((cards.get(i).rank) % 13 == cards.get(i - 1).rank % 13
					&& cards.get(i).rank != cards.get(i - 1).rank) {
				triplet.get(count).add(cards.get(i));
			} else {
				count++;
			}
		}
		return triplet;
	}

	private void removeCanasta() {
	}

	public int cardsToDeclare() {
		removeCanasta();
		return requiredCards;
	}
	
	public void isJoker() {
		for (Card i : cards) {
			if(i.isJoker()) {
				jokerCount++ ;
				cards.remove(i) ;
			}
		}
	}

	void print(){
		for(Card c : cards){
			System.out.println(c.toString());
		}
	}

}
