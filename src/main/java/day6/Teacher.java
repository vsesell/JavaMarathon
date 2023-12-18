package day6;
import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
    public void evaluate(Student student) {
        Random random = new Random();
        int randomizedGrade = random.nextInt(4) + 2;
        String studentGrade = "";
        switch (randomizedGrade) {
            case 2: studentGrade = "неудовлетворительно";
            break;
            case 3: studentGrade = "удовлетворительно";
            break;
            case 4: studentGrade = "хорошо";
            break;
            case 5: studentGrade = "отлично";
        }
        System.out.println("Преподаватель " + this.getName() + " оценил студента с именем "
                + student.getName() + " по предмету " + getSubject() + " на оценку " + studentGrade);

    }
}
