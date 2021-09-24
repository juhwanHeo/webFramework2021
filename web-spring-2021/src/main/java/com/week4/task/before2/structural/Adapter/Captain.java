package com.week4.task.before2.structural.Adapter;

public class Captain implements RowingBoat{

	private RowingBoat rowingBoat;
	
	public Captain(RowingBoat rowingBoat) {
		this.rowingBoat = rowingBoat;
	}
	
	@Override
	public void row() {
		rowingBoat.row();
	}

}
