package com.interview.quest;

public class maxProfit {

	// Best time to Buy and Sell a stock

	/*
	 * You are given an array of stock prices in chronological order. You can Buy or
	 * Sell at any price in the array. You must follow the following rules: You must
	 * Buy before you can Sell. Short sales are not allowed in this problem. We are
	 * looking for a single Buy and Sell combination that yields the highest profit.
	 * As long as the Buy is before the Sell this is a valid transaction. You are to
	 * return the maximum profit that you can achieve. This problem could be changed
	 * to return the prices, or the indexes of the values as well.
	 */

	public static void main(String[] args) {
		int A[] = { 100, 80, 120, 130, 70,60,100,125 };
		int B[] ={100, 180, 260, 310, 40, 535, 695};
		System.out.println("Max Profit : " +maximumProfit(A));

	}
	
	 

	public static int maximumProfit(int A[]) {

		int buy = 0;
		int sell = 0;
		boolean buyflag = false;
		int maxProfit = 0;

		for (int i = 0; i < A.length - 1; i++) {
			System.out.print("Day " + i+ " : Buy " +buy + " :Sell " + sell + " :Profit  " + maxProfit +" \n");
			for (int j = i+1; j < A.length; j++) {
				if (A[i] < A[j] && buyflag == false) {
					buy = A[i];
					buyflag = true;
					break;
				} else if (buyflag == true) {
					sell = A[j];
					maxProfit = maxProfit + sell - buy;
					buyflag = false;
								} 
				else
					break;
				
				

			}
			//System.out.print("Day " + i+ " : Buy " +buy + " :Sell " + sell + " :Profit  " + maxProfit +" \n");

		}

		return maxProfit;
	}

}
