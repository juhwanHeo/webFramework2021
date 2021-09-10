package com.week2.task;

import java.util.Scanner;

/*
* 교수님이 원하는 방향을 모르겠다.
* 질문 필요
* 21.09.06에 코드 제출
*/
public class HaksaServiceImpl implements HaksaService {

    @Override
    public double sum(StudentVO studentVO) {
        return studentVO.getMiddleScore() + studentVO.getFinalScore();
    }

    @Override
    public double avg(StudentVO studentVO) {
        return sum(studentVO) / 2;
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
//        System.out.println("이름 : " + name);
//        System.out.println("중간성적 : " + String.format("%.2f", middleScore));
//        System.out.println("기말성적 : " + String.format("%.2f", finalScore));
//        System.out.println("총합 : " + String.format("%.2f", sum()));
//        System.out.println("평균 : " + String.format("%.2f", avg()));
//        System.out.println("학점 : " + hak());
//        System.out.println("합격여부 : " + pass());

    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름과 중간성적, 기말 성적을 차례로 입력하세요 : ");

        String name = sc.next();
        double middleScore = sc.nextDouble();
        double finalScore = sc.nextDouble();
        sc.close();

        HaksaVO vo = new HaksaVO(name, middleScore, finalScore);
        sum(vo);
    }

}
