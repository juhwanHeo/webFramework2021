package com.week09.task.p05;

import java.lang.reflect.Method;

import com.week09.task.p03.PrtAnnotation;
import com.week09.task.p03.Service;

public class Main {
	public static void main(String[] args) {

		Method[] k = Service.class.getDeclaredMethods();
		
		for(Method m : k) {
			if (m.isAnnotationPresent(PrtAnnotation.class)) {
				PrtAnnotation p = m.getAnnotation(PrtAnnotation.class);
				System.out.println("<" + m.getName() + ">");
				for (int i = 0; i < p.cnt(); i++) 
					System.out.print(p.value());				
				
				System.out.println();
			}
		}
	}

}
