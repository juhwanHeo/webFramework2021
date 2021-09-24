package com.week4.task.before2.structural.decorator;

public class CarDecorator implements Car {
	
	protected Car car;
	
	public CarDecorator(Car car) {
		this.car = car;
	}
	

	@Override
	public void assemble() {
		car.assemble();
	}

}
