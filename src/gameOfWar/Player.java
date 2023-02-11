package gameOfWar;

import java.util.ArrayList;
import java.util.List;

public class Player {
	//field
	List<Card> hand = new ArrayList<>();
	private int score;
	private String name;
	//constructor
	public Player (String names) {
	this.name = names;
	this.score = 0;
	this.hand = new ArrayList<Card>();
	
	}
	//getter
	public String getName() {
		return name;
	}
	//setter
	public void setName(String name) {
		this.name = name;
	}
	//getter
	public int getScore() {
		return score;
	}
	//method where player information and the cards that the player has in deck
	public void describe() {
		System.out.println("\n" + name + " has the following cards: " );
		System.out.println();
		for (Card card : hand) {
			card.describe();
		}
		System.out.println("----------------------------");
		}
	//method to flip the card in their hand
	public Card flip() {
		Card inHand = hand.get(0);
		hand.remove(0);
		System.out.print(name + " plays the ");
		inHand.describe();
		return inHand;
		}
	//method to draw the next card
	public void draw(Deck deck) {
		Card card = deck.draw();
		hand.add(card);
	}
	//method to award a point
	public void incrementScore() {
		this.score++;
	}

}