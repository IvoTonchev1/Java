import java.util.Scanner;


public class SymmetricNumbersInRange {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter range : ");
		int start = scan.nextInt();
		int end = scan.nextInt();
		
		for (int i = start; i <= end; i++) {
			String number = Integer.toString(i);
			if (number.length() < 2) {
				System.out.print(number + " ");
			}
			else if (number.charAt(0) == number.charAt(number.length() - 1)) {
				System.out.print(number + " ");			
			}
		}
	}

}
