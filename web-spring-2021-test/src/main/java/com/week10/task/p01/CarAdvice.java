package com.week10.task.p01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class CarAdvice {
	public void beforeAdvice(JoinPoint jp) {
		System.out.println("[beforeAdvice]");
	}
	
	public void afterAdvice() {
		System.out.println("[afterAdvice]");
	}
	
	public Object aroundAdvice(ProceedingJoinPoint jp) throws Throwable{
		System.out.println("[aroundAdvice - before]");
		Object val = null;
		try {
			val = jp.proceed();
		} catch (Exception e) {
			System.out.println("[aroundAdvice - thorw]");
			e.printStackTrace();
		}

		System.out.println("[aroundAdvice - after]");
		return val;
	}
	
}
