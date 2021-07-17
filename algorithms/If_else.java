import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number.");
        if (scanner.hasNextInt()) {
            int firstNumber = scanner.nextInt();
            System.out.println("Input second number.");
            if (scanner.hasNextInt()) {
                int secondNumber = scanner.nextInt();
                System.out.println("Input third number.");
                if (scanner.hasNextInt()) {
                    int thirdNumber = scanner.nextInt();
                    if (thirdNumber == firstNumber && thirdNumber == secondNumber) {
                        System.out.println("Minimum doesn't exist");
                    } else if (secondNumber <= firstNumber && secondNumber <= thirdNumber) {
                        System.out.println("The smallest number is " + secondNumber);
                    } else if (firstNumber <= secondNumber && firstNumber <= thirdNumber) {
                        System.out.println("The smallest number is " + firstNumber);
                    } else {
                        System.out.println("The smallest number is " + thirdNumber);
                    }
                }
            }
        }
        System.out.println("--------------------");

        System.out.println("Input a number.");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number < 0) {
                System.out.println("The absolute value of number is " + (-1 * number));
            } else {
                System.out.println("The absolute value of number is " + number);
            }
        }
    }
}