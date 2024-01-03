package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> auto = new ArrayList<>();
        auto.add("BMW");
        auto.add("Audi");
        auto.add("Toyota");
        auto.add("Skoda");
        auto.add("Lada");
        System.out.println(auto);
        auto.add(2, "Honda");
        auto.remove(0);
        System.out.println(auto);
    }
}
