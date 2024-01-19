/*
 * "A merchant wishes to calculate the profit he makes with his sales. To achieve this he ordered to make a list
 * about a group of N items. Describing name, buying price, selling price and profit. Make a program that reads
 * this data and displays how many items: 
 * 		* had a profit rate under 10%
 * 		* 10% <= profit  <= 20%;
 * 		* profit > 20%
 * Also display the total buying and selling price, total profite aswell"
 * 		--Problem given by Nelion Alves
 */

package arrays;

import java.util.Scanner;
import java.util.Locale;

public class MercantProfit {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Welcome!\nHow items will be entered?: ");
		 int itemsQuantity = scanner.nextInt();
		
		String[] itemsNames = new String[itemsQuantity];
		double[] buyingPrices = new double[itemsQuantity];
		double[] sellingPrices = new double[itemsQuantity];
		double totalBuyingPrice = 0;
		double totalSellingPrice = 0;
		
		for ( int i = 0; i < itemsQuantity; i++ ) {
			System.out.printf("item No%d\n", i+1);
			System.out.print("Insert item name: ");
			 scanner.nextLine();
			 itemsNames[i] = scanner.nextLine();
			System.out.print("Insert buying price: ");
			 buyingPrices[i] = scanner.nextDouble();
			System.out.print("Insert selling price: ");
			 sellingPrices[i] = scanner.nextDouble();
			 
			totalBuyingPrice += buyingPrices[i];
			totalSellingPrice += sellingPrices[i];
		}
		
		double totalProfit = totalSellingPrice - totalBuyingPrice;
		
		double itemProfit = 0;
		double profitRate = 0;
		int lowProfitItemsQuantity = 0;
		int mediumProfitItemsQuantity = 0;
		int highProfitItemsQuantity = 0;
		for ( int i = 0; i < itemsQuantity; i++ ) {
			itemProfit = sellingPrices[i] - buyingPrices[i];
			profitRate = itemProfit / buyingPrices[i];
			
			if (profitRate < 0.1 ) {
				lowProfitItemsQuantity++;
			} else if ( profitRate >= 0.1 && profitRate <= 0.2 ) {
				mediumProfitItemsQuantity++;
			} else {
				highProfitItemsQuantity++;
			}
		}
		
		System.out.println("\nReport" + "\n Profit under 10%: " + lowProfitItemsQuantity + "\n Profit between 10% and 20%: " + mediumProfitItemsQuantity +
				"\n Profit above 20%: " + highProfitItemsQuantity+ "\n Total buying price: " + String.format("%.2f", totalBuyingPrice) + "\n Total selling price: " +
				String.format("%.2f", totalSellingPrice) + "\n Total profit: " + String.format("%.2f", totalProfit) );
		
		scanner.close();
	}
}

