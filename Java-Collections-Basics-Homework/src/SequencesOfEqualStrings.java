import java.util.Scanner;


public class SequencesOfEqualStrings {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] words = input.split("\\s+");
		System.out.print(words[0]);
		for (int i = 0; i < words.length - 1; i++) {
			if (words[i].equals(words[i + 1])) {
				System.out.print(" " + words[i + 1]);
			}
			else {
				System.out.println();
				System.out.print(words[i + 1]);				
			}
		}
	}
}
