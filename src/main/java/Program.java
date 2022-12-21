import entity.Exam;
import entity.NewlecExam;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ui.ExamConsole;

import java.util.List;

public class Program {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("setting.xml");

        Exam exam = context.getBean(Exam.class);
        System.out.println("exam = " + exam);
        ExamConsole console = context.getBean(ExamConsole.class);
        console.print();

        List<Exam> exams = (List<Exam>) context.getBean("exams");
        exams.add(new NewlecExam(1, 2, 3, 4));

        for(Exam e: exams)
            System.out.println("e = " + e);
    }
}
