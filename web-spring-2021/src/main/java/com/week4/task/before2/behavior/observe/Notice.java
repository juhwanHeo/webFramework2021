package com.week4.task.before2.behavior.observe;

import java.util.ArrayList;
import java.util.List;

public class Notice {
	private List<Observer> observers = new ArrayList<>();
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers(String msg) {
		for(Observer observer : observers) {
			observer.receive(msg);
		}
	}
	
}
