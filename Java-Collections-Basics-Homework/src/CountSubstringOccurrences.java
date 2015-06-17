import java.util.Scanner;


public class CountSubstringOccurrences {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String word = scan.nextLine();
		String newWord = word.toLowerCase();
		String[] words = input.split("\\W+");
		int count = 0;
    	int lastIndex = 0;
		for (int i = 0; i < words.length; i++) {
			String checkWord = words[i].toLowerCase();
		    while ((lastIndex = checkWord.indexOf(newWord, lastIndex)) != -1) {
		        count++;
		        lastIndex += newWord.length() - 1;
		    }
		}	    
	    System.out.println(count);
	}
}
