package day4;
import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10001);
        }
//        int max = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > max) {
//                max = array[i];
//            }
//        }
        int max = 0;
        for (int x : array) {
            if (x > max) {
                max = x;
            }
        }
//        int min = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < max) {
//                min  = array[i];
//            }
//        }
        int min = Integer.MAX_VALUE;
        for (int x : array) {
            if (x < min) {
                min = x;
            }
        }
//        int divisibleByTen = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 10 == 0) {
//                divisibleByTen += 1;
//            }
//        }
        int divisibleByTen = 0;
        for (int x : array) {
            if (x % 10 == 0) {
                divisibleByTen += 1;
            }
        }
        int sumOfDivisibleByTen = 0;
        for (int x : array) {
            if (x % 10 == 0) {
                sumOfDivisibleByTen += x;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(max);
        System.out.println(min);
        System.out.println(divisibleByTen);
        System.out.println(sumOfDivisibleByTen);
    }
}
