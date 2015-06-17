
import java.util.Arrays;
import java.util.Scanner;


public class SortArrayOfNumbers {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int[] array = new int[number];
		for (int i = 0; i < number; i++) {
			array[i] = scan.nextInt();
		}
		Arrays.sort(array);
		for (int i : array) {
			System.out.print(i + " ");
		}
	}
}
