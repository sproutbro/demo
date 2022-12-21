package ui;

import entity.Exam;

public class InlineConsole implements ExamConsole {

    Exam exam;
    @Override
    public void print() {
        System.out.printf("total is %d avg is %f", exam.total(), exam.avg());
    }

    @Override
    public void setExam(Exam exam) {
        this.exam = exam;
    }
}
