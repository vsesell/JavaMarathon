package day4;
import java.util.Arrays;
import java.util.Random;
public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
//        int[] array = {1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254};
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10001);
        }

        int maxSum = 0;
        int sumIndex = 0;
        for (int i = 0; i < array.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += array[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                sumIndex = i;
            }
        }
        System.out.println(maxSum);
        System.out.println(sumIndex);
    }
}
