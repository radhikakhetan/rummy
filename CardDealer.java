import java.util.ArrayList;
import java.util.Collections;

public class CardDealer {
	private ArrayList<Card> cardlist;

	public CardDealer() {
		 cardlist = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			for (int j = 1; j <= 53; j++) {
				cardlist.add(new Card(j));
			}
		}
		Collections.shuffle(cardlist);
	}

	public void dealCardToPlayer(Hand h) {
		for (int i = 0; i < 13; i++) {
			h.dealCard(cardlist.get(i));
		}
	}
}
