package com.week10.task.p02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class CarAdvice {
	
	@Before(value = "execution(public * com.week10.task.p02..*.show(..))")
	public void beforeAdvice(JoinPoint jp) {
		System.out.println("[beforeAdvice] " + jp.getSignature());
	}
	
	
	@After(value = "execution(public * com.week10.task.p02..*.show(..))")
	public void afterAdvice() {
		System.out.println("[afterAdvice]");
	}
	
	@Around(value = "execution(public * com.week10.task.p02..*.show(..))")
	public Object aroundAdvice(ProceedingJoinPoint jp) throws Throwable{
		System.out.println("[aroundAdvice - before]");
		Object val = null;
		try {
			val = jp.proceed();
			System.out.println("[aroundAdvice] " + jp.toLongString());
		} catch (Exception e) {
			System.out.println("[aroundAdvice - thorw]");
			e.printStackTrace();
		}

		System.out.println("[aroundAdvice - after]");
		return val;
	}
	
}
