package OOP.staticEx;

public class GameScore {

    private static int totalScore = 0;

    public static void addPoints(int points){
        totalScore += points;
    }

    public static int getTotalScore() {
        return totalScore;
    }
}
