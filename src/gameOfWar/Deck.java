package gameOfWar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	//field in an array that puts cards into the deck
	List<Card> cards = new ArrayList<Card>();
	
	public Deck () {
		for (int n = 0; n < 4; n++) {
			for (int v = 2; v < 15; v++) {
				cards.add(new Card (n, v));
			}
		}

	}
	//method that will shuffle the cards
	public void shuffle() {
		Collections.shuffle(cards);
	}
	//method that will draw the top card from the deck
	public Card draw() {
		Card cardDraw = cards.get(0); 
			cards.remove(0);
			return(cardDraw);
		}
	}
	
