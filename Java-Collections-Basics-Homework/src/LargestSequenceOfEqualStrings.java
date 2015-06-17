import java.util.Scanner;


public class LargestSequenceOfEqualStrings {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] words = input.split("\\s+");
		int temp = 0;
		String result = " ";
		int count = 1;
		if (words.length < 2) {
			System.out.println(words[0]);
		}
		else {
			for (int i = 0; i < words.length - 1; i++) {			
				if (words[i].equals(words[i + 1])) {
					count++;
					if (count > temp) {
						temp = count;
						result = words[i];
					}
				}
				else {
					count = 1;
					if (count > temp) {
						temp = count;
						result = words[i];
					}
				}
			}
			for (int j = 0; j < temp; j++) {
				System.out.print(result + " ");
			}
		}
	}
}