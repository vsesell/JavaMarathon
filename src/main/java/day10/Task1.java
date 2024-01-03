package day10;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int n = 10;
        long[] mem = new long[n + 1];

        Arrays.fill(mem, -1);
        System.out.println(fib(n, mem));
    }

    private static long fib(int n, long[] mem) {
        if (mem[n] != -1)
            return  mem[n];
        if (n <= 1)
            return n;
        long result = fib(n - 1,mem) + fib(n - 2,mem);
        mem[n] = result;

        return result;
    }
}
