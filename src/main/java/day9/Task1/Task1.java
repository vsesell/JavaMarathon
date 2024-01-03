package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Dima", "Universam");
        Teacher teacher = new Teacher("Igor", "Math");
        System.out.println(student.getGroup());
        System.out.println(teacher.getSubject());
        student.printInfo();
        teacher.printInfo();
    }
}
