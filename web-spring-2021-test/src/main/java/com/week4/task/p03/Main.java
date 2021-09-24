package com.week4.task.p03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

		EnPrint ep = new EnPrint();
		ep.show();
		
		KrPrint kp = new KrPrint();
		kp.show();
		
		Name np = new Name("이만두");
		kp.setName(np);
		kp.show();
		
		np.setName("최말자");
		kp.setName(np);
		kp.show();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		KrPrint newp = (KrPrint) context.getBean("kp");
		newp.show();
		
	}
}
