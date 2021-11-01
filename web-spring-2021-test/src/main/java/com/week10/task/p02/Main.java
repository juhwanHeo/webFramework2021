package com.week10.task.p02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resource/spring/beans_week10_task02.xml");
		Driver sportsDriver = (Driver) context.getBean("sportsDriver");
		
		sportsDriver.show(); 
	}
}
