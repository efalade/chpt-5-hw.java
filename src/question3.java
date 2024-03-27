import java.util.Scanner;

public class EvenNumber {
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public void printEven(boolean isEven) {
        if (isEven) {
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
        boolean isEven = evenNumber.isEven(number);
        evenNumber.printEven(isEven);
    }
}
