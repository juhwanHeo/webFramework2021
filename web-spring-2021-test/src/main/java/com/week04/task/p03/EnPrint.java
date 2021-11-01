package com.week04.task.p03;

public class EnPrint implements Print {
	private Name name;
	
	public EnPrint() {
		this.name = new Name();
	}
	
	@Override
	public void show() {
		System.out.println(this.getClass().getSimpleName() + " : " + name.getName());
	}

}
