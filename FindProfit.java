package nov_14;

import java.util.Scanner;

public class FindProfit {

	public static void main(String[] args) 
	{
		int selling_price, cost_price, profit;
		Scanner sc = new Scanner(System.in);
		// Accept Cost Price and Selling Price From user
		System.out.println("Enter Selling Prise = ");
		selling_price = sc.nextInt();
		System.out.println("Enter Cost Prise = ");
		cost_price = sc.nextInt();
		//Calculate Profit
		profit = selling_price - cost_price;
		if (profit ==  0)
		{
			System.out.println("Nither Profit Nor Loss");
		}
		else if (profit > 0) 
		{
			System.out.println("Profit is "+profit);
		}
		else 
		{
			System.out.println("It is Loss "+(-profit));
		}
		sc.close();
	}

}
