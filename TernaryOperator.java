package nov_14;

import java.util.Scanner;
public class TernaryOperator {

	public static void main(String[] args) {
		int num1, num2, result;
		Scanner sc = new Scanner(System.in); 
		//Accepting Numbers
		System.out.println("Enter First Number = ");
		num1 = sc.nextInt();
		System.out.println("Enter Second Number = ");
		num2 = sc.nextInt();
		//----------Conditional Operator -------------
		result = (num1 > num2) ? num1 : num2;
		System.out.println("Result is "+result);
		sc.close();
	}

}
