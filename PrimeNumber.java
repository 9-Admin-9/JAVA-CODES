/* 
import java.util.Scanner;

public class PrimeNumber {
    public static boolean primeNumber(int n)
    {
        if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for(int i =2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime: ");
        int n = sc.nextInt();
        System.out.println(n + " is " + (primeNumber(n) ? "a prime number." : "not a prime number."));
    }
}
*/

// another way

import java.util.Scanner;

public class PrimeNumber {
    public static boolean iSprime(int n)
    {
        if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        if(n==2||n==3)
        {
            return true;
        }
        if(n%2==0||n%3==0)
        {
            return false;
        }
        for(int i = 5;i*i<=n;i=i+6)
        {
            if(n%i==0||n%(i+2)==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime: ");
        int n = sc.nextInt();
        System.out.println(n + " is " + (iSprime(n) ? "a prime number." : "not a prime number."));
    }
}


