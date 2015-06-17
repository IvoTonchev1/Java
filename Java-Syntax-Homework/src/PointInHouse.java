import java.util.Scanner;


public class PointInHouse {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		boolean isInFirstRec = (x <= 17.5 && x >= 12.5) && (y >= 8.5 && y <= 13.5);
		boolean isInSecondRec = (x <= 22.5 && x >= 20) && (y >= 8.5 && y <= 13.5);
		boolean isInTriangle = false;
		double horPos = (22.5-12.5)*(y-8.5); 
		double leftPos = ((17.5-12.5)*(y-8.5) - (3.5-8.5)*(x-12.5)); 
		double rightPos = ((22.5-17.5)*(y-3.5) - (8.5-3.5)*(x-17.5)); 
		if (horPos <= 0 && leftPos >= 0 && rightPos >= 0) {
			isInTriangle = true;
		}
		if (isInFirstRec || isInSecondRec || isInTriangle) {
			System.out.println("Inside");
		}
		else {
			System.out.println("Outside");
		}
	}

}
