package com.week2.task;

public interface HaksaService {
    double getSum(double middleScore, double finalScore);
    double getAvg(double middleScore, double finalScore);
    char getHak(double score);
    String getPass(char hak);

}
