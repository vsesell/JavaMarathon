package day4;
import java.util.Arrays;
import java.util.Random;
public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matrix = new int[12][8];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(51);
            }
        }
        int[] sums = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sums[i] += matrix[i][j];
            }
        }
        int maxSum = sums[0];
        int maxSumIndex = 0;
        for(int i = 0;i < sums.length; i++) {
            if (sums[i] > maxSum) {
                maxSum = sums[i];
                maxSumIndex = i;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(Arrays.toString(sums));
        System.out.println(maxSum);
        System.out.println(maxSumIndex);
    }
}
