package com.week4.task.before2.behavior.command;

public class LampOnCommand implements Command {
	private Lamp lamp;
	
	
	public LampOnCommand(Lamp lamp) {
		this.lamp = lamp;
	}
	
	@Override
	public void execute() {
		lamp.lampOn();
	}

}
