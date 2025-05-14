//count number of digits in a given number

import java.util.Scanner;

public class CountNumberOfDigits {
    public static int countNumberOfDigits(int num) {
        if (num == 0) {
            return 1; // 0 has one digit
        }

        int count = 0;
        num = Math.abs(num); // Optional: Handle negative numbers

        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        System.out.println("Number of digits in the given number: " + countNumberOfDigits(num));
        sc.close();
    }
}
