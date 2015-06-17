import java.util.Scanner;


public class RectangleArea {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int height = scan.nextInt();
		int width = scan.nextInt();
		System.out.println("Area is : " + (height*width));
	}

}
