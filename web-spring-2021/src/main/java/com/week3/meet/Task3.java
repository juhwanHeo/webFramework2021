package com.week3.meet;

import java.util.Scanner;

public class Task3 extends HaksaVO {
	
	/*
	 * 객체 지향적 프로그래밍 구조
	 * extends - 지향적
	*/
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름, 중간시험 성적, 기말시험 성적 입력 >>");
		name = sc.next();
		middleScore = sc.nextInt();
		finalScore = sc.nextInt();
		sc.close();
	}
	
	public int sum() {
		sum = middleScore + finalScore;
		return sum;
	}
	
	public double avg() {
		avg = (double) sum / 2;
		return avg;
	}
	
	public void print() {
		System.out.println("이름: " + name);
		System.out.println("총점: " + sum());
		System.out.printf("평균: %.2f\n", avg());
	}
	
	public static void main(String[] args) {
		Task3 task3 = new Task3();
		task3.input();
		task3.print();
	}	
}
