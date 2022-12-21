package ui;

import entity.Exam;

public class GridConsole implements ExamConsole {

    Exam exam;
    @Override
    public void print() {
        System.out.println("===================================");
        System.out.printf("total is %d avg is %f \n", exam.total(), exam.avg());
        System.out.println("===================================");
    }

    @Override
    public void setExam(Exam exam) {
        this.exam = exam;
    }
}
