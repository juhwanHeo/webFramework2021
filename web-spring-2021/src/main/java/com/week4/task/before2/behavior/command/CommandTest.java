package com.week4.task.before2.behavior.command;

public class CommandTest {
	public static void main(String[] args) {
		Lamp lamp = new Lamp();
		
		Command lampOnCommand = new LampOnCommand(lamp);
		Command lampOffCommand = new LampOffCommand(lamp);
		
		Button btn = new Button();
		btn.setCommand(lampOnCommand);
		btn.pressed();
		
		btn.setCommand(lampOffCommand);
		btn.pressed();
	}
}
