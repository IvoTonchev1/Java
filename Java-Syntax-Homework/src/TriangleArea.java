import java.util.Scanner;


public class TriangleArea {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter point Ax : ");
		int ax = scan.nextInt();
		System.out.print("Enter point Ay : ");
		int ay = scan.nextInt();
		System.out.print("Enter point Bx : ");
		int bx = scan.nextInt();
		System.out.print("Enter point By : ");
		int by = scan.nextInt();
		System.out.print("Enter point Cx : ");
		int cx = scan.nextInt();
		System.out.print("Enter point Cy : ");
		int cy = scan.nextInt();
		System.out.print("Area of triangle is: " + Math.abs((ax*(by-cy)+bx*(cy-ay)+cx*(ay-by))/2));
		
	}

}