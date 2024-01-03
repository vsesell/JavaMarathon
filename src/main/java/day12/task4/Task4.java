package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        MusicalBand band1 = new MusicalBand("Centr", 2007, new ArrayList<String>(Arrays.asList("Slim","Guf",
                "Ptaha")));
        MusicalBand band2 = new MusicalBand("Kiw", 1990, new ArrayList<String>(Arrays.asList("Gorwok","Knaz",
                "Balu","Mawa")));
        System.out.println(band1);
        System.out.println(band2);
        MusicalBand.transferMembers(band1,band2);
        System.out.println(band1);
        System.out.println(band2);
    }
}
