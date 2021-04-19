package org.howard.edu.lsp.assignment7.tollbooth;

/**
 * 
 * Interface for the TollBooths
 * with appropriate behaviors 
 * 
 * @author Tyrone Smith
 *
 */
public interface TollBooth {
	public void calculateToll(Truck truckName);
	public void displayData();
	public void reset();
	public int getReceipts();
	public int getTrucks();
};
