package com.week5.task.p01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans_week5_task.xml");
		DriverInfo sportsDriver = (DriverInfo) context.getBean("sportsDriver");
		DriverInfo hwanDriver = (DriverInfo) context.getBean("hwanDriver");
		
		sportsDriver.show();
		hwanDriver.show();
		
	}
}
