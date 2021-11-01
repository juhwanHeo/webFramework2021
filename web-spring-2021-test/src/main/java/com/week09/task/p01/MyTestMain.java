package com.week09.task.p01;

import java.lang.reflect.Method;

public class MyTestMain {
	public static void main(String[] args) {
		MyTest h = new MyTest();
		
		try {
			Method m = h.getClass().getDeclaredMethod("myHi");
			
			if (m.isAnnotationPresent(AnnoTest.class)) {
				System.out.println("애노테이션이 적용되어 있어요...");
				h.myHi();
			} 
			else {
				System.out.println("애노테이션이 적용되지 않았어요...");
				h.myHi();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
