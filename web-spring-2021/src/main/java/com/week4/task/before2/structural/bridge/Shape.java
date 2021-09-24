package com.week4.task.before2.structural.bridge;

public abstract class Shape {
	protected Color color;
	
	public Shape(Color color) {
		this.color = color;
	}

	abstract public void applyColor();

}
