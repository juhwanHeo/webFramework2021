package com.week04.task.p02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		/*
		 * HelloWorld hi = new HelloWorld();
		 * 
		 * hi.setMeassge("얀녕" ); System.out.println(hi.getMeassge());
		 */

		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resource/spring/beans.xml");
		HelloWorld h = (HelloWorld) context.getBean("hi");
		System.out.println(h.getMeassge());
		
	}
}
