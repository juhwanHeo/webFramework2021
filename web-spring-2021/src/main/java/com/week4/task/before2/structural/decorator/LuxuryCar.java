package com.week4.task.before2.structural.decorator;

public class LuxuryCar extends CarDecorator {

	public LuxuryCar(Car car) {
		super(car);
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.print("Adding featuers of Luxury Car.");
	}

}
