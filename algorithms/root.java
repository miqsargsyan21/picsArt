import java.util.Scanner;

public class root
{
    public static void main(String[] args) {
        int number,
            rootOfNumber,
            sum = 1;
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Input a number.");
	    number = scanner.nextInt();
	    System.out.println("Input root of number.");
	    rootOfNumber = scanner.nextInt();
	    for (int i = 1; i <= number; i++) {
	        for (int j = 0; j < rootOfNumber; j++) {
	            sum *= i;
	        }
	        if (sum == number) {
	           System.out.println("Result is " + i);
	           break;
	        }
	        sum = 1;
	    }	    
	}
}
