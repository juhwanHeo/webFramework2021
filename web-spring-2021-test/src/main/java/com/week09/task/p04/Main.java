package com.week9.task.p04;

import java.lang.reflect.Method;

import com.week9.task.p03.PrtAnnotation;
import com.week9.task.p03.Service;

public class Main {
	public static void main(String[] args) {

		Method[] k = Service.class.getDeclaredMethods();
		
		for(Method m : k) {
			if (m.isAnnotationPresent(PrtAnnotation.class)) {
				PrtAnnotation p = m.getAnnotation(PrtAnnotation.class);
				
				System.out.println("value = " + p.value());
				System.out.println("cnt = " + p.cnt());
			}
		}
	}

}
