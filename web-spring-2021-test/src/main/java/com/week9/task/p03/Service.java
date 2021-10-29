package com.week9.task.p03;

public class Service {
	
	@PrtAnnotation
	public void method1() {
		System.out.println("기본-기호를 10회 반복하여 출력합니다.");
	}
	
	@PrtAnnotation("*")
	public void method2() {
		System.out.println("입력된 기호를 10회 반복하여 출력합니다.");
	}
	
	@PrtAnnotation(value = "#", cnt = 20)
	public void method3() {
		System.out.println("입력된 기호와 횟수만큼 반복하여 출력합니다.");
	}

}
