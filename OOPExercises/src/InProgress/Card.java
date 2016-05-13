package InProgress;
/*
 * Here is my code for activity 2.
 * All the methods are explained before each method in comments,
 * so I will use this space to answer the questions the PDF asked us.
 * 1) A deck of cards is a collection of 52 cards, 13 of each suit. In each suit,
 * the cards range from Ace to King. 
 * 2) When I play card games, the cards can be drawn, discarded, added together, etc.
 */


/**
 * Card.java
 *
 * <code>Card</code> represents a playing card.
 */
public class Card {

	/**
	 * String value that holds the suit of the card
	 */
	public String suit;

	public String rank;

	/**
	 * int value that holds the point value.
	 */
	private int pointValue;

	

   /**
	 * Creates a new <code>Card</code> instance.
	 *
	 * @param cardRank  a <code>String</code> value
	 *                  containing the rank of the card
	 * @param cardSuit  a <code>String</code> value
	 *                  containing the suit of the card
	 * @param cardPointValue an <code>int</code> value
	 *                  containing the point value of the card
	 */

	//Constructor
		public Card(String rank, String suit, int pointValue){
			this.rank = rank;
			this.suit = suit;
			this.pointValue = pointValue;
		}
		//Getters
		/**
		 * Accesses this <code>Card's</code> rank.
		 * @return this <code>Card's</code> rank.
		 */
		public String getRank(){
			return this.rank;
		}
		/**
		 * Accesses this <code>Card's</code> suit.
		 * @return this <code>Card's</code> suit.
		 */
		public String getSuit(){
			return this.suit;
		}
		public void setAll(String suit, String rank, int pointValue){
			this.suit = suit;
			this.rank = rank;
			this.pointValue = pointValue;
		}
		public void setSuit(String suit) {
			this.suit = suit;
		}
		public void setRank(String rank) {
			this.rank = rank;
		}
		public void setPointValue(int pointValue) {
			this.pointValue = pointValue;
		}
		/**
		 * Accesses this <code>Card's</code> point value.
		 * @return this <code>Card's</code> point value.
		 */
		public int getPoints(){
			return this.pointValue;
		}
		
		
	/** Compare this card with the argument.
	 * @param otherCard the other card to compare to this
	 * @return true if the rank, suit, and point value of this card
	 *              are equal to those of the argument;
	 *         false otherwise.
	 */
	public boolean matches(Card otherCard) {
		return(this.pointValue == otherCard.pointValue
				&& this.rank == otherCard.rank && 
				this.suit == otherCard.suit);
	}


	/**
	 * Converts the rank, suit, and point value into a string in the format
	 *     "[Rank] of [Suit] (point value = [PointValue])".
	 * This provides a useful way of printing the contents
	 * of a <code>Deck</code> in an easily readable format or performing
	 * other similar functions.
	 *
	 * @return a <code>String</code> containing the rank, suit,
	 *         and point value of the card.
	 */
	@Override
	public String toString() {
		return rank + " of " + suit + "(point value = " + pointValue + ")";
	}
}
