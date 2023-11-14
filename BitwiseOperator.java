package nov_14;

import java.util.Scanner;
public class BitwiseOperator {

	public static void main(String[] args) {
		int num1,num2,result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number = ");
		num1 = sc.nextInt();
		System.out.println("Enter Second Number = ");
		num2 = sc.nextInt();
		
		//------------Bitwise & (and) -------------
		result = num1 & num2;
		System.out.println("Result of &(and) Operator = "+result);
		
		//-----------Bitwise | (or) --------------
		result = num1 | num2;
		System.out.println("Result of |(or) Operator = "+result);
		
		//-----------Bitwise ^ (XOR) --------------
				result = num1 ^ num2;
				System.out.println("Result of ^(xor) Operator = "+result);
		sc.close();
	}

}
