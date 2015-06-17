import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class RandomHandsOfFiveCards {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of hands : ");
		int number = scan.nextInt();
		String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		String[] suits = {"\u2660", "\u2666", "\u2663", "\u2764"};
		
		for (int i = 0; i < number; i++) {
			Set<String> result = new HashSet<String>();
			while (result.size() < 5) {
				String rndCard = (ranks[new Random().nextInt(ranks.length)]);
				String rndSuit = (suits[new Random().nextInt(suits.length)]);
				String card = rndCard + rndSuit;
				result.add(card);				
			}			
			System.out.println(result);
		}
	}	
}
