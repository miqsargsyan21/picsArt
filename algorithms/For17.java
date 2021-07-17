import java.util.Scanner;

public class For17 {
    public static void main(String[] args) {
        //exercise 17 (Loop for)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number A");
        double a = scanner.nextDouble();
        System.out.println("Input number N");
        int n = scanner.nextInt();
        double i = 1,
               sum = 0; 
        for (int j = 0; j <= n; i *= a, j++) {
            sum += i;
        }
        System.out.println("Sum is " + sum);
        System.out.println("-------------------");

        //exercise 18 (loop for)
        System.out.println("Input number A");
        a = scanner.nextDouble();
        System.out.println("Input number N");
        n = scanner.nextInt();
        sum = 0;
        i = 1;
        double z = 1;
        for (int j = 0; j <= n; i *= a, j++, z *= -1) {
            sum += i * z;
        }
        System.out.println("Sum is " + sum);
        System.out.println("-------------------");

        //exercise 19 (Loop for)
        System.out.println("Input number N");
        n = scanner.nextInt();
        sum = 1;
        for (double number = (double) n; number > 1 ; number--) {
            sum *= number;
        }
        System.out.println("Factorial of " + n + " is " + sum);
        System.out.println("-------------------");

        //exercise 20 (Loop for)
        System.out.println("Input number N");
        n = scanner.nextInt();
        int sumOfFactorial = 0;
        for (int number =  1, factorialOfNumber = 1; number <= n ; number++, factorialOfNumber *= number) {
            sumOfFactorial += factorialOfNumber;
        }
        System.out.println("Factorial of " + n + " is " + sumOfFactorial);

    }
}