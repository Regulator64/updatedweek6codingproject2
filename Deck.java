package updatedweek6codingproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private List<Card> deck = new ArrayList<Card>();
	private String[] cardValueName = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	private String[] suit = {"Spades", "Diamonds", "Clubs", "Hearts"};
	
	
	
	public Deck() {
		for (String suitName : suit) {
		for (String cardName : cardValueName) {	
			for (int i = 2; i < 15; i++) {
				deck.add(new Card(i, cardName, suitName));
			} 
		}	
		}
	}
	public void shuffle() {       
		Collections.shuffle(deck);                      
	}
	public Card draw() {           
		Card drawTopCard = deck.remove(0);
		return drawTopCard;
	}
	
	
} // end of class
