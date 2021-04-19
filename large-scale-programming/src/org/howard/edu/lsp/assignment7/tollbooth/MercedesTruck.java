package org.howard.edu.lsp.assignment7.tollbooth;

/**
 * 
 * This class implements the Truck interface
 * and the appropriate methods
 * 
 * @author Tyrone Smith
 *
 */
public class MercedesTruck implements Truck{
	
	/**
	 * Variables to keep track of the number of axels
	 * and the total weight for each truck
	 * 
	 */
	public final int axels;
	public final int totalWeight;
	
	/**
	 * 
	 * Constructor method for the MercedesTruck class
	 * stores the number of axels and total weight as attributes
	 * 
	 * @param axels
	 * @param totalWeight
	 */
	public MercedesTruck(int axels, int totalWeight) {
		this.axels = axels;
		this.totalWeight = totalWeight;
	}
	
	/**
	 * 
	 * Getter method that returns the number of axels each truck has 
	 */
	public int getAxelAmount() {
		return this.axels;
	};
	
	/**
	 * 
	 * Getter method that returns the total of each truck
	 */
	public int getTotalWeight() {
		return this.totalWeight;
	};
};
