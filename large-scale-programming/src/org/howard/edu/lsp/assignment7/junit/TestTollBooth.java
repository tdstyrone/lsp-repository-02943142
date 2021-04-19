package org.howard.edu.lsp.assignment7.junit;


import static org.junit.jupiter.api.Assertions.*;
import org.howard.edu.lsp.assignment7.tollbooth.Truck;
import org.howard.edu.lsp.assignment7.tollbooth.MackTruck;
import org.howard.edu.lsp.assignment7.tollbooth.MercedesTruck;
import org.howard.edu.lsp.assignment7.tollbooth.TollBooth;
import org.howard.edu.lsp.assignment7.tollbooth.TrinidadTollBooth;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



public class TestTollBooth {
	TollBooth booth1 = new TrinidadTollBooth();
	
	Truck mercedes1 = new MercedesTruck(5, 12000);
	Truck mack1 = new MackTruck(2, 5000);
	
	@Test
	@DisplayName("Test Case with 0 trucks")
	public void testNoTrucks() {
		 int receipts = booth1.getReceipts();
		 int trucks = booth1.getTrucks();
		 
		 assertTrue(receipts == 0 && trucks == 0);
	};
	
	@Test
	@DisplayName("Test Case 1 for calcualteToll Method with 1 truck")
	public void testCalculateToll1() {
		 booth1.calculateToll(mercedes1);
		 
		 int receipts = booth1.getReceipts();
		 int trucks = booth1.getTrucks();
		 
		 assertTrue(receipts == 265 && trucks == 1);
	};
	
	
	@Test
	@DisplayName("Test Case 2 for calcualteToll Method with 2 trucks")
	public void testCalculateToll2() {
		 booth1.calculateToll(mercedes1);
		 booth1.calculateToll(mack1);
		 
		 int receipts = booth1.getReceipts();
		 int trucks = booth1.getTrucks();
		 
		 assertTrue(receipts == 375 && trucks == 2);
	};
	
	
	@Test
	@DisplayName("Test Case 1 for reset Method after 1 truck")
	public void testReset1() {
		 booth1.calculateToll(mercedes1);
		 booth1.reset();
		 
		 int receipts = booth1.getReceipts();
		 int trucks = booth1.getTrucks();
		 
		 assertTrue(receipts == 0 && trucks == 0);
	};
	
	@Test
	@DisplayName("Test Case 2 for reset Method with no trucks")
	public void testReset2() {
		 booth1.reset();
		 
		 int receipts = booth1.getReceipts();
		 int trucks = booth1.getTrucks();
		 
		 assertTrue(receipts == 0 && trucks == 0);
	};
	
	@Test
	@DisplayName("Test Case 3 for reset Method - add truck after reseting")
	public void testReset3() {
		 booth1.calculateToll(mercedes1);
		 booth1.reset();
		 booth1.calculateToll(mack1);
		 
		 int receipts = booth1.getReceipts();
		 int trucks = booth1.getTrucks();
		 
		 assertTrue(receipts == 110 && trucks == 1);
	};
	
};
