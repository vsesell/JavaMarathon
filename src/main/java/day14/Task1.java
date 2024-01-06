package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("text.txt");

        printSumDigits(file);

    }

    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersAsStrings = line.split(" ");
            if (numbersAsStrings.length != 10)
                throw new IllegalArgumentException();
            int[] numbersAsInts = new int[numbersAsStrings.length];
            int sum = 0;
            for (int i = 0; i < numbersAsStrings.length; i++) {
                sum += Integer.parseInt(numbersAsStrings[i]);
            }
            System.out.println(sum);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Файл должен содержать ровно 10 чисел");
        }
    }
}
