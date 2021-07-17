import java.util.*;

public class ArraysExercises {
    public static void main(String[] args) {
        //Exercise 11.15
        int[] arr = {9, 1, 5, 16, 81, 7, 1, 81};
        boolean state = false;
        for (int num: arr) {
            for (int i = 0; i <= num; i++) {
                if (i * i == num) {
                    state = true;
                    System.out.println("Square root of " + num + " is " + i);
                    break;
                }
            }
            if (state == false) {
                System.out.println("There is no such integer for " + num);
            } else {
                state = false;
            }
        }
        for (int i = 1; i < arr.length; i++) {
            System.out.println("Arithmetic mean of " + arr[i-1] + " and " + arr[i] + " is " + (((double) arr[i] + (double) arr[i-1]) / 2.0));
        }
        System.out.println("-------------------------------");

        //exercise 11.16
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number 's' from 1 to " + (arr.length - 1));
        if (scanner.hasNextInt()) {
            int s = scanner.nextInt();
            System.out.println("Input number 'k' from 1 to " + (arr.length - 1));
            if (scanner.hasNextInt()) {
                int k = scanner.nextInt();
                //isPositive?
                System.out.println("Number s is positive: " + (arr[s] > 0));
                //isEven?
                System.out.println("Number k is even: " + (arr[k] % 2 == 0));
                //greater
                if (arr[s] > arr[k]) {
                    System.out.println("Number s is greater than number k");
                } else if (arr[s] < arr[k]) {
                    System.out.println("Number k is great than number s");
                } else {
                    System.out.println("Numbers k and s are equal");
                }
            }
        }
        System.out.println("-------------------------------");

        //Exercise 11.54
        int sum1 = 0,
            sum2 = 0;
        System.out.println("Input a number");
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            for (int num: arr) {
                if (num <= 20) {
                    sum1 += num;
                }
                if (num > a) {
                    sum2 += num;
                }
            }
        }
        System.out.println("First sum is " + sum1 + ". Second sum is " + sum2 + ".");
        System.out.println("-------------------------------");

        //Exercise 11.107
        int max = arr[0],
            min = arr[0],
            minIndex = 0,
            maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            } else if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        System.out.println("Min is " + min + ". Index of min is " + minIndex + ".");
        System.out.println("Max is " + max + ". Index of max is " + maxIndex + ".");
        System.out.println("max - min = " + (max - min));
        System.out.println("-------------------------------");

        //exercise 11.124
        int min2 = arr[0],
            max2 = arr[0];
        for (int i = 1, j = 0; i < arr.length || j < arr.length;) {
            if (i < arr.length) {
                if (max2 < arr[i]) {
                    max2 = arr[i];
                } else if (min2 > arr[i]) {
                    min2 = arr[i];
                }
                i++;
            } else if (j < arr.length) {
                if (arr[j] == max2) {
                    System.out.println("Max index..." + j);
                }
                if (arr[j] == min2) {
                    System.out.println("Min index..." + j);
                }
                j++;
            }
        }
    }
}