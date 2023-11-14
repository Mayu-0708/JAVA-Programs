package nov_14;

import java.util.Scanner;
public class AreaOfRectangle {

	public static void main(String[] args) {
		int R_length, R_breadth, areaOfRectangle;
		Scanner sc = new Scanner(System.in);
		//Accepting Length and Breadth of Rectangle by using Scanner Class
		System.out.println("Enter Length of Rectangle = ");
		R_length = sc.nextInt();
		System.out.println("Enter Breadth of Rectangle = ");
		R_breadth = sc.nextInt();
		//Area of Rectangle = length * Breadth
		areaOfRectangle = R_length * R_breadth;
		System.out.println("Area Of Rectangle = "+areaOfRectangle);
		sc.close();
	}

}
