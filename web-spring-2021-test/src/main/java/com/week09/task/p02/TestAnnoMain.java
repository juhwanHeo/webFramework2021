package com.week9.task.p02;

import java.lang.annotation.Annotation;

// @Deprecated
// @SuppressWarnings("unchecked")
@TestInfo(cnt = 3, str = "Park", tStr= {"kim", "Lee", "Park"})
public class TestAnnoMain {
	public static void main(String[] args) {
		Class<TestAnnoMain> k = TestAnnoMain.class;

		TestInfo anno = k.getAnnotation(TestInfo.class);
		
		System.out.println("cnt = " + anno.cnt());
		System.out.println("str = " + anno.str());
		
		for (String str : anno.tStr()) 
			System.out.println(str);
		
		System.out.println("--------------------------------");
		
		Annotation[] arr = k.getAnnotations();
		
		for (Annotation a : arr) 
			System.out.println(a);
		
	}

}
