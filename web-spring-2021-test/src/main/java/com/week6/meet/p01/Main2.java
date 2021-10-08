package com.week6.meet.p01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans_week6_meet.xml");
		HaksaService haksa = (HaksaServiceImpl) context.getBean("haksa");
		haksa.print();
		haksa.printDetail();

	}
}
