import java.util.Scanner;

public class UserInput {
    public void printString(String str) {
        System.out.println("You entered: " + str);
    }

    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        return input;
    }

    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        String userInputString = userInput.getInput();
        userInput.printString(userInputString);
    }
}

