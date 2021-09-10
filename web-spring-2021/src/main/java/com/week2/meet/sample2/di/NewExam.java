package com.week2.meet.sample2.di;

import java.util.Scanner;

public class NewExam implements Exam {
    // private 캡스락 기법
    private int kor;
    private int eng;

    @Override
    public int total() {
        return kor + eng;
    }

    @Override
    public float avg() {
        return total() / 2.0f;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 영어 점수를 입력하세요 >>");
        this.kor = sc.nextInt();
        this.eng = sc.nextInt();
        sc.close();
    }

    @Override
    public String toString() {
        return String.format("두 점수의 합은 %d 이고, 평균은 %.2f입니다.", total(), avg());
    }
}
