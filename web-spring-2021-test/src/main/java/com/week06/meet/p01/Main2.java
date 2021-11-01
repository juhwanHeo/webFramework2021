package com.week06.meet.p01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main2 {
	
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resource/spring/beans_week6_meet.xml");
		HaksaService haksa = (HaksaServiceImpl) context.getBean("haksa");
		haksa.print();
		haksa.printDetail();

	}
}
