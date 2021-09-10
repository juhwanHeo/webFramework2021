package com.week2.task;

public class HaksaVO extends StudentVO {
    private double sum;
    private double avg;
    private char hak;
    private String pass;

    public HaksaVO(String name, double middleScore, double finalScore) {
        super(name, middleScore, finalScore);
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public char getHak() {
        return hak;
    }

    public void setHak(char hak) {
        this.hak = hak;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
