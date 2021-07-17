import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number A");
        if (scanner.hasNextInt()) {
            int numberA = scanner.nextInt();
            System.out.println("Input number B");
            if (scanner.hasNextInt()) {
                int numberB = scanner.nextInt();
                //First version
                int temp = numberA;
                numberA = numberB;
                numberB = temp;
                System.out.println("After first raplacing: A is " + numberA + ": B is " + numberB + ":");
                //Second version
                numberA = numberA + numberB - (numberB = numberA);
                System.out.println("After second raplacing: A is " + numberA + ": B is " + numberB + ":");
                //Third version
                numberA += numberB;
                numberB = numberA - numberB;
                numberA -= numberB;
                System.out.println("After third raplacing: A is " + numberA + ": B is " + numberB + ":");
            }
        }
    }
}