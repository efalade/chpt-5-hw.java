import java.util.Scanner;

public class EvenNumber {
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public void printEven(int number) {
        if (isEven(number)) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        EvenNumber evenNumber = new EvenNumber();
        evenNumber.printEven(number);
    }
}

