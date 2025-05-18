/*
 print all divisors of a given number
 */

import java.util.Scanner;

public class divisiors {
    public static void divisiors(int n){
        int i = 0;
        for(i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
        for( ;i>=1;i--)
        {
            if(n%i==0&&i!=n/i)
            {
                System.out.println(n/i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        divisiors(num);
    }
}
