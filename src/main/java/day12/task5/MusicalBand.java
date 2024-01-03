package day12.task5;

import java.util.List;

public class MusicalBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public MusicalBand(String name, int year) {
        this.name = name;
        this.year = year;
    }
    public static void transferMembers(MusicalBand A, MusicalBand B) {
        for (MusicArtist member : A.getMembers()){
            B.getMembers().add(member);
        }
        A.getMembers().clear();
    }
    public void printMembers() {
        System.out.println(this.members);
    }
    public MusicalBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    @Override
    public String toString() {
        return "MusicalBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + members +
                '}';
    }
}
