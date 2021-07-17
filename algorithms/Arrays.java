import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input length of array");
        if (scanner.hasNextInt()) {
            int lengthOfArray = scanner.nextInt(),
                countOfPositives = 0,
                countOfNegatives = 0,
                countOfZeroes = 0,
                sum = 0,
                multiplicationNumbers = 1;
            int[] arr = new int[lengthOfArray];
            for (int i = 0; i < lengthOfArray; i++) {
                System.out.println("Input number for array...");
                if (scanner.hasNextInt()) {
                    arr[i] = scanner.nextInt();
                }
                if (arr[i] < 0) {
                    countOfNegatives++;
                } else if (arr[i] > 0) {
                    countOfPositives++;
                } else {
                    countOfZeroes++;
                }
                multiplicationNumbers *= arr[i];
                sum += arr[i];
            }
            int maximumNumber = arr[0],
                indexOfMax = 0;
            for (int i = 1; i < lengthOfArray; i++) {
                if (arr[i] > maximumNumber) {
                    maximumNumber = arr[i];
                    indexOfMax = i;
                }
            }
            System.out.println("Maximum number is " + maximumNumber + ". Index of maximum number is " + indexOfMax + ".");
            System.out.println("Sum of the numbers is " + sum + ".");
            System.out.println("Multiply is " + multiplicationNumbers);
            System.out.println("Count of the...");
            System.out.println("positive numbers is " + countOfPositives);
            System.out.println("negative numbers is " + countOfNegatives);
            System.out.println("zeroes is " + countOfZeroes);
        }
    }
}