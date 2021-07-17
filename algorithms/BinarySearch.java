import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 7, 11, 25, 28, 50, 100};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            for (int low = 0, high = arr.length, middle = (high + low) / 2; ;  ) { 
                if (arr[middle] == number) {
                    System.out.println("The index of " + number + " is " + middle);
                    break;
                } else if (number > arr[middle] && (high - low) > 1) {
                    low = middle;
                } else if (number < arr[middle] && (high - low) > 1) {
                    high = middle;
                } else {
                    System.out.println("There is no such number.");
                    break;
                }
                middle = (high + low) / 2;
            }
        }   
    }
}