package com.week2.meet.sample2.di;


public class DITest {
    public static void main(String[] args) {
        Exam exam = new NewExam();
        exam.input();

        ExamPrint p = new InlineExamPrint(exam); // DI ±¸Á¶
        p.print();
    }
}

