package com.week3.meet;

import java.util.Scanner;

public class Task2 {

	/*
	 * 객채적 프로그래밍 구조
	 * 생성자 default
	 * 메소드 4개 - 입력, 
	*/
	private String name;
	private int middleScore;
	private int finalScore;
	private int sum;
	private double avg;
	
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
		Task2 task2 = new Task2();
		task2.input();
		task2.print();
	}
}
