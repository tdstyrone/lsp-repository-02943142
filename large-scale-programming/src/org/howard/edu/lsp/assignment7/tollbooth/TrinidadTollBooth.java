package org.howard.edu.lsp.assignment7.tollbooth;

/**
 * 
 * This class implements the TollBooth interface
 * and the methods specified by the interface
 * 
 * @author Tyrone Smith
 *
 */
public class TrinidadTollBooth implements TollBooth{
	
	/**
	 * variables to keep track of 
	 * the total number of trucks that have gone through the toll booth
	 * and the total receipts since collection
	 * 
	 */
	int totalTrucks = 0;
	int totalReceipts = 0;
	
	
	/**
	 * 
	 * Method takes in object of type Truck
	 * and calculates the total receipts
	 * and increments the number of trucks by 1
	 * 
	 */
	public void calculateToll(Truck truckName) {
		int axels = truckName.getAxelAmount();
		int weight = truckName.getTotalWeight();
		totalReceipts += ((axels * 5) + ((weight/500) * 10));
		
		totalTrucks += 1;
	};
	
	
	/**
	 * 
	 * Method to display the booth's totals to the screen
	 */
	public void displayData() {
		System.out.println("*** Collecting Receipts ***");
		System.out.println("Totals since the last collection - Receipts: $" + totalReceipts + " Trucks: " + totalTrucks);
		
	};
	
	
	/**
	 * Method to reset the totals to zero
	 */
	public void reset() {
		this.displayData();
		totalTrucks = 0;
		totalReceipts = 0;
	};
	
	/**
	 * Method to return the total number of receipts
	 */
	public int getReceipts() {
		return totalReceipts;
	};
	
	
	/**
	 * Method to return the total number of trucks
	 */
	public int getTrucks() {
		return totalTrucks;
	};
};
