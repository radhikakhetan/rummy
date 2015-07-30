import java.util.*;


public class CardDealer {
	static List<Card> cardlist = new ArrayList<Card> () ;
	
	CardDealer () {
		cardGeneration() ;
		Collections.shuffle(cardlist);
		
	}
	
	public static void cardGeneration() {
		for ( int i = 0 ; i < 3; i++) {
			for ( int j= 1 ;j <=53;j++) {
				cardlist.add(new Card(j)) ;
			}
		}	
		
	}
	public void dealCard ( Hand h) {
		for(int i = 0; i  <13 ; i++) {
			h.dealCard(cardlist.get(i)) ;
		}
		
		
	}
	public static void main (String [] args) {
		CardDealer obj = new CardDealer() ;
		Hand newhand = new Hand() ;
		obj.dealCard(newhand);
		
		
	}
}
