package day8;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public int getLength() {
        return length;
    }

    public int getFuel() {
        return fuel;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }
    public String toString(){
return  "Изготовитель: " + this.producer +
        "Год выпуска: " + this.year +
        "длина: " + this.length +
        "вес: " + this.weight +
        "количество топлива в баке: " + this.fuel;
    }
    public void info(){
        System.out.println("Изготовитель: " + this.producer);
        System.out.println("Год выпуска: " + this.year);
        System.out.println("длина: " + this.length);
        System.out.println("вес: " + this.weight);
        System.out.println("количество топлива в баке: " + this.fuel);
    }
    public void fillUp(int fuel) {
        this.fuel += fuel;
    }
    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.getLength() > airplane2.getLength()) {
            System.out.println("Самолёт 1 длиннее самолёта 2");
        } else if (airplane1.getLength() < airplane2.getLength()) {
            System.out.println("Самолёт 2 длиннее самолёта 1");
        } else {
            System.out.println("Самолёты одинаковой длинны");
        }
    }
}
