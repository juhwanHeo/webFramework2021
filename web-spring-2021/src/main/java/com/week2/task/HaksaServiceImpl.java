package com.week2.task;

public class HaksaServiceImpl extends StudentVO implements HaksaService {

    public HaksaServiceImpl(String name, double middleScore, double finalScore) {
        super(name, middleScore, finalScore);
    }

    @Override
    public double getSum(double middleScore, double finalScore) {
        super.setSum(middleScore + finalScore);
        return middleScore + finalScore;
    }

    @Override
    public double getAvg(double middleScore, double finalScore) {
        double avg = getSum(middleScore, finalScore) / 2;
        super.setAvg(avg);
        return avg;
    }

    @Override
    public char getHak(double score) {
        char hak;

        if (score >= 90 && score <= 95) hak = 'A';
        else if (score >= 80 && score <= 85) hak = 'B';
        else if (score >= 70 && score <= 75) hak = 'C';
        else if (score >= 60 && score <= 65) hak = 'D';
        else hak = 'F';

        super.setHak(hak);
        return hak;
    }

    @Override
    public String getPass(char hak) {
        String pass = hak <= 'B' ? "합격" : "불합격";
        super.setPass(pass);
        return pass;
    }
}
