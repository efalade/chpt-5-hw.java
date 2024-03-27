import java.util.Scanner;

public class GameScores {
    public String enterName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name (or press Enter to exit): ");
        return scanner.nextLine();
    }

    public int enterScore(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter high score for " + name + ": ");
        return scanner.nextInt();
    }

    public void printScore(String name, int score) {
        System.out.println("Name: " + name + ", High Score: " + score);
    }

    public static void main(String[] args) {
        GameScores gameScores = new GameScores();

        while (true) {
            String name = gameScores.enterName();
            if (name.isEmpty()) {
                break; // Exit loop if user does not enter a name
            }
            int score = gameScores.enterScore(name);
            gameScores.printScore(name, score);
        }
    }
}
