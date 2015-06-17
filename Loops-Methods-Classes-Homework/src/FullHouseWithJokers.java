public class FullHouseWithJokers {

	public static void main(String[] args) {
		String[] faces = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
		char[] suits = { '♣', '♦', '♠', '♥' };
		char joker = '*';
		int currentFoundIndex = 0;
		String numberAsBinary = "";		
		String[] cards = new String[5];
		String[] tempCards = new String[5];		
		int count = 0;
		for (int i = 0; i < faces.length; i++) {
			for (int q = 0; q < faces.length; q++) {
				if (q == i) continue;
				for (int suit = 0; suit < suits.length; suit++) {
					for (int suitTriple = 0; suitTriple < 3; suitTriple++) {
						cards[suitTriple] = faces[i] + suits[(suit+suitTriple)%suits.length];
					}
					for (int fourthSuit = 0; fourthSuit < suits.length; fourthSuit++) {
						for (int fifthSuit = fourthSuit + 1; fifthSuit < suits.length; fifthSuit++) {
							cards[3] = faces[q] + suits[fourthSuit];
							cards[4] = faces[q] + suits[fifthSuit];
							for (int j = 0; j < 32; j++) {
								tempCards = cards.clone();
								numberAsBinary = Integer.toBinaryString(j);
								currentFoundIndex = numberAsBinary.indexOf('1');
								while(currentFoundIndex != -1) {
									cards[numberAsBinary.length() - 1 - currentFoundIndex] = Character.toString(joker);
									currentFoundIndex = numberAsBinary.indexOf('1', currentFoundIndex + 1);
								}								
								count++;
								printCards(cards);
								cards = tempCards;
							}
						}
					}
				}
			}
		}
		System.out.println(count + " full houses");
	}
	
	public static void printCards(String[] cards) {
		System.out.print('(');
		for (int i = 0; i < cards.length; i++) {
			if (i != 0) System.out.print(' ');
			System.out.print(cards[i]);
		}
		System.out.println(')');
	}

}