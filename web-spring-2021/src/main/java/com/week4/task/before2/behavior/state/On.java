package com.week4.task.before2.behavior.state;

public class On implements PowerState {

	@Override
	public PowerState PushButton() {
		System.out.println("Power Off");
		return new Off();
	}

}
