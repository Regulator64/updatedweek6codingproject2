package updatedweek6codingproject;

public class App {

	public static void main(String[] args) {
	
		Deck deck = new Deck();
        Player player1 = new Player("1");
        Player player2 = new Player("2");
        deck.shuffle();
       
	    for (int i = 0; i < 52; i++) {
	       if ( i % 2 == 0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }   
	    }
        for (int i = 0; i < 26; i++) {
            Card player1Card = player1.flip();
            Card player2Card = player2.flip();
            if (player1Card.getValue() > player2Card.getValue()) {
                    player1.incrementScore();
                } else if (player1Card.getValue() < player2Card.getValue()) {
                    player2.incrementScore();
            }
                
            System.out.print("Player1 score = " + player1.getScore() + "\t"); 
            System.out.print("Player2 score = " + player2.getScore() + "\t\n");
               
            	if (player1.getScore() > player2.getScore()) {
                    System.out.println("Player1 is the winner!");
                } else if (player1.getScore() < player2.getScore()) {
                    System.out.println("Player2 is the winner!");
                } else {
                    System.out.println("DRAW!");
                }
         
        } // end of main

	    }} // end of class
