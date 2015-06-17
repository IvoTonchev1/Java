import java.util.Scanner;


public class GenerateThreeLetterWords {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String charSet = scan.next();
		for (int i = 0; i < charSet.length(); i++) {
			for (int j = 0; j < charSet.length(); j++) {
				for (int k = 0; k < charSet.length(); k++) {
					System.out.printf("%s%s%s", charSet.charAt(i), charSet.charAt(j), charSet.charAt(k) + " ");
					
				}
			}
		}
	}
}
