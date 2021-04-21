package org.howard.edu.lsp.exam.question41;

import java.util.ArrayList;

public class RemoveZeroesSolution {
	
	public static ArrayList<Integer> removeZeroes(ArrayList<Integer> intArr){
		ArrayList<Integer> outputArr = new ArrayList<Integer>();
		
		for (int i = 0 ; i < intArr.size(); i++) {
			if (intArr.get(i) != 0) {
				outputArr.add(intArr.get(i));
			}
		}
		return outputArr;
	};
};
