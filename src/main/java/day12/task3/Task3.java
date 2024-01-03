package day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicalBand[] musicalBands = {new MusicalBand("Nirvana", 1991),
                new MusicalBand("The Beatles", 1960),
                new MusicalBand("Spleen", 1992),
                new MusicalBand("Aquarium", 1970),
                new MusicalBand("DDT", 1972),
                new MusicalBand("Scuffs", 2023),
                new MusicalBand("Pidlords", 1928),
                new MusicalBand("Nazarbek", 1988),
                new MusicalBand("Bad balance", 1985),
                new MusicalBand("Three doors down", 2001),
                new MusicalBand("Biba", 2019),};
        List<MusicalBand> musicalBandList = new ArrayList<>(Arrays.asList(musicalBands));
        Collections.shuffle(musicalBandList);
//        for (MusicalBand x : musicalBandList) {
//            System.out.println(x);
//        }
        List<MusicalBand> groupsAfter2000 = groupsAfter2000(musicalBandList);
        for (MusicalBand x : groupsAfter2000) {
            System.out.println(x);
        }
    }

    public static List<MusicalBand> groupsAfter2000(List<MusicalBand> bands) {
        List<MusicalBand> groupsAfter2000 = new ArrayList<>();
        for (MusicalBand x : bands) {
            if (x.getYear() > 2000) {
                groupsAfter2000.add(x);
            }
        }
        return groupsAfter2000;
    }
}
