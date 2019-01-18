import java.util.Scanner;

public class CircArea {
	
	public CircArea() {

		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Allows users to input radius
		System.out.println("Type radius below");
		Scanner input = new Scanner(System.in);
		int radius = input.nextInt();
		
		// Calculates circumference
		Double circ = 2 * Math.PI * radius;
		String [] ans = circ.toString().split("\\.");
		String dec= ans[1];
		String circumference = ans[0] + "." + dec.substring(0,2);
		
		//Calculates Area
		Double area = Math.PI * Math.pow(radius, 2);
		String[] ans1 = area.toString().split("\\.");
		String dec1 = ans1[1];
		String area1 = ans1[0] + "." + dec1.substring(0,2);
		
		//Prints out Area and Circumference of Circle in two decimal places.
		System.out.println("Area of Circle = " + area1);
		System.out.println("Cricumference of Circle = " + circumference);

	}

}
