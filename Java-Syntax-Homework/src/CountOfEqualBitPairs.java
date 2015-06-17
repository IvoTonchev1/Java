import java.util.Scanner;


public class CountOfEqualBitPairs {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number : ");
		int number = scan.nextInt();
		int count = 0;
		for (int i = 0; i < 16; i++) {
			if (((number>>i) & 1) == ((number>>(i + 1)) & 1)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
