package day8;

import java.time.Duration;
import java.time.Instant;

public class Task1 {
    public static void main(String[] args) {
//        Instant start = Instant.now();
//        String string = "";
//        for (int i = 0; i < 20001; i++) {
////            System.out.print(string + " " + i); //PT0.0729579S
//            string += " " + i; //PT0.2478578S
//        }
//        System.out.println(string);
//        Instant end = Instant.now();
//        System.out.println(Duration.between(start, end));
        StringBuilder sb = new StringBuilder();
        Instant start = Instant.now();
        for (int i = 1; i < 20001; i++) {

            sb.append(i).append(" "); //PT0.0109939S
        }
        System.out.println(sb);
        Instant end = Instant.now();
        System.out.println(Duration.between(start, end));
    }

}

