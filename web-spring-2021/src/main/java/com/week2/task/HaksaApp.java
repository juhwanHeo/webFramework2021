package com.week2.task;

import java.util.Scanner;

public class HaksaApp {

    public static void main(String[] args) {
        StudentVO studentVO = new StudentVO();
        Scanner sc = new Scanner(System.in);

        System.out.print("이름과 중간성적, 기말 성적을 차례로 입력하세요 : ");
        String name = sc.next();
        double middleScore = sc.nextDouble();
        double finalScore = sc.nextDouble();
        sc.close();

        HaksaService service = new HaksaServiceImpl(name, middleScore, finalScore);
        double sum = service.getSum(middleScore, finalScore);
        double avg = service.getAvg(middleScore, finalScore);
        char hak = service.getHak(avg);
        String pass = service.getPass(hak);

//        studentVO.setName(name);
//        studentVO.setMiddleScore(middleScore);
//        studentVO.setFinalScore(finalScore);
        studentVO.setSum(sum);
        studentVO.setAvg(avg);
        studentVO.setHak(hak);
        studentVO.setPass(pass);
        System.out.println(service);

    }
}

// Heo 87.384 78.66