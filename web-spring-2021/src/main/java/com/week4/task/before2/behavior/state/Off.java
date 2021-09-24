package com.week4.task.before2.behavior.state;

public class Off implements PowerState {

	@Override
	public PowerState PushButton() {
		System.out.println("Power On");
		return new On();
	}

}
