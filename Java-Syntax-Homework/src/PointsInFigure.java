import java.util.Scanner;


public class PointsInFigure {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		boolean isInFirst = (x <= 22.5 && x >= 12.5) && (y >= 6 && y <= 8.5);
		boolean isInSecond = (x <= 17.5 && x >= 12.5) && (y >= 8.5 && y <= 13.5);
		boolean isInThird = (x <= 22.5 && x >= 20) && (y >= 8.5 && y <= 13.5);
		if (isInFirst || isInSecond || isInThird) {
			System.out.println("Inside");
		}
		else {
			System.out.println("Outside");	
		}
		
	}

}
