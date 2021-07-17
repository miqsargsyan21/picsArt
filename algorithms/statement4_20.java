import java.util.Scanner;

public class statement4_20 {
    public static void main(String[] args) {
        //exercise 4.20 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number m");
        int m = scanner.nextInt();
        System.out.println("Input number n");
        int n = scanner.nextInt();
        if (m % n == 0) {
            System.out.println("m / n = " + m / n);
        } else {
            System.out.println("m на n нацело не делиться");
        }
        System.out.println("-----------------------");

        //exercise 4.21
        System.out.println("Input number a");
        int a = scanner.nextInt();
        System.out.println("Input number b");
        int b = scanner.nextInt();
        if (b % a == 0 && b % (b / a) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println("-----------------------");

        //exercise 4.22
        System.out.println("Input number");
        int number = scanner.nextInt();
        boolean state = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                state = false;
                break;
            }
        }
        System.out.println("Is prime? : " + state);
        if (number % 10 == 7) {
            System.out.println("Yes, it is.");
        } else {
            System.out.println("No, it isn't.");
        }
        System.out.println("-----------------------");

        //exercise 4.23
        System.out.println("Input two-digit number");
        number = scanner.nextInt();
        if (number % 10 == number / 10) {
            System.out.println("Two digits are equal.");
        } else if  (number % 10 > number / 10) {
            System.out.println("Second digit is greater.");
        } else {
            System.out.println("First digit is greater.");
        }
        System.out.println("-----------------------");

        //exercise 4.24
        System.out.println("Input two-digit number");
        number = scanner.nextInt();
        int firstValue = number * number,
            secondValue = (((number % 10) * (number % 10) * (number % 10)) * 4) + (((number / 10) * (number / 10) * (number / 10)) * 4);
        if (secondValue == firstValue) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}