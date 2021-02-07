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
		int target_1 = 15;
		System.out.println("INPUT: " +  Arrays.toString(input_1) + ", TARGET: " + target_1);
		System.out.println("OUTPUT: " + test1.findSumPairs(input_1, target_1).toString() + "\n");
		
		
		/**
		 * Test Case 2: Test case given by professor.
		 * Works as predicted
		 */
		SumPairs test2 = new SumPairs();
		int[] input_2 = {1, 2, 3, 4, 5, 6};
		int target_2 = 6;
		System.out.println("INPUT: " +  Arrays.toString(input_2) + ", TARGET: " + target_2);
		System.out.println("OUTPUT: " + test2.findSumPairs(input_2, target_2).toString() + "\n");
		
		
		/**
		 * Test Case 3: Custom test case where empty array is passed in.
		 * Works as predicted:
		 * Empty array is returned and the user is alerted that the input is empty.
		 */
		SumPairs test3 = new SumPairs();
		int[]  input_3= {};
		int target_3 = 8;
		System.out.println("INPUT: " +  Arrays.toString(input_3) + ", TARGET: " + target_3);
		System.out.println("OUTPUT: " + test3.findSumPairs(input_3, target_3).toString() + "\n");
		
		
		/**
		 * Test Case 4: Custom test case where no valid solution is given
		 * Works as predicted:
		 * Empty array is returned due to it being impossible to sum the values
		 * to the given target.
		 */
		SumPairs test4 = new SumPairs();
		int[] input_4 = {1, 2, 3};
		int target_4 = 7;
		System.out.println("INPUT: " +  Arrays.toString(input_4) + ", TARGET: " + target_4);
		System.out.println("OUTPUT: " + test4.findSumPairs(input_4, target_4).toString() + "\n");
		
		
		/**
		 * Test Case 5: Custom test case where all solutions are equal to the target.
		 * Works as predicted:
		 * All values in the input are returned due to all being valid solutions.
		 */
		SumPairs test5 = new SumPairs();
		int[] input_5 = {20, 20, 20};
		int target_5 = 20;
		System.out.println("INPUT: " +  Arrays.toString(input_5) + ", TARGET: " + target_5);
		System.out.println("OUTPUT: " + test5.findSumPairs(input_5, target_5).toString() + "\n");
		
		
		/**
		 * Test Case 6: Custom test case where negative values as passed into the input
		 * Works as predicted:
		 * Combinations of negative values that sum with positive to the target value are returned
		 */
		SumPairs test6 = new SumPairs();
		int[] input_6 = {-5, 15, -5, -5};
		int target_6 = 10;
		System.out.println("INPUT: " +  Arrays.toString(input_6) + ", TARGET: " + target_6);
		System.out.println("OUTPUT: " + test6.findSumPairs(input_6, target_6).toString() + "\n");
		
		
		/**
		 * Test Case 7: Custom test case where the target value is negative.
		 * Works as predicted:
		 * Due to algorithm used it does not work for negative target values
		 */
		SumPairs test7 = new SumPairs();
		int[] input_7 = {-8, -8, 8, 8, 9};
		int target_7 = -16;
		System.out.println("INPUT: " +  Arrays.toString(input_7) + ", TARGET: " + target_7);
		System.out.println("OUTPUT: " + test7.findSumPairs(input_7, target_7).toString() + "\n");
	}

}
