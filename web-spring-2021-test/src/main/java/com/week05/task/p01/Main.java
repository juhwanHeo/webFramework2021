package com.week05.task.p01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resource/spring/beans_week5_task.xml");
		DriverInfo sportsDriver = (DriverInfo) context.getBean("sportsDriver");
		DriverInfo hwanDriver = (DriverInfo) context.getBean("hwanDriver");
		
		sportsDriver.show();
		hwanDriver.show();
		
	}
}
