import java.util.Scanner;


public class CountSpecifiedWord {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String word = scan.nextLine();
		String newWord = word.toLowerCase();
		String[] words = input.split("\\W+");
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			String checkWord = words[i].toLowerCase();
			if (checkWord.equals(newWord)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
