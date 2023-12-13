package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            double first = sc.nextDouble();
            double second = sc.nextDouble();
            if (second == 0) {
                break;
            }
            System.out.println(first / second);

        }
    }
}