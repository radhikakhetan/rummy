import java.util.ArrayList;
import java.util.Arrays;

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

	private ArrayList<ArrayList<Card>> findSequences() {
		ArrayList<ArrayList<Card>> sequence = new ArrayList<ArrayList<Card>>();
		int count = 0;
		sequence.get(count).add(cards.get(0));
		for (int i = 1; i < cards.size(); i++) {
			if (cards.get(i).isNext(cards.get(i-1))) {
				sequence.get(count).add(cards.get(i));
			}
			else {
				count++;
			}
		}
		return sequence;
	}
	
	private void removeCanasta() {
	}
	
	public int cardsToDeclare() {
		removeCanasta();
		return requiredCards;
	}
	
	
}
