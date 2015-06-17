import java.util.Scanner;


public class DecimalToHexadecimal {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		String hex = Integer.toHexString(number);
		System.out.println(hex);

	}

}
