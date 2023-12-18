package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("BUGATTI");
        car.setColor("Yellow");
        car.setYear(2015);
        System.out.println("Марка авто: " + car.getModel());
        System.out.println("Цвет: " + car.getColor());
        System.out.println("Год выпуска: " + car.getYear());
    }
}


