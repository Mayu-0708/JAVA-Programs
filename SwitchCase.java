package nov_14;

import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------- Choices ---------------");
		System.out.println("1. Withdraw Process \n2. Change Pin\n3.Print Last Transaction\n");
		System.out.println("What Do You Want to Do ?");
		choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Enter Amount And Complete Withdraw the Process");
				break;
			case 2:
				System.out.println("Change The pin");
				break;
			case 3:
				System.out.println("Last Transaction ");
				break;
			default:
				System.out.println("Please Enter Valid Choise");
				break;
		}
		sc.close();
	}

}
