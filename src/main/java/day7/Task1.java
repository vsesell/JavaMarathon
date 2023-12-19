package day7;


public class Task1 {
    public static void main(String[] args) {
        Airplane plane = new Airplane("Boeing", 1997, 100, 2000);
        Airplane plane1 = new Airplane("Tu", 1979, 101, 200);
        Airplane.compareAirplanes(plane1, plane);
    }
}