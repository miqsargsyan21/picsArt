import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //Multiplication table
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input natural number for output multiplication table");
        if (scanner.hasNextInt()) {
            int firstNumber = scanner.nextInt();
            if (firstNumber >= 1) {
                for (int i = 1; i < 10; i++) {
                    System.out.println(firstNumber + " * " + i + " = " + firstNumber * i);
                }
            }
        }
        System.out.println("--------------------");

        //Factorial of number
        System.out.println("Input natural number for output factorial of the number");
        if (scanner.hasNextInt()) {
            int secondNumber = scanner.nextInt();
            if (secondNumber >= 1) {
                long factorialOfNumber = 1;
                for (long i = 1; i <= secondNumber; i++) {
                    factorialOfNumber *= i;
                }
                System.out.println("Factorial of " + secondNumber + " is " + factorialOfNumber);
            }
        }
        System.out.println("--------------------");

        //Number reverse
        System.out.println("Input natural number for reversing");
        if (scanner.hasNextInt()) {
            int thirdNumber = scanner.nextInt();
            if (thirdNumber >= 1) {
                int exponentiation = 1;
                for (int numberCopy = thirdNumber; numberCopy > 10; numberCopy /= 10, exponentiation *= 10) {}
                for(int numberCopy = thirdNumber, result = 0; numberCopy > 0; numberCopy /= 10, exponentiation /= 10) {
                    result += (numberCopy % 10) * exponentiation;
                    if (numberCopy < 10) {
                        System.out.println("After reversing number: " + result);
                    }
                }
            }
        }
        System.out.println("--------------------");

        //Is number prime?
        System.out.println("Input natural number for checking is it prime?");
        if (scanner.hasNextInt()) {
            int fourthNumber = scanner.nextInt();
            if (fourthNumber >= 1) {
                boolean isPrime = true;
                for (int i = 2; i < fourthNumber; i++) {
                    if (fourthNumber % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println("Number is prime!");
                } else {
                    System.out.println("Number isn't prime!");
                }
            }
        }
    }
}