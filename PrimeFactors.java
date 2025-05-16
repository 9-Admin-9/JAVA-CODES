/*
 print all prime factors of  a given number
 */

import java.util.Scanner;

public class PrimeFactors {
    public static void PrimeFactor(int n)
    {
        int i = 2;
        while(i*i<=n){
            while(n%i==0)
            {
                System.out.print(i+" ");
                n=n/i;
            }
            i++;
        }
        if(n>1)
        {
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("enter number");
        int n = sc.nextInt();
        PrimeFactor(n);
    }
}
