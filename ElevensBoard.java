package InProgress;


import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board {

	/**
	 * The size (number of cards) on the board.
	 */
	private static final int BOARD_SIZE = 9;

	/**
	 * The ranks of the cards for this game to be sent to the deck.
	 */
	private static final String[] RANKS =
		{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	/**
	 * The suits of the cards for this game to be sent to the deck.
	 */
	private static final String[] SUITS =
		{"spades", "hearts", "diamonds", "clubs"};

	/**
	 * The values of the cards for this game to be sent to the deck.
	 */
	private static final int[] POINT_VALUES =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 13, 13};

	/**
	 * Flag used to control debugging print statements.
	 */
	private static final boolean I_AM_DEBUGGING = false;
	
	public boolean valid;

	/**
	 * Creates a new <code>ElevensBoard</code> instance.
	 */
	 public ElevensBoard() {
	 	super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
	 }

	/**
	 * Determines if the selected cards form a valid group for removal.
	 * In Elevens, the legal groups are (1) a pair of non-face cards
	 * whose values add to 11, and (2) a group of three cards consisting of
	 * a jack, a queen, and a king in some order.
	 * @param selectedCards the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal;
	 *         false otherwise.
	 */
	@Override
	public boolean isLegal(List<Integer> selectedCards) {
		if (selectedCards.size() == 0){
			System.out.println("Select cards by clicking on them.");
			return false;
		}
		if (selectedCards.size() == 2){
			if (containsPairSum11(selectedCards)){
				valid = true;
				return true;
				
			}
		}
		if (selectedCards.size() == 3){
			if (containsJQK(selectedCards)){
				valid = true;
				return true;
				}	
	
		}
		System.out.println("Invalid selection of cards. Remember, you must select either a pair of cards that sum to 11 or a Jack, Queen and King.");
		valid = false;
		return false;
			}

	

	/**
	 * Determine if there are any legal plays left on the board.
	 * In Elevens, there is a legal play if the board contains
	 * (1) a pair of non-face cards whose values add to 11, or (2) a group
	 * of three cards consisting of a jack, a queen, and a king in some order.
	 * @return true if there is a legal play left on the board;
	 *         false otherwise.
	 */
	

	@Override
	public boolean anotherPlayIsPossible() {
		/* *** TO BE MODIFIED IN ACTIVITY 11 *** */
		List<Integer> cIndexes = cardIndexes();
		return containsPairSum11(cIndexes) || containsJQK(cIndexes);
	}
//		/* *** IMPLEMENTED IN ACTIVITY 9 *** */
//		List<Card> selected = new ArrayList<Card>();
//		for (Card c : getCards()) {
//			System.out.println(c.getPoints());
//			selected.add(ArrayList.indexOf(c));
//			selected.add(getCards().in);
//		}
//		return (containsPairSum11(boardCards) || containsJQK(boardCards));
//}
//	public boolean anotherPlayIsPossible() {
//		int len = getCards().length;
//		if (deckSize() < 2){
//			len -= 2;
//		}
//		for(Card card : getCards()){
//			System.out.println(getCards().length);
//			System.out.println("Card 1:" + card.getPoints());
//			if (len >= 2){
//			for (Card card2 : getCards()){
//				System.out.println("Card 2: " + card2.getPoints());
//				if (card.getPoints() + card2.getPoints() == 11) {
//					System.out.println("here");
//					return true;
//				}
//				//	if (card.getPoints() == 11){
//						//if (card2.getPoints() == 12){
//								for (Card card3 : getCards()){
//									if (containsJQK(card, card2, card3) return true;
//										System.out.println("Card 3: " + card2.getPoints());	
//									//	if (card3.getPoints() == 13){
//									//		return true;
////					if (card.getPoints() == 11){
////						if (card2.getPoints() == 12){
////							if (card3.getPoints() == 13){
////								return true;
//							}
//						}
//					}
//			}}
//			}
//		}
//		return false;
//	}
//	@Override
//	public boolean anotherPlayIsPossible() {
//		for(Card card : getCards()){
//			if(card == null) System.out.println("card is null");
//			for (Card card2 : getCards()){
//				if(card2 == null ) System.out.println("card2 is null");
//				if (card.getPoints() + card2.getPoints() == 11) return true;
//				for (Card card3 : getCards()){
//					if (card.getPoints() == 11){
//						if (card2.getPoints() == 12){
//							if (card3.getPoints() == 13){
//								return true;
//							}
//						}
//					}
//			}
//			}
//		}
//		return false;
//	}

	/**
	 * Check for an 11-pair in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 11-pair.
	 * @return true if the board entries in selectedCards
	 *              contain an 11-pair; false otherwise.
	 */
	private boolean containsPairSum11(List<Integer> selectedCards) {
		/* *** TO BE CHANGED INTO findPairSum11 IN ACTIVITY 11 *** */
		for (int cardIndex:selectedCards){
			//System.out.println(cardAt(cardIndex).getPoints());
			for (int cardIndex2:selectedCards){
				//System.out.println(cardAt(cardIndex2).getPoints());
			if (cardAt(cardIndex).getPoints() + cardAt(cardIndex2).getPoints() == 11) {
				return true;
		}
			}
//		for (int cardPosition = 0; cardPosition < selectedCards.size(); cardPosition++) {
//			int k1 = selectedCards.get(cardPosition).intValue();
//			for (int sk2 = cardPosition + 1; sk2 < selectedCards.size(); sk2++) {
//				int k2 = selectedCards.get(sk2).intValue();
//				if (cardAt(k1).getPoints() + cardAt(k2).getPoints() == 11) {
//					return true;
//				}
//			}
//		}
		}
		return false;
	}
//	private boolean containsPairSum11(List<Integer> selectedCards) {
//		if (selectedCards.size() == 2){
//			if (cards[selectedCards.get(0)].getPoints() + cards[selectedCards.get(1)].getPoints() == 11 && 
//					cards[selectedCards.get(0)].getPoints() < 11 && cards[selectedCards.get(1)].getPoints() < 11){
//				return true;
//			}
//		}
//		return false;
//	}

	/**
	 * Check for a JQK in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a JQK group.
	 * @return true if the board entries in selectedCards
	 *              include a jack, a queen, and a king; false otherwise.
	 */
	private boolean containsJQK(List<Integer> selectedCards) {
		/* *** TO BE CHANGED INTO findJQK IN ACTIVITY 11 *** */
		boolean foundJack = false;
		boolean foundQueen = false;
		boolean foundKing = false;
		for (Integer kObj : selectedCards) {
		int k = kObj.intValue();
			if (cardAt(k).getRank().equals("jack")) {
				foundJack = true;
			} else if (cardAt(k).getRank().equals("queen")) {
				foundQueen = true;
			} else if (cardAt(k).getRank().equals("king")) {
				foundKing = true;
			}
		}
		return foundJack && foundQueen && foundKing;
	}
//	private boolean containsJQK(List<Integer> selectedCards) {
//		List<Card> temp = new ArrayList<Card>();
//		for (int n = 0; n < 3; n++){
//			temp.add(cards[selectedCards.get(n)]);		
//	}
//		if (selectedCards.size() == 3){
//			for(Card card : temp){
//				for (Card card2 : temp){
//					if (card.getPoints() + card2.getPoints() == 11) return true;
//					for (Card card3 : temp){
//						if (card.getPoints() == 11){
//							if (card2.getPoints() == 12){
//								if (card3.getPoints() == 13){
//									return true;
//								}
//							}
//						}
//					}
//				}
//			}
//		}
//		System.out.println("test2");
//		return false;
//	}
}
		//			for (int n = 0; n > 3; n++){
//			if (cards[selectedCards.get(n)].getPoints() == 11){
//				System.out.println("t28est");
//				for (int k = 0; k > 3; k++){
//					if (cards[selectedCards.get(k)].getPoints() == 12){
//						System.out.println("t2est");
//						for (int m = 0; m > 3; m++){
//							System.out.println("tes3t");
//							if (cards[selectedCards.get(m)].getPoints() == 13)
//								System.out.println("te4st");
//								return true;
//							}
//						}
//					}
//				}			}
	
		