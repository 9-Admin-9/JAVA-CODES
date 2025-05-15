/*
 LCM OF TWO NUMBERS
*/
import java.util.Scanner;

public class LowestCommonMultiple {

    // Method to compute HCF (GCD) using Euclidean Algorithm
    public static int highestCommonFactor(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return (a != 0) ? a : b;
    }

    // Method to compute LCM using HCF
    public static long lcm(int a, int b) {
        return ((long) a * b) / highestCommonFactor(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter values for a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Input validation
        if (a <= 0 || b <= 0) {
            System.out.println("Please enter positive integers only.");
        } else {
            System.out.println("LCM of the two numbers: " + lcm(a, b));
        }

        sc.close();
    }
}
