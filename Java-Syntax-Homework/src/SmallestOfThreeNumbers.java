import java.util.Scanner;


public class SmallestOfThreeNumbers {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		double numOne = scan.nextDouble();
		double numTwo = scan.nextDouble();
		double numThree = scan.nextDouble();
		if (numOne < numTwo && numOne < numThree) {
			System.out.println(numOne);
		}
		else if (numTwo < numOne && numTwo < numThree){
			System.out.println(numTwo);
		}
		else {
			System.out.println(numThree);
		}
	}

}
