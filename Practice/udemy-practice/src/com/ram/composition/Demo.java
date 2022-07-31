package com.ram.composition;

public class Demo {

	public static void main(String[] args) 
	{
//		Laptop lappy = new Laptop();
//		System.out.println(lappy);
		
		Processor processor = new Processor("intel", "7200u", 11, 3, 4, "6MB", "2.5Ghz", "2,5Ghz", "3.1Ghz");
		
		GraphicsCard graphicsCard = new GraphicsCard("Dell", 1050, "4GB");
		
		Laptop gamingLaptop = new Laptop(17f, processor, "DDR4", "2TB", graphicsCard, null, "backlit");
		
		System.out.println(gamingLaptop);
		
		gamingLaptop.gamingMode();
		System.out.println("gaming mode on");
		
		System.out.println("current frequency : "+gamingLaptop.getProcessor().getMaxFrequency());
	}

}
