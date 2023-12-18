package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike mb = new Motorbike("Ducatti", "Green", 1996);
        System.out.println("Марка мотоцикла: " + mb.getModel());
        System.out.println("Цвет: " + mb.getColor());
        System.out.println("Год выпуска: " + mb.getYear());
    }
}
