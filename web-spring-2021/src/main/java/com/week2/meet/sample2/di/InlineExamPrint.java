package com.week2.meet.sample2.di;

public class InlineExamPrint  implements ExamPrint{
    private Exam exam;

    public InlineExamPrint(Exam exam) {
        this.exam = exam;
    }

    @Override
    public void print() {
        System.out.println(exam);
    }
}
