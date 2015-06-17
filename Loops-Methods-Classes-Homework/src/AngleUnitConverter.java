import java.util.Scanner;


public class AngleUnitConverter {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of queries : ");
		int number = scan.nextInt();
		double result = 0;
		for (int i = 0; i < number; i++) {
			double angle = scan.nextDouble();
			String type = scan.next();
			if (type.equals("deg")) {
				result = angle * Math.PI / 180;
				System.out.printf("%f rad \n", result);
			}
			else if (type.equals("rad")) {
				result = angle * 180 / Math.PI;
				System.out.printf("%f deg \n", result);
			}
		}
	}
}
