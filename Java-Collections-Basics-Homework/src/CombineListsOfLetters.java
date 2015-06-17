import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CombineListsOfLetters {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String firstWord = scan.nextLine();
		String secWord = scan.nextLine();
		String[] wordOne = firstWord.split(" ");
		String[] wordTwo = secWord.split(" ");
		List<Character> upper = new ArrayList<Character>();
		List<Character> lower = new ArrayList<Character>();
		for (int i = 0; i < wordOne.length; i++) {
			char temp = wordOne[i].charAt(0);
			upper.add(temp);			
		}
		for (int i = 0; i < wordTwo.length; i++) {
			char temp = wordTwo[i].charAt(0);
			lower.add(temp);
		}
		lower.removeAll(upper);
		upper.addAll(lower);
		for (Character character : upper) {
			System.out.print(character + " ");
		}
	}

}
