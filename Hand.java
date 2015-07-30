import java.util.ArrayList;

public class Hand {
	ArrayList<Card> cards;
	
	public Hand() {
		cards = new ArrayList<Card>();
	}
	
	public void dealCard(Card c) {
		cards.add(c);
	}
}
