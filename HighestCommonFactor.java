/*
 given two numbers, calculate the greatest common divisor(GCD)[ OR highest Common Factor(HCF)]

//Using brute force approach
import java.util.*;

public class HighestCommonFactor {
    public static int highestCommonFactor(int a, int b) {
        for (int i = Math.min(a, b); i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("HCF of the two numbers: " + highestCommonFactor(a, b));
        sc.close();
    }
}
 // Using Euclid's Algorithm
import java.util.*;

public class HighestCommonFactor {
    public static int highestCommonFactor(int a, int b) {
       while(a!=b)
       {
        if(a>b){
            a=a-b;
        }else{
            b=b-a;
        }
       }
       return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("HCF of the two numbers: " + highestCommonFactor(a, b));
        sc.close();
    }
}
*/
//optimised euclidean algorithm
import java.util.*;

public class HighestCommonFactor {
    public static int highestCommonFactor(int a, int b) {
       while(a!=0&&b!=0)
       {
        if(a>b){
            a=a%b;
        }else{
            b=b%a;
        }
       }
       if(a!=0){
        return a;
       }else{
        return b;
       }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("HCF of the two numbers: " + highestCommonFactor(a, b));
        sc.close();
    }
}