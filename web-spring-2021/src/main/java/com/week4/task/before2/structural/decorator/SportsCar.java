package com.week4.task.before2.structural.decorator;

public class SportsCar extends CarDecorator {

	public SportsCar(Car car) {
		super(car);
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.print("Adding featuers of Sports Car.");
	}

}
