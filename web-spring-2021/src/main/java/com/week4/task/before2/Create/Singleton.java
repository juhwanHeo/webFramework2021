package com.week4.task.before2.Create;


/*
 * 디자인 생성 패턴: 싱글톤 
 * https://coding-factory.tistory.com/709
*/
public class Singleton {
	
	private static Singleton instance;
	
	private Singleton() { }
	
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		
		return instance;
	}

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		
	}
	
}
