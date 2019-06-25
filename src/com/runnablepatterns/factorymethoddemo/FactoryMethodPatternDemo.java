package com.runnablepatterns.factorymethoddemo;

import com.runnablepatterns.factorymethodpattern.LaptopStore;
import com.runnablepatterns.factorymethodpattern.LaptopStoreCRC;
import com.runnablepatterns.factorymethodpattern.LaptopStoreUSA;
import com.runnablepatterns.factorymethodpattern.LaptopTypeEnum;

public class FactoryMethodPatternDemo {

	public static void main(String[] args) {
		// create specific store
		LaptopStore crcStore = new LaptopStoreCRC();
		
		System.out.println("Processing laptop in CRC started \n");

		// process the specific Laptop
		crcStore.processLaptop(LaptopTypeEnum.MEDIUM);
		
		// create specific store
		LaptopStore usaStore = new LaptopStoreUSA();
		
		System.out.println("Processing laptop in USA started \n");
		// process the specific Laptop
		usaStore.processLaptop(LaptopTypeEnum.MEDIUM);
		
	}

}
