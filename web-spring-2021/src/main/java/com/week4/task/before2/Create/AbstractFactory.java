package com.week4.task.before2.Create;

/*
 * 디자인 생성 패턴: 추상 팩토리
 * https://bamdule.tistory.com/161
*/
interface Factory {
	void print();
}

class FactoryA implements Factory {

	@Override
	public void print() {
		System.out.println("print A");
	}
	
}

class FactoryB implements Factory {
	
	@Override
	public void print() {
		System.out.println("print B");
	}
}

class FactoryC implements Factory {
	
	@Override
	public void print() {
		System.out.println("print C");
	}
}

public class AbstractFactory {
	static Factory create(String str) {
		switch (str) {
		case "A":
			return new FactoryA();
		case "B":
			return new FactoryB();
		case "C":
			return new FactoryC();
		default:
			throw new IllegalArgumentException();
		}
	}
	
	public static void main(String[] args) {
		Factory factoryA = create("A");
		factoryA.print();
		Factory factoryB = create("B");
		factoryB.print();
		Factory factoryC = create("C");
		factoryC.print();
		
	}
}
