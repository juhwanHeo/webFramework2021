package com.week2.task;

import java.text.DecimalFormat;

public class StudentVO {
    private final DecimalFormat decimalFormat;
    private String name;
    private double middleScore;
    private double finalScore;
    private double sum;
    private double avg;
    private char hak;
    private String pass;


    public StudentVO() {
        decimalFormat = new DecimalFormat();
        decimalFormat.setMaximumFractionDigits(2);
    }

    public String getName() {
        return name;
    }

    public double getMiddleScore() {
        return Double.parseDouble(decimalFormat.format(middleScore));
    }

    public double getFinalScore() {
        return Double.parseDouble(decimalFormat.format(finalScore));
    }

    public double getSum() {
        return Double.parseDouble(decimalFormat.format(sum));
    }

    public double getAvg() {
        return Double.parseDouble(decimalFormat.format(avg));
    }

    public char getHak() {
        return hak;
    }

    public String getPass() {
        return pass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMiddleScore(double middleScore) {
        this.middleScore = middleScore;
    }

    public void setFinalScore(double finalScore) {
        this.finalScore = finalScore;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public void setHak(char hak) {
        this.hak = hak;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return  "이름 : " + name +
                "\n중간성적 : " + getMiddleScore() +
                "\n기말성적 : " + getFinalScore() +
                "\n총합 : " + getSum() +
                "\n평균 : " + getAvg() +
                "\n학점 : " + hak +
                "\n합격여부 : " + pass;
    }
}
