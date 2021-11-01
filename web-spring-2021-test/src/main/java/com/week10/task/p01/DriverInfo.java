package com.week10.task.p01;

public class DriverInfo implements Driver {
	private String name;
	private Car car;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Car getCar() {
		return car;
	}
	
	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public void show() {
		System.out.println(name + " drives " + car.getColor() + " " + car.getType() + "Car");
	}
	
}
