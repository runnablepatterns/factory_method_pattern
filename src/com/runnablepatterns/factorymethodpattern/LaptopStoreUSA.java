package com.runnablepatterns.factorymethodpattern;

import com.runnablepatterns.decoratorpattern.Laptop;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Class to handle USA laptop creation 
 *
 */
public class LaptopStoreUSA extends LaptopStore {

	@Override
	protected Laptop createLaptop(LaptopTypeEnum laptopType) {
		// variable to store the laptop
		Laptop laptop = null;
		
		// depending on the type
		switch (laptopType) {
		case SMALL:
			laptop = new SmallLaptopDell();
			break;
		case MEDIUM:
			laptop = new MediumLaptopDell();
			break;
		case BIG:
			laptop = new BigLaptopDell();
			break;
		default:
			break;
		}
		
		// return the specific instance
		return laptop;
	}

}
