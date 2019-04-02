/*
Name: Moses Kim
Course: COSI 11A, Section 2
Date: November 30, 2015
Description: This program takes an array input by the user and finds the length of the 
			 longest sorted sequence. Here the sorting we refer to is that with increasing
			 order (<). 
*/

import java.util.*;

public class Problem2{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		//We ask the user to choose the size of the array to be entered.
		System.out.print("Enter the size of the array to be entered: ");
		int size = console.nextInt();
		
		//We then create an array of integers of the size specified by the user
		
		int[] array = new int[size];
		
		//We accept the array entry values from the user by writing a for loop that runs
		//the integer value size number of times.
		
		for (int i = 0; i < array.length; i++) {
			System.out.printf("Enter element at index %d: ", i);
			array[i] = console.nextInt();
		}
	
		//Now that we have an array with values in it we pass it to our method
		//longestSortedSequence, described and implemented below, and print the length
		//of the longest sorted sequence inside the array.
		
		System.out.println("The length of the longest sorted sequence in your array is: " 
		+ longestSortedSequence(array)); 
		
	
	}
	
	
	
	public static int longestSortedSequence(int[] array){
		//we define a few variables to keep track of the lengths of sequences we encounter
		//in the array
		int longestlength = 1;
		int currlength;
		
		//we define a boolean variable below. This variable will signal when the end of
		//a sorted sequence in the array. This shows up in the while loop nested inside
		//the for loop below
		
		boolean sort;
		
		
		//Now we write a for loop to identify the length of the longest sorted sequence
		//In order to do this is to use the two variables above to update the variable
		//longestlength if we find a longer sorted sequence while the variable currlength
		//is used to measure the length of the sequence being examined.
		
		for (int i = 0; i <= array.length-2; i++){
			currlength = 1;
			sort = true;
			
			while (sort) {
				if (i < array.length - 1 && array[i] < array[i+1]) {
					i++; //here it is important that we increment i so that we don't
						 //end up checking a subsequence of a given sequence.
					currlength++;
				}
				//when we find a value that is smaller than the previous one, we stop
				//and start over at the next index by exiting the while loop.
				else{
					sort = false;
				}
			}
				//we update the longestlength variable if we find a longer sorted seq.
				
			if (longestlength < currlength) {
				longestlength = currlength;
			}
				
			
		
		}
		return longestlength;

	}
}