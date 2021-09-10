package com.week2.task;

public interface HaksaService {
    double sum(StudentVO studentVO);
    double avg(StudentVO studentVO);
    char hak(double score);
    String pass(char hak);
    void print();
    void input();

}
