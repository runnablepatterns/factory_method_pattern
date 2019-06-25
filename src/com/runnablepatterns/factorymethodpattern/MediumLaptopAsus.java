package com.runnablepatterns.factorymethodpattern;

import com.runnablepatterns.decoratorpattern.Laptop;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Medium Laptop class to hold specific laptop details for CRC
 *
 */
public class MediumLaptopAsus extends Laptop {

	/**
	 * Get specific details
	 */
	public String getDescription() {
		System.out.println("[Log] getting medium laptop description for CRC");
		return "ASUS Base Big Laptop CRC";
	}
	
	@Override
	public double getPrice() {
		// set the price
		return 760;
	}

}
