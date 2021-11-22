package com.spring.mvc.task13;

public class TestModel {
	private String title;

	public TestModel(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "TestModel [title=" + title + "]";
	}
}
