package org.howard.edu.lsp.exam.question41;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RemoveZeroesTest {
	
	ArrayList<Integer> inputArr = new ArrayList<Integer>();
	
	@Test
	@DisplayName("Test Case Sample from paper")
	public void testRemoveZeroes1() {
		inputArr.add(0);
		inputArr.add(7);
		inputArr.add(2);
		inputArr.add(0);
		inputArr.add(0);
		inputArr.add(4);
		inputArr.add(0);
		
		inputArr = RemoveZeroesSolution.removeZeroes(inputArr);
		System.out.println(inputArr.toString());
		
		assertFalse(inputArr.contains(0));
	};
	
	
	@Test
	@DisplayName("Test Case removeZeroes method on ArrayList with 1 zero")
	public void testRemoveZeroes2() {
		inputArr.add(3);
		inputArr.add(8);
		inputArr.add(0);
	
		
		inputArr = RemoveZeroesSolution.removeZeroes(inputArr);
		System.out.println(inputArr.toString());
		
		assertFalse(inputArr.contains(0));
	};
	
	@Test
	@DisplayName("Test Case removeZeroes method on ArrayList with no zeros")
	public void testRemoveZeroes3() {
		inputArr.add(1);
		inputArr.add(7);
		inputArr.add(9);
	
		
		inputArr = RemoveZeroesSolution.removeZeroes(inputArr);
		System.out.println(inputArr.toString());
		
		assertFalse(inputArr.contains(0));
	};
}
