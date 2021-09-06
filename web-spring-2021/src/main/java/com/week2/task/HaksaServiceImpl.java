package com.week2.task;

public class HaksaServiceImpl implements HaksaService {

    @Override
    public double getSum(double middleScore, double finalScore) {
        return middleScore + finalScore;
    }

    @Override
    public double getAvg(double middleScore, double finalScore) {
        return getSum(middleScore, finalScore) / 2;
    }

    @Override
    public char getHak(double score) {
        char hak;

        if (score >= 90 && score <= 95) hak = 'A';
        else if (score >= 80 && score <= 85) hak = 'B';
        else if (score >= 70 && score <= 75) hak = 'C';
        else if (score >= 60 && score <= 65) hak = 'D';
        else hak = 'F';

        return hak;
    }

    @Override
    public String getPass(char hak) {
        return hak <= 'B' ? "합격" : "불합격";
    }
}
