import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class ExtractAllUniqueWords {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] text = input.split("\\W+");
		Set<String> result = new TreeSet<String>();
		for (int i = 0; i < text.length; i++) {
			String temp = text[i].toLowerCase();
			result.add(temp);
		}
		for (String string : result) {
			System.out.print(string + " ");
		}
	}
}
