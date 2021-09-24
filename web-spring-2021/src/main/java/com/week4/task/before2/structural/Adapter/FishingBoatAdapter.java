package com.week4.task.before2.structural.Adapter;

public class FishingBoatAdapter implements RowingBoat {

	private FishingBoat boat;
	
	public FishingBoatAdapter() {
		boat = new FishingBoat();
	}
	
	@Override
	public void row() {
		boat.sail();
	}

}
