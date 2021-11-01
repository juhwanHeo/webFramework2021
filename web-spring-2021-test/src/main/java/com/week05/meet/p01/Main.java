package com.week5.meet.p01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans_week5_meet.xml");
		HaksaService haksa = (HaksaService) context.getBean("haksa");
		haksa.print();
		
	}
}
