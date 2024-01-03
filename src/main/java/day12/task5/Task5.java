package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        MusicalBand band1 = new MusicalBand("Centr", 2007, new ArrayList<MusicArtist>(Arrays.asList(new MusicArtist(
                "Slim", 1982),new MusicArtist("Guf", 1985), new MusicArtist("Ptaha",
                1983))));
        MusicalBand band2 = new MusicalBand("Kiw", 1990, new ArrayList<MusicArtist>(Arrays.asList(new MusicArtist(
                "Gorwok", 1980), new MusicArtist("Knaz", 1981), new MusicArtist("Balu",
                1985), new MusicArtist("Mawa", 1990)
        )));
        System.out.println(band1);
        System.out.println(band2);
        MusicalBand.transferMembers(band1,band2);
        System.out.println(band1);
        System.out.println(band2);
    }
    }

