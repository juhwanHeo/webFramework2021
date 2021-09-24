package com.week4.task.before2.structural.decorator;
/*
 * 디자인 구조 패턴: 데코레이터
 * https://readystory.tistory.com/195
*/
public class DecoratorTest {
	public static void main(String[] args) {
		Car sportsCar = new SportsCar(new BasicCar());
		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		
		sportsCar.assemble();
		System.out.println("\n");
		sportsLuxuryCar.assemble();
	}

}
