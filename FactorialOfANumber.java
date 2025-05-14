// write a program to find factorial of a given number

import java.util.*;

public class FactorialOfANumber {
    public static long factorialOfANumber(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial of the given number is: " + factorialOfANumber(num));
        }

        sc.close();
    }
}
