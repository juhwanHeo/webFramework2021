package com.week11.meet.p01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resource/spring/beans_week11_meet01.xml");
		ItemTarget itemTarget = (ItemTarget) context.getBean("itemTarget");
		itemTarget.selectItem();
		itemTarget.buyItem();
		itemTarget.buyItems();
		
		KimsTarget kimsTarget = (KimsTarget) context.getBean("kimsTarget");
		kimsTarget.buyKims();
		
	}
}
