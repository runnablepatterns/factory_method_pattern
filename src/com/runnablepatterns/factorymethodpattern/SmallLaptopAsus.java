package com.runnablepatterns.factorymethodpattern;

import com.runnablepatterns.decoratorpattern.Laptop;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Small Laptop class to hold specific laptop details for CRC
 *
 */
public class SmallLaptopAsus extends Laptop {

	/**
	 * Get specific details
	 */
	public String getDescription() {
		System.out.println("[Log] getting small laptop description for CRC");
		return "ASUS Base Small Laptop CRC";
	}
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 550;
	}

}
