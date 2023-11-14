package nov_14;

import java.util.Scanner;
public class NestedCondition {

	public static void main(String[] args) {
		char choice;
		int interview_cat;
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Fresher \n2. Expert");
		System.out.println("Enter Your Status (Either Fresher or Expert)");
		interview_cat = sc.nextInt();
		
		if(interview_cat == 1)
		{
			System.out.println("The Will decide Your Job Profile According to Your Inteview");
		}
		else
		{
			System.out.println("Choice Your Profile : \nJ. JAVA Developer \nN. .net Developer");
			choice = sc.next().charAt(0);
			if(choice == 'J')
			{
				System.out.println("You have Selected the Designation as Java Developer");
			}
			else if(choice == 'N')
			{
				System.out.println("You have Selected the Designation as .net Developer");
			}
			else 
			{
				System.out.println("Select Correct Designation");
			}
		}

		sc.close();
	}

}
