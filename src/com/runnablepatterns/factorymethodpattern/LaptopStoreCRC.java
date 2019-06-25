package com.runnablepatterns.factorymethodpattern;

import com.runnablepatterns.decoratorpattern.Laptop;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Class to handle CRC laptop creation 
 *
 */
public class LaptopStoreCRC extends LaptopStore {

	@Override
	protected Laptop createLaptop(LaptopTypeEnum laptopType) {
		// variable to store the laptop
		Laptop laptop = null;
		
		// depending on the type
		switch (laptopType) {
		case SMALL:
			laptop = new SmallLaptopAsus();
			break;
		case MEDIUM:
			laptop = new MediumLaptopAsus();
			break;
		case BIG:
			laptop = new BigLaptopAsus();
			break;
		default:
			break;
		}
		
		// return the specific instance
		return laptop;
	}

}
