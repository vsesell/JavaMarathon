package day7;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        Player player5 = new Player();
        Player player6 = new Player();

        System.out.println(player1.getStamina());
        System.out.println(player2.getStamina());
        System.out.println(player3.getStamina());
        for (int i = 0; i < 150; i++) {
            player5.run();
        }
        Player player7 = new Player();
        System.out.println(player5.getStamina());
        System.out.println(Player.countPlayers);
        Player.info();
    }
}
