package com.week2.task;

public class StudentVO {
    private String name;
    private double middleScore;
    private double finalScore;

    public StudentVO(String name, double middleScore, double finalScore) {
        this.name = name;
        this.middleScore = middleScore;
        this.finalScore = finalScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMiddleScore() {
        return middleScore;
    }

    public void setMiddleScore(double middleScore) {
        this.middleScore = middleScore;
    }

    public double getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(double finalScore) {
        this.finalScore = finalScore;
    }
}
