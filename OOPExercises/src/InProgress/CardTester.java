package InProgress;


	public class CardTester {

		/**
		 * The main method in this class checks the Card operations for consistency.
		 *	@param args is not used.
		 */
		public static void main(String[] args) {
			Card c1 = new Card("Six", "Spades", 6);
			System.out.println(c1);
			System.out.println(c1.getPoints());
			System.out.println(c1.getRank());
			System.out.println(c1.getSuit());
			
			Card c2 = new Card("Ace", "Diamonds", 1);
			System.out.println(c2);
			System.out.println(c2.getPoints());
			System.out.println(c2.getRank());
			System.out.println(c2.getSuit());
			System.out.println(c2.matches(c1));
			
			Card c3 = new Card("Ace", "Diamonds", 1);
			System.out.println(c3);
			System.out.println(c3.getPoints());
			System.out.println(c3.getRank());
			System.out.println(c3.getSuit());
			System.out.println(c3.matches(c2));
		}
	}


