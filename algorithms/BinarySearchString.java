import java.util.*;

public class BinarySearchString {
    public static void main(String[] args) {
        String str = "abcdeflmno";
        char myChar = 'q';
        for (int low = 0, high = str.length() - 1, middle = (high + low) / 2; ;  ) {
            if (str.charAt(middle) == myChar) {
                System.out.println("The index of char is " + middle);
                break;
            } else if (myChar > str.charAt(middle) && (high - low) > 1) {
                low = middle;
            } else if (myChar < str.charAt(middle) && (high - low) > 1) {
                high = middle;
            } else {
                System.out.println("There is no such charecter");
                break;
            }
            middle = (high + low) / 2;
        }
    }
}