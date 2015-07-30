
public class RummyGame {

	public static void main(String[] args) {
		CardDealer dealer = new CardDealer();
		Hand player = new Hand();
		dealer.dealCardToPlayer(player);
	}
}
