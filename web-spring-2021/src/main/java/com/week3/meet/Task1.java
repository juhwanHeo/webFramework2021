package com.week3.meet;

import java.util.Scanner;

public class Task1 {

	/*
	 * 절자 지향적 프로그래밍 구조
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int middleScore;
		int finalScore;
		int sum;
		double avg;
		
		System.out.print("이름, 중간시험 성적, 기말시험 성적 입력 >>");
		name = sc.next();
		middleScore = sc.nextInt();
		finalScore = sc.nextInt();
		sc.close();
		
		sum = middleScore + finalScore;
		avg = (double) sum / 2;
		
		System.out.println("이름: " + name);
		System.out.println("총점: " + sum);
		System.out.printf("평균: %.2f\n", avg);
		// juhwan 70 90
	}
	
}
