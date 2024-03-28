package updatedweek6codingproject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	List<Card> hand = new ArrayList<Card>();
	int score;
	String name;
	// String playerName = Player 1, Player 2;
		
	public Player(String name) { // 2.score (set to 0 in the constructor)
		this.score = 0;
		this.name = name;
	}
	
	public void describe() {
		
		System.out.println(name + " " + score);  // (prints out information about the player and calls 
		                                        // the describe method for each card in the Hand List)
		for (Card card : hand) {
			card.describe();
		}
	} 
	
	public Card flip() {  
	return hand.remove(0);           
			
	}
	
	public void draw(Deck deck) {
        hand.add(deck.draw());
		 }
		
	public void incrementScore() { // 4. incrementScore (adds 1 to the Player’s score field)
		score++;
		
		 }

	public int getScore() {
		        return score;
	}

} // end of class
