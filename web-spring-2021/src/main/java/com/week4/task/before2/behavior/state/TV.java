package com.week4.task.before2.behavior.state;

public class TV {
	private PowerState powerState;
	
	public TV() {
		powerState = new Off();
	}

	public void powerButton() {
		powerState = powerState.PushButton();
	}
	
}
