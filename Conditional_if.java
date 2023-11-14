package nov_14;

import java.util.Scanner;
public class Conditional_if {

	public static void main(String[] args) {
		int num, square = 0;//initialize the square
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number = ");
		num = sc.nextInt();
		//if number is positive and less than zero then print the Square
		if(num > 0 && num < 20)
		{
			//Calculate Square of Given Number
			square = num*num; 
			System.out.println("Square of given Number = "+square);
		}
		else
		{
			System.out.println("Please Enter Positive Numbers Less than 20");
		}
		sc.close();
	}

}
