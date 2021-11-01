package com.week06.task.p01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resource/spring/beans_week6_task.xml");
		HaksaService haksa = (HaksaService) context.getBean("haksa");
		haksa.print();
		
	}
}
