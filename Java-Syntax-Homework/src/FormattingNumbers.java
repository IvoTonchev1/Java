import java.util.Scanner;


public class FormattingNumbers {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter integer 0<=a<=500 : ");
		int numOne = scan.nextInt();
		System.out.print("Enter first floating-point number : ");
		double numTwo = scan.nextDouble();
		System.out.print("Enter second floating-point number : ");
		double numThree = scan.nextDouble();
		String first = String.format("%-10s", Integer.toHexString(numOne).toUpperCase());
		String second = String.format("%10s", Integer.toBinaryString(numOne)).replace(' ', '0');
		String third = String.format("%10.2f", numTwo);
		String fourth = String.format("%-10.3f", numThree);
		System.out.println("|" + first + "|" + second + "|" + third + "|" + fourth + "|");
	}

}
