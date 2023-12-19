package day7;

import java.util.Random;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;

    static int countPlayers = 0;

    public Player() {
        if (countPlayers < 6) {
            countPlayers += 1;
        }
        Random random = new Random();
        stamina = random.nextInt(11) + 90;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
    public void run(){
        if (stamina == 0) {
            return;
        }
        stamina--;
        if (stamina == 0) {
            countPlayers--;
        }
    }
    public static void info(){
        // if there are < 6 players then print "Команды не полные. на поле есть Х свободных мест"
        // else print "На поле нет свободных мест"
        if (countPlayers < 6) {
            System.out.println("Команды не полные. на поле есть " + (6 - countPlayers)+ " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
