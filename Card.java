package updatedweek6codingproject;



public class Card {
	private int value;
	private String name;
	private String suit;
	
	Card (int value, String name, String suit) {
		this.setValue(value);
		this.setName(name);
		this.setSuit(suit);
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	
	}
	  public String getName() {
	    return name;
	}

	  public void setName(String newName) {
	    this.name = newName;
	}

	public void describe() {
		System.out.println(name + " of: " + suit);
	
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}
	
} // end of class
