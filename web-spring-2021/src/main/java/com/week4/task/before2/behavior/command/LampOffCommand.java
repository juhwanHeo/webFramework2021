package com.week4.task.before2.behavior.command;

public class LampOffCommand implements Command {
	private Lamp lamp;
	
	public LampOffCommand(Lamp lamp) {
		this.lamp = lamp;
	}
	
	@Override
	public void execute() {
		lamp.lampOff();
	}

}
