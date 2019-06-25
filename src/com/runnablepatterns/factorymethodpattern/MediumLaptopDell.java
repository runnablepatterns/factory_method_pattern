package com.runnablepatterns.factorymethodpattern;

import com.runnablepatterns.decoratorpattern.Laptop;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Medium Laptop class to hold specific laptop details for USA
 *
 */
public class MediumLaptopDell extends Laptop {

	/**
	 * Get specific details
	 */
	public String getDescription() {
		System.out.println("[Log] getting medium laptop description for USA");
		return "DELL Base Big Laptop USA";
	}
	
	@Override
	public double getPrice() {
		// set the price
		return 800;
	}

}
