package org.howard.edu.lsp.assignment2.test;
import java.util.Arrays;

import org.howard.edu.lsp.assignment2.combination.SumPairs;

/**
 * This class is used to instantiate and invoke methods
 * in my implementation of the solution to prove that it works.
 * 
 * @author Tyrone Smith
 *
 */

public class SumPairsDriver {
	
	
	/**
	 * This main method is used to instantiate the methods
	 * imported from the SumPairs.java file.
	 * 
	 * Various robust test cases are performed in this method
	 * to test the correctness of the solution.
	 * 
	 * Input cases and output solutions are printed to the screen.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		/**
		 * Test Case 1: Test case given by professor.
		 * Works as predicted
		 */
		SumPairs test1 = new SumPairs();
		int[] input_1 = {5, 5, 15, 10};
		System.out.println("INPUT: " +  Arrays.toString(input_1));
		System.out.println("OUTPUT: " + test1.findSumPairs(input_1, 15).toString() + "\n");
		
		
		/**
		 * Test Case 2: Test case given by professor.
		 * Works as predicted
		 */
		SumPairs test2 = new SumPairs();
		int[] input_2 = {1, 2, 3, 4, 5, 6};
		System.out.println("INPUT: " +  Arrays.toString(input_2));
		System.out.println("OUTPUT: " + test2.findSumPairs(input_2, 6).toString() + "\n");
		
		
		/**
		 * Test Case 3: Custom test case where empty array is passed in.
		 * Works as predicted:
		 * Empty array is returned and the user is alerted that the input is empty.
		 */
		SumPairs test3 = new SumPairs();
		int[]  input_3= {};
		System.out.println("INPUT: " +  Arrays.toString(input_3));
		System.out.println("OUTPUT: " + test3.findSumPairs(input_3, 8).toString() + "\n");
		
		
		/**
		 * Test Case 4: Custom test case where no valid solution is given
		 * Works as predicted:
		 * Empty array is returned due to it being impossible to sum the values
		 * to the given target.
		 */
		SumPairs test4 = new SumPairs();
		int[] input_4 = {1, 2, 3};
		System.out.println("INPUT: " +  Arrays.toString(input_4));
		System.out.println("OUTPUT: " + test4.findSumPairs(input_4, 7).toString() + "\n");
		
		
		/**
		 * Test Case 5: Custom test case where all solutions are equal to the target.
		 * Works as predicted:
		 * All values in the input are returned due to all being valid solutions.
		 */
		SumPairs test5 = new SumPairs();
		int[] input_5 = {20, 20, 20};
		System.out.println("INPUT: " +  Arrays.toString(input_5));
		System.out.println("OUTPUT: " + test5.findSumPairs(input_5, 20).toString() + "\n");
	}

}
