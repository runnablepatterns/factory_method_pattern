package com.runnablepatterns.factorymethodpattern;

import com.runnablepatterns.decoratorpattern.Laptop;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Small Laptop class to hold specific laptop details for USA
 *
 */
public class SmallLaptopDell extends Laptop {

	/**
	 * Get specific details
	 */
	public String getDescription() {
		System.out.println("[Log] getting small laptop description for USA");
		return "DELL Base Small Laptop USA";
	}
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 580;
	}

}
