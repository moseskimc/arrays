/*
Name: Moses Kim
Course: COSI 11A, Section 2
Date: December 1st, 2015
Description: This program simulates the game 'the price is right' by accepting an array
			 of integer values from the user and returning the bid that is closest but
			 smaller or equal to the actual price of the item.
*/

import java.util.*;


public class Problem3 {
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		
		//We first ask the user to enter the price of the item to be guessed.
		System.out.print("Enter the price of your item: ");
		
		int price = console.nextInt();
		
		//We ask the user to choose the size of the array to be entered.
		System.out.print("Enter the size of the array to be entered: ");
		int size = console.nextInt();
		
		//We then create an array of integers of the size specified by the user
		
		int[] bids = new int[size];
		
		//We accept the array entry values from the user by writing a for loop that runs
		//the integer value size number of times.
		
		for (int i = 0; i < bids.length; i++) {
			System.out.printf("Enter a bid (to be stored at index %d): ", i);
			bids[i] = console.nextInt();
		}
		
		//Now that we have our list of bids stored as an array, we pass this array to our
		//method priceIsRight(), which will return the bid that is the closest and smaller
		//or equal to the price of the item.
		
		int bid = priceIsRight(bids, price);
		
		if (bid != price) {
			System.out.println("The closest bid was: " + bid);
		}
		else {
			System.out.println("The price is right!");
		}

	}
	
	//we basically traverse the array and check for bid values smaller or equal to the 
	//value of price. We update the value of the variable closestbid if we find a closer
	//bid.
	
	public static int priceIsRight(int[] array, int price) {
		int currbid = 0; //we use this variable to keep track of the bid closest to the
						 //to the price as we traverse the array.
							
		//We first need to find the first element in the array that is smaller than the 
		//value of price.
		
		int index = 0;
		
		while (index < array.length && array[index] > price ) {
			index++;
		} 
		
		//We check whether all the elements in the array are larger than the price.
		//If that is the case, we return the value -1.
		
		if (index == array.length){
			return -1;
		}
		//if there exists a bid value smaller than the price, we check whether there is 
		//a closer one to the price.
		else {
			currbid = array[index];
			for (int i = index + 1; i < array.length; i++) {
				if (currbid == price || price == array[i])  {
					return price;
				}
				else if (price-array[i]>0 && price-currbid>0 && currbid<array[i]) {
					currbid = array[i];
				}
			
			}
		}
		
		return currbid;
		
		
	}
	
	



}