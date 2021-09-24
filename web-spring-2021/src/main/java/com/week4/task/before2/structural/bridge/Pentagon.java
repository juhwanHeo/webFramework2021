package com.week4.task.before2.structural.bridge;

public class Pentagon extends Shape{

	public Pentagon(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyColor() {
		System.out.print("Pentagon filled with color ");
		color.applyColor();
	}
	
}
