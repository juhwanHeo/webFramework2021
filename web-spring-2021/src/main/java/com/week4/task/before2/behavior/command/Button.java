package com.week4.task.before2.behavior.command;

public class Button {
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void pressed() {
		command.execute();
	}

}
