import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LongestIncreasingSequence {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] words = input.split("\\s+");
		int[] numbers = new int[words.length];
		for (int i = 0; i < words.length; i++) {
			numbers[i] = Integer.parseInt(words[i]);
		}
		int count = 1;
		int temp = 1;
		List<Integer> last = new ArrayList<Integer>();
		last.add(numbers[0]);
		System.out.print(numbers[0]);
		for (int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i] < numbers[i + 1]) {
				System.out.print(" " + numbers[i + 1]);
				count++;
				if (count > temp) {
					temp = count;
					last.clear();
					for (int j = 0; j < temp; j++) {
						last.add(numbers[i + 1 -j]);
					}
				}
			}
			else {
				System.out.println();
				System.out.print(numbers[i + 1]);
				count = 1;
				if (count > temp) {
					temp = count;
					last.clear();
					for (int j = 0; j < temp; j++) {
						last.add(numbers[i + 1 -j]);
					}
				}
			}
		}
		last.sort(null);
		System.out.println();
		System.out.print("Longest: ");
		for (Integer integer : last) {
			System.out.print(integer + " ");
		}
	}
}