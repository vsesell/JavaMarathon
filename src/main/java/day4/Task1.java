package day4;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int[] array = new int[sc.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
        }
        int numberGreaterThanEight = 0;
        for (int x : array) {
            if (x > 8) {
                numberGreaterThanEight++;
            }
            }
        int numberOf1 = 0;
        for (int x : array) {
            if (x == 1) {
                numberOf1++;
            }
        }
        int even = 0;
        for (int x : array) {
            if (x % 2 == 0){
                even++;
            }
        }
        int odd = 0;
        for (int x : array) {
            if (x % 2 != 0){
                odd++;
            }
        }
        int sum = 0;
        for (int x : array) {
            sum += x;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Длинна массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + numberGreaterThanEight);
        System.out.println("Количество чисел равных 1: " + numberOf1);
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + odd);
        System.out.println("Сумма всех элементов массива: " + sum);

    }
}
