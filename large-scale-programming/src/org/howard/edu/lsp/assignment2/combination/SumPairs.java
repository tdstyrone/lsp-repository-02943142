package org.howard.edu.lsp.assignment2.combination;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * 
 * This class implements a number of methods 
 * to solve the given problem.
 * 
 * @author Tyrone Smith
 *
 */

public class SumPairs {
	
	
	/**
	 * Variable used to store the result of the solutions.
	 * Can be accessed from all methods.
	 */
	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	
	
	
	/**
	 * 
	 * This findSumPairs method serves as the main method
	 * for the program. It checks whether the given input is empty,
	 * calls the other methods, sorts the input array in ascending order
	 * and returns the result.
	 * 
	 * @param input - integer array of values to sum to target
	 * @param target_sum - integer used as target value 
	 * @return - 2-Dimensional array of valid combinations (the solution)
	 */
	public ArrayList<ArrayList<Integer>> findSumPairs(int[] input, int target_sum) {
		if(input.length == 0) 
			System.out.println("Empty array was passed in");
		
		HashMap<Integer, ArrayList<Integer>> indexes = findIndexes(input);
		Arrays.sort(input);
		findCombinations(input, target_sum, 0, new ArrayList<Integer>());
		findResult(indexes);
		return result;
	}
	
	
	
	/**
	 * This findIndexes method is used to create a HashMap 
	 * where the keys are the integers in the input array and
	 * the values are arrays of the indexes at which every occurrence 
	 * of the integer is in the original input array.
	 * 
	 * @param input - integer array of values to sum to target
	 * @return - HashMap of integer, array pairs
	 */
	public HashMap<Integer, ArrayList<Integer>> findIndexes(int[] input){
		HashMap<Integer, ArrayList<Integer>> indexes = new HashMap<>();
		
		for(int i = 0; i < input.length; i++) {
			if (indexes.get(input[i]) != null) {
				ArrayList<Integer> current_arr  = indexes.get(input[i]);
				current_arr.add(i);
				indexes.put(input[i], current_arr);
			} else {
				ArrayList<Integer> starter_arr  = new ArrayList<>();
				starter_arr.add(i);
				indexes.put(input[i], starter_arr);
			}
		}
		return indexes;
	}
	
	
	/**
	 * This findCombinations method is used to compute the various
	 * combinations in the array that sum to the target value.
	 * It makes use of recursion and backtracking.
	 * 
	 * @param input - integer array of values to sum to target
	 * @param target_sum - integer used as target value 
	 * @param index - integer to represent current index in the array
	 * @param curr - integer array to store current combination of integer being evaluated
	 */
	public void findCombinations(int[] input, int target_sum, int index, ArrayList<Integer> curr) {
		if (target_sum == 0) {
			result.add(new ArrayList<Integer>(curr));
			return;
		}
		
	    for(int i = index; i < input.length; i++){
	        if(target_sum > 0){
	            curr.add(input[i]);
	            findCombinations(input, target_sum - input[i],i+1,curr);
	            curr.remove(curr.size()-1);
		    }
		}
	}
	
	/**
	 * This findResult method is used to replace the 
	 * integers in the 2-dimensional result array with their 
	 * corresponding index position from the original input array
	 * 
	 * @param indexes - HashMap of integer, array pairs generated from findIndexes method
	 */
	public void findResult(HashMap<Integer, ArrayList<Integer>> indexes) {
		for (int i = 0; i < result.size(); i++){
			for (int j = 0; j < result.get(i).size(); j++) {
				int num = result.get(i).get(j);
				result.get(i).set(j, indexes.get(num).get(0));
				if (indexes.get(num).size() != 1) {
					indexes.get(num).remove(0);
				}
			}
		}
	}
}
