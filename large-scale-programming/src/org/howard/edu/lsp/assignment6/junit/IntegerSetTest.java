package org.howard.edu.lsp.assignment6.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.howard.edu.lsp.assignment6.integerset.IntegerSet;
import org.howard.edu.lsp.assignment6.integerset.IntegerSetException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class IntegerSetTest {
	
	IntegerSet test_set1 = new IntegerSet();
	IntegerSet test_set2 = new IntegerSet();
    IntegerSet test_set3 = new IntegerSet();
	
	
	@Test
	@DisplayName("Test Case 1 for Add Method")
	public void testAddMethod1() {
		test_set1.add(6);
		
		assertFalse(test_set1.isEmpty());
	};
	
	@Test
	@DisplayName("Test Case 2 for Add Method with String instead of integer")
	public void testAddMethod2() {
		test_set1.add('s');
		
		assertFalse(test_set1.isEmpty());
	};
	
	
	@Test
	@DisplayName("Test Case 1 for Length Method")
	public void testLengthMethod1() {
		test_set1.add(1);
		test_set1.add(2);
		test_set1.add(3);

		
		int set1_length = test_set1.length();
		
		assertTrue(set1_length == 3);
	};
	
	@Test
	@DisplayName("Test Case 2 for Length Method with empty integerSet")
	public void testLengthMethod2() {

		int set1_length = test_set1.length();
		
		assertTrue(set1_length == 0);
	};
	
	
	
	@Test
	@DisplayName("Test Case 1 for Clear Method")
	public void testClearMethod1() {
		test_set1.add(1);
		test_set1.add(2);
		test_set1.add(3);
		test_set1.add(4);
		test_set1.add(5);
		test_set1.clear();
		
		assertTrue(test_set1.length() == 0);
	};
	
	@Test
	@DisplayName("Test Case 2 for Clear Method on an empty integerSet")
	public void testClearMethod2() {
		test_set1.clear();
		
		assertTrue(test_set1.length() == 0);
	};
	
	
	@Test
	@DisplayName("Test Case 1 for isEmpty Method")
	public void testEmptyMethod1() {
		test_set1.add(1);

		assertFalse(test_set1.isEmpty());
	};
	
	@Test
	@DisplayName("Test Case 2 for isEmpty Method on empty integerSet")
	public void testEmptyMethod2() {
		
		assertTrue(test_set1.isEmpty());
	};
	
	@Test
	@DisplayName("Test Case 3 for isEmpty Method after clearing integerSet")
	public void testEmptyMethod3() {
		test_set1.add(1);
		
		test_set1.clear();
		assertTrue(test_set1.isEmpty());
	};
	
	
	@Test
	@DisplayName("Test Case 1 for Equal Method on two equal integerSets")
	public void testEqualMethod1() {
		test_set1.add(1);
		test_set1.add(2);
		test_set1.add(3);
		test_set1.add(4);
		test_set1.add(5);
		
		test_set2.add(1);
		test_set2.add(2);
		test_set2.add(3);
		test_set2.add(4);
		test_set2.add(5);;
		
		assertTrue(test_set1.equals(test_set2));
	};
	
	@Test
	@DisplayName("Test Case 2 for Equal Method on two unequal integerSets")
	public void testEqualMethod2() {
		test_set1.add(1);
		test_set1.add(2);
		test_set1.add(3);
		test_set1.add(4);
		test_set1.add(5);
		
		test_set2.add(1);
		test_set2.add(2);
		test_set2.add(3);
		test_set2.add(4);
		
		assertFalse(test_set1.equals(test_set2));
	};
	
	@Test
	@DisplayName("Test Case 3 for Equal Method on two integerSets of unequal length")
	public void testEqualMethod3() {
		test_set1.add(1);
		test_set1.add(2);
		test_set1.add(3);
		test_set1.add(4);
		test_set1.add(4);
		
		test_set2.add(1);
		test_set2.add(2);
		test_set2.add(3);
		test_set2.add(4);
		
		assertTrue(test_set1.equals(test_set2));
	};
	
	
	@Test
	@DisplayName("Test Case 1 for Remove Method")
	public void testRemoveMethod1() {
		test_set1.add(1);
		test_set1.add(2);
		test_set1.add(3);
		test_set1.add(4);
		test_set1.add(5);
		
		test_set2.add(1);
		test_set2.add(2);
		test_set2.add(3);
		test_set2.add(4);
		test_set2.add(5);
		
		test_set2.remove(4);
		test_set2.remove(5);
		
		
		assertFalse(test_set1.equals(test_set2));
	};
	
	@Test
	@DisplayName("Test Case 2 for Remove Method with duplicates")
	public void testRemoveMethod2() {
		test_set1.add(1);
		test_set1.add(2);
		test_set1.add(3);
		
		test_set2.add(1);
		test_set2.add(2);
		test_set2.add(3);
		test_set2.add(4);
		test_set2.add(4);
		
		test_set2.remove(4);
		
		
		assertTrue(test_set1.equals(test_set2));
	};
	
	@Test
	@DisplayName("Test Case 3 for Remove Method using a number not in integerSet")
	public void testRemoveMethod3() {
		test_set1.add(1);
		test_set1.add(2);
		test_set1.add(3);
		
		test_set2.add(1);
		test_set2.add(2);
		test_set2.add(3);
		
		test_set2.remove(6);
		
		
		assertTrue(test_set1.equals(test_set2));
	};
	
	
	@Test
	@DisplayName("Test Case 1 for Contains Method using number in integerSet")
	public void testContainsMethod1() {
		test_set1.add(1);
		test_set1.add(2);
		test_set1.add(3);
		test_set1.add(4);
		test_set1.add(5);
		
		assertTrue(test_set1.contains(3));
	};
	
	@Test
	@DisplayName("Test Case 2 for Contains Method using number not in integerSet")
	public void testContainsMethod2() {
		test_set1.add(1);
		test_set1.add(2);
		test_set1.add(3);
		test_set1.add(4);
		test_set1.add(5);
		
		assertFalse(test_set1.contains(7));
	};
	
	
	@Test
	@DisplayName("Test Case 1 for Largest Method")
	public void testLargestMethod1() {
		test_set1.add(1);
		test_set1.add(2);
		test_set1.add(3);
		test_set1.add(4);
		test_set1.add(5);
		int largest_num = 0;
		
		try {
			largest_num = test_set1.largest();
		}
		catch (IntegerSetException e) {
			System.out.println(e.getMessage());
		}
		
		assertTrue(largest_num == 5);
	};
	
	@Test
	@DisplayName("Test Case 2 for Largest Method with equal numbers in integerSet")
	public void testLargestMethod2() {
		test_set1.add(1);
		test_set1.add(1);

		int largest_num = 0;
		
		try {
			largest_num = test_set1.largest();
		}
		catch (IntegerSetException e) {
			System.out.println(e.getMessage());
		}
		
		assertTrue(largest_num == 1);
	};
	
	@Test
	@DisplayName("Test Case 3 for Largest Method with negative numbers")
	public void testLargestMethod3() {
		test_set1.add(-1);
		test_set1.add(-6);

		int largest_num = 0;
		
		try {
			largest_num = test_set1.largest();
		}
		catch (IntegerSetException e) {
			System.out.println(e.getMessage());
		}

		assertTrue(largest_num == 0);
	};
	
	@Test
	@DisplayName("Test Case 4 for Largest Method on empty integerSet")
	public void testLargestMethod4() {
		int largest_num = 0;
		
		try {
			largest_num = test_set1.largest();
		}
		catch (IntegerSetException e) {
			System.out.println(e.getMessage());
		}
		
		assertTrue(largest_num == 0);
	};
	
	@Test
	@DisplayName("Test Case 1 for Smallest Method")
	public void testSmallestMethod1() {
		test_set1.add(1);
		test_set1.add(2);
		test_set1.add(3);
		test_set1.add(4);
		test_set1.add(5);
		int smallest_num = 0;
		
		try {
			smallest_num = test_set1.smallest();
		}
		catch (IntegerSetException e) {
			System.out.println(e.getMessage());
		}
		
		
		assertTrue(smallest_num == 1);
	};
	
	@Test
	@DisplayName("Test Case 2 for Smallest Method with equal numbers in integerSet")
	public void testSmallestMethod2() {
		test_set1.add(5);
		test_set1.add(5);
		int smallest_num = 0;
		
		try {
			smallest_num = test_set1.smallest();
		}
		catch (IntegerSetException e) {
			System.out.println(e.getMessage());
		}
		
		assertTrue(smallest_num == 5);
	};
	
	@Test
	@DisplayName("Test Case 3 for Smallest Method with negative numbers")
	public void testSmallestMethod3() {
		test_set1.add(-4);
		test_set1.add(-5);
		int smallest_num = 0;
		
		try {
			smallest_num = test_set1.smallest();
		}
		catch (IntegerSetException e) {
			System.out.println(e.getMessage());
		}
		
		assertTrue(smallest_num == -5);
	};
	
	
	@Test
	@DisplayName("Test Case 1 for Union Method")
	public void testUnionMethod1() {
		test_set1.add(9);
		test_set1.add(3);
		test_set1.add(5);
		test_set1.add(4);
		
		
		test_set2.add(9);
		test_set2.add(3);
		test_set2.add(12);
		test_set2.add(34);
		
		test_set1.union(test_set2);
		
		test_set3.add(9);
		test_set3.add(3);
		test_set3.add(5);
		test_set3.add(4);
		test_set3.add(12);
		test_set3.add(34);
		
		assertTrue(test_set1.equals(test_set3));
	};
	
	@Test
	@DisplayName("Test Case 2 for Union Method with two equal integerSets")
	public void testUnionMethod2() {
		test_set1.add(5);
		test_set1.add(4);
		
		test_set2.add(5);
		test_set2.add(4);
		
		test_set1.union(test_set2);
		
		test_set3.add(5);
		test_set3.add(4);

		assertTrue(test_set1.equals(test_set3));
	};
	
	@Test
	@DisplayName("Test Case 3 for Union Method with an empty and non-empty integerSet")
	public void testUnionMethod3() {
		test_set1.add(5);
		test_set1.add(4);
		
		test_set1.union(test_set2);
		
		test_set3.add(5);
		test_set3.add(4);

		assertTrue(test_set1.equals(test_set3));
	};
	
	
	
	@Test
	@DisplayName("Test Case 1 for Intersect Method")
	public void testIntersectMethod1() {
		test_set1.add(9);
		test_set1.add(3);
		test_set1.add(5);
		test_set1.add(4);
		
		
		test_set2.add(9);
		test_set2.add(3);
		test_set2.add(12);
		test_set2.add(34);
		
		test_set1.intersect(test_set2);
		
		test_set3.add(9);
		test_set3.add(3);
		
		assertTrue(test_set1.equals(test_set3));
	};
	
	@Test
	@DisplayName("Test Case 2 for Intersect Method between two integerSets with no intersection")
	public void testIntersectMethod2() {
		test_set1.add(5);
		test_set1.add(4);
		
		
		test_set2.add(12);
		test_set2.add(34);
		
		test_set1.intersect(test_set2);
		
		assertTrue(test_set1.equals(test_set3));
	};
	
	@Test
	@DisplayName("Test Case 1 for Difference Method")
	public void testDiffMethod1() {
		test_set1.add(9);
		test_set1.add(3);
		test_set1.add(5);
		test_set1.add(4);
		
		
		test_set2.add(9);
		test_set2.add(3);
		test_set2.add(12);
		test_set2.add(34);
		
		test_set1.diff(test_set2);
		
		test_set3.add(5);
		test_set3.add(4);
		
		assertTrue(test_set1.equals(test_set3));
	};
	
	@Test
	@DisplayName("Test Case 2 for Difference Method on integerSets with no common integers")
	public void testDiffMethod2() {
		test_set1.add(9);
		test_set1.add(3);
		test_set1.add(5);
		test_set1.add(4);
		
		
		test_set2.add(12);
		test_set2.add(34);
		
		test_set1.diff(test_set2);
		
		test_set3.add(9);
		test_set3.add(3);
		test_set3.add(5);
		test_set3.add(4);
		
		assertTrue(test_set1.equals(test_set3));
	};
	
	@Test
	@DisplayName("Test Case 1 for toString Method")
	public void testStringMethod1() {
		test_set1.add(9);
		test_set1.add(3);
		test_set1.add(5);
		test_set1.add(4);
		
		String str1 = test_set1.toString();
		String str2 = "[9, 3, 5, 4]";
		
		assertTrue(str1.equals(str2));
	};
	
	@Test
	@DisplayName("Test Case 2 for toString Method on empty integerSet")
	public void testStringMethod2() {
		
		String str1 = test_set1.toString();
		String str2 = "[]";
		
		assertTrue(str1.equals(str2));
	};
};
