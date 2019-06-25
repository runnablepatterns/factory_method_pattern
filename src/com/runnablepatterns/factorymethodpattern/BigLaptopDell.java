package com.runnablepatterns.factorymethodpattern;

import com.runnablepatterns.decoratorpattern.Laptop;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Big Laptop class to hold specific laptop details for USA
 *
 */
public class BigLaptopDell extends Laptop {
	
	/**
	 * Get specific details
	 */
	public String getDescription() {
		System.out.println("[Log] getting big laptop description for USA");
		return "DELL Base Big Laptop USA";
	}
	
	@Override
	public double getPrice() {
		// set the price
		return 980;
	}

}
