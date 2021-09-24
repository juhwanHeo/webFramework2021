package com.week4.task.before2.structural.bridge;

/*
 * 디자인 구조 패턴: 브릿지
 * https://readystory.tistory.com/194
 * https://lee1535.tistory.com/102
*/
public class BridgeTest {
	
	public static void main(String[] args) {
		Shape tri = new Triangle(new RedColor());
		Shape pert = new Pentagon(new GreenColor());
		tri.applyColor();
		pert.applyColor();
	}
}
