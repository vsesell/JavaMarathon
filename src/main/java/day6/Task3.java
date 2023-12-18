package day6;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Igor", "Math");
        Student student = new Student("Dima");
        teacher.evaluate(student);
    }
}
