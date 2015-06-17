import java.util.Arrays;
import java.util.Scanner;


public class SortArrayOfStrings {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String[] names = new String[num];
		for (int i = 0; i < num; i++) {
			names[i] = scan.next();
		}
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[j].compareTo(names[i]) < 0) {
					String temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
			System.out.println(names[i]);
		}
	}
}
