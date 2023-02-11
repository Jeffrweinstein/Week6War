package gameOfWar;

public class App {

	public static void main(String[] args) {
		
		//instantiate a deck
		Deck newDeck = new Deck();
		
		//creates 2 players to the game. Jeff-me, Chris-villain(best friend)
		Player p1 = new Player ("Jeff");
		Player p2 = new Player ("Chris");
		
		//shuffles the deck of 52 cards
		newDeck.shuffle();
		
		//deals cards to the players
		for (int i = 0; i < 26; i++) {
			
		p1.draw(newDeck);
		p2.draw(newDeck);
		}

		//p1.describe(); "If you want to see the full array in player 1's hand
		//p2.describe(); "If you want to see the full array in player 2's hand
	
		//declaring the values of both players cards
		int p1Value, p2Value;
		
		
	
		for (int i = 0; i < 26; i++) {
			System.out.println("*******Start of a new round********");
			System.out.println();
			/*starts the round and has each player flip their card
			 * this continues until all 26 rounds are complete
			 * 
			 */
		p1Value = p1.flip().getValue();
		p2Value = p2.flip().getValue();
		
		/* assigns a winner of each round.  If no winner it is a tie.
		 * keeps ongoing score of each player after the completion of a round.
		 */
		
		  
		
		
		if( p1Value > p2Value) {
			p1.incrementScore();
			System.out.println(p1.getName() + " wins the round");
			System.out.println();
		}
		else if ( p2Value > p1Value) {
			p2.incrementScore();
			System.out.println( p2.getName() + " wins the round");
			System.out.println();
		}
		else {
			System.out.println("tie");
			System.out.println();
		}
		System.out.println("Current Score is " + p1.getName() + " " + p1.getScore() + "---" + p2.getName() + " " + p2.getScore());
		System.out.println();
	}
		// adds the total points and assigns a winner
		
		if (p1.getScore() > p2.getScore()) {
			System.out.println(p1.getName() + " is better at war!!");
		}
		else if (p2.getScore() > p1.getScore()) {
			System.out.println(p2.getName() + " got lucky and " + p1.getName() + " is still better at war!!");
		}
		else System.out.println(p2.getName() + " is lucky not to lose!!");
	}
}

