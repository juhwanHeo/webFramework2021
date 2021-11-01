package com.week09.task.p03;

import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) {

		Method[] k = Service.class.getDeclaredMethods();
		
		for(Method m : k) {
			if (m.isAnnotationPresent(PrtAnnotation.class)) 
				System.out.println(m.getName() + "에 적용됨");
			
			else System.out.println(m.getName() + "에 적용되지 않음");
			
		}
	}

}
