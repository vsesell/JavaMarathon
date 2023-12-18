package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane plane = new Airplane("Boeing", 1997, 100, 200);
        plane.setYear(1989);
        plane.setLength(90);
        plane.fillUp(2);
        plane.fillUp(7);
        plane.info();
    }
}
