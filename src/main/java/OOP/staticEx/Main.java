package OOP.staticEx;

public class Main {
    public static void main(String[] args) {
        Player pl1 = new Player("Max", 500);
        Player pl2 = new Player("Den", 600);

        System.out.println(GameScore.getTotalScore());
        System.out.println(pl1);
        System.out.println(pl2);
    }
}
