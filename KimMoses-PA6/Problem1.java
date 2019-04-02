/*
Name: Moses Kim
Course: COSI 11A, Section 2
Date: November 30th
Description: This program determines whether an array's elements are all distinct. Here
			 we consider integers as data type.
*/


import java.util.*;

public class Problem1 {
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		
		System.out.print("Choose the size of your array: ");
		int size = console.nextInt();
		
		//We create an array
		
		int[] array = new int[size];
		
		
		//Now we prompt the user to enter the values of each element in the array
		
		for (int i = 0; i < array.length; i++) {
			System.out.printf("Enter element at index %d: ", i);
			array[i] = console.nextInt();
		}
	
		System.out.print("The array you entered ");
		
		//Now we write an if statement to print whether an array is unique or not by 
		//calling the method isUnique(), which is implemented and described below.
	
		if (isUnique(array)) {
			System.out.print("is unique.\n");
		}
		else{
			System.out.print("is not unique.\n");
		}
	}
	
	//Here we implement the heart of the program.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        	
	// @param array of integers array
	// output: boolean value of true if all entries in the array are distinct, false o/w.
	
	public static boolean isUnique(int[] array){
		//we write a for loop checking whether the ith element of the array 
		//is not equal to the i+1, i+2, ..., size - 1 element in the array.
		//We do this by writing a nested for loop.
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i] == array[j]){
					return false;
				}
			}
		}	
		return true;
	}




}
