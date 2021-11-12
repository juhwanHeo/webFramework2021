package com.week11.meet.p01;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

public class LoggingAdvice {
	
	public void beforeAdvice() {
		System.out.println("----------메소드를 실행전에 보임----------");
	}
	

	public void beforeAdvice2() {
		System.out.println("----------구매전에 확인해 주세요----------");
	}
	
	public void afterAdvice() {
		System.out.println("##########구매전에 확인해 주세요##########");
	}
	
	public void aroundAdvice(ProceedingJoinPoint jp) throws Throwable {
		Signature method = jp.getSignature();
		System.out.println("실행한 메소드 : " + method.getName());

		jp.proceed();
		
		if (method.getName().equals("buyKims")) {
			System.out.println("Kims 상품을 구입하셨군요~~");
		}
		else {
			System.out.println("Item 상품을 구입하셨군요~~");
		}
		
	}
	
}
