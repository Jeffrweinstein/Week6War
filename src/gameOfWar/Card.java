package gameOfWar;

public class Card {
/*War is a card game that uses a 52 standard playing card deck containing 4 suits and 13 
 * cards ranked from Ace (highest) to Two (lowest).  In our version, each player receives 26 cards and flips over 
 * the card at the same time.  The player with the highest value is assigned a point.  Most points at the end of the game wins.
 */
public static final int Spades = 0;   //values for suits
public static final int Hearts = 1;
public static final int Diamonds = 2;
public static final int Clubs = 3;


public static final int Two = 2;     //values for cards
public static final int Three = 3;
public static final int Four = 4;
public static final int Five = 5;
public static final int Six = 6;     
public static final int Seven = 7;
public static final int Eight = 8;
public static final int Nine =  9;
public static final int Ten = 10;
public static final int Jack = 11;     
public static final int Queen = 12;
public static final int King = 13;
public static final int Ace = 14;

//fields
private int name;
private int value;

//constructor
public Card(int name, int value) {				
	
	this.setName(name);
	this.setValue(value);
}
// setters
private void setName(int name) {
	if (name != Spades && name != Hearts & name != Diamonds && name != Clubs) {
		throw new IllegalArgumentException("Illegal Name"); }
	else {
		this.name = name;
	}
	}

private void setValue(int value) {
	if (value < 2 || value > 14) {
	throw new IllegalArgumentException("Illegal Value"); }
else {
		this.value = value;
}
	
	
}
//getters
public int getName() {
	return name;
}
public int getValue() {
	return value;
}
/*String to String is the way the cards will be displayed 
 *in the main method   value "of" name 
 */
@Override
public String toString() {
	String c = "";
	if (value == Two) {
			c += "Two"; }
	else if (value == Three) {
			c += "Three"; }
	else if (value == Four) {
			c += "Four"; }
	else if (value == Five) {
		c += "Five"; }
    else if (value == Six) {
		c += "Six"; }
    else if (value == Seven) {
		c += "Seven"; }
    else if (value == Eight) {
		c += "Eight"; }
    else if (value == Nine) {
	    c += "Nine"; }
    else if (value == Ten) {
	    c += "Ten"; }
    else if (value == Jack) {
		c += "Jack"; }
    else if (value == Queen) {
		c += "Queen"; }
    else if (value == King) {
	    c += "King"; }
    else if (value == Ace) {
	    c += "Ace"; }
    else {
		c += value;
	}
	
	c += " of ";

	if (name == Clubs) {
		c  += "Clubs";
	} else if (name == Diamonds) {
		c += "Diamonds";
	} else if (name == Hearts) {
		c += "Hearts";
	} else if (name == Spades) {
		c += "Spades";
	}
	return c;

}
	public void describe() {
		System.out.println(toString() + "\n");


}
	
	
		
		
		
		
	
}


	





	
	

