package com.week3.meet;

import java.util.Scanner;

public class Task4 extends HaksaVO implements HaksaService {
	
	/*
	 * 인터페이스를 적용
	 * 객채 지향적 프로그래밍 구조
	 * 결합도를 낮추기 위해 인터페이스 사용
	*/
	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름, 중간시험 성적, 기말시험 성적 입력 >>");
		name = sc.next();
		middleScore = sc.nextInt();
		finalScore = sc.nextInt();
		sc.close();
	}
	
	@Override	
	public int sum() {
		sum = middleScore + finalScore;
		return sum;
	}
	
	@Override
	public double avg() {
		avg = (double) sum / 2;
		return avg;
	}
	
	@Override
	public void print() {
		System.out.println("이름: " + name);
		System.out.println("총점: " + sum);
		System.out.printf("평균 %.2f\n", avg);
	}
	
	public static void main(String[] args) {
		HaksaService service = new Task4();
		service.input();
		service.print();
		
	}
}
