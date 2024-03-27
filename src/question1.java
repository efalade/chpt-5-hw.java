public class SumOfNumbers {
    // Method to sum two integers
    public int sum1(int num1, int num2) {
        System.out.println("sum1(int, int) method called.");
        return num1 + num2;
    }

    // Method to sum two doubles
    public double sum2(double num1, double num2) {
        System.out.println("sum2(double, double) method called.");
        return num1 + num2;
    }

    public static void main(String[] args) {
        SumOfNumbers calculator = new SumOfNumbers();

        // Calling sum1 with two ints
        int result1 = calculator.sum1(5, 3);
        System.out.println("Sum of two ints: " + result1);

        // Calling sum2 with two doubles
        double result2 = calculator.sum2(2.5, 3.7);
        System.out.println("Sum of two doubles: " + result2);

        // Calling sum2 with one double and one int
        double result3 = calculator.sum2(2.5, 3);
        System.out.println("Sum of one double and one int: " + result3);
    }
}

