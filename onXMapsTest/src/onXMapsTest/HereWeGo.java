package onXMapsTest;

import java.util.Scanner;

public class HereWeGo {
	public static void main (String args[]) {
		System.out.println("This is a onX Test for Prime Number");
		System.out.println("Please enter a number between [1 - 100]:");
		Scanner inputValue = new Scanner(System.in);
		String inputValueString = inputValue.nextLine();
		int inputGiven = Integer.parseInt(inputValueString);
		if (inputGiven <= 100) {
			int[] prime = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
			boolean test = false; 
			for (int element : prime) { 
				if (element == inputGiven) { 
					test = true; 
					System.out.println("The entered value: " + inputValueString + " - IS a Prime Number!");
					break; 
				}
			} 
			if (test != true) {
				System.out.println("The entered value: " + inputValueString + " - is NOT a Prime Number");
			}
		}else
			System.out.println("Error: Value "+ inputValueString + " is NOT between 1 - 100");
	}
}