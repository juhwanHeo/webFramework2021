package com.week4.task.before;

import java.util.Scanner;

public class HaksaServiceImpl extends StudentVO implements HaksaService {

    @Override
    public double sum() {
    	return middleScore + finalScore;
    }

    @Override
    public double avg() {
        return sum() / 2;
    }

    @Override
    public char hak(double score) {
        char hak;
        if (score >= 90 && score <= 95) hak = 'A';
        else if (score >= 80 && score <= 85) hak = 'B';
        else if (score >= 70 && score <= 75) hak = 'C';
        else if (score >= 60 && score <= 65) hak = 'D';
        else hak = 'F';
        return hak;
    }

    @Override
    public String pass(char hak) {
        return hak <= 'B' ? "합격" : "불합격";
    }

    @Override
    public void print() {
    	double sum = sum();
    	double avg =avg();
    	char hak = hak(avg);
    	String pass = pass(hak);
    	
        System.out.println("이름 : " + name);
        System.out.println("중간성적 : " + String.format("%.2f", middleScore));
        System.out.println("기말성적 : " + String.format("%.2f", finalScore));
        System.out.println("총합 : " + String.format("%.2f", sum));
        System.out.println("평균 : " + String.format("%.2f", avg));
        System.out.println("학점 : " + hak);
        System.out.println("합격여부 : " + pass);

    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름과 중간성적, 기말 성적을 차례로 입력하세요 : ");

        name = sc.next();
        middleScore = sc.nextDouble();
        finalScore = sc.nextDouble();
        sc.close();
        
    }

}
