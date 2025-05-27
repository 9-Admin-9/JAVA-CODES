/*
 1) given three integer values n, a and b,
    write a program to print all the multiple of  a and b till n 
 
import java.util.*;
public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n, a, b values");
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b =sc.nextInt();
        for(int i = 1;i<=n;i++){
            if(i%a==0||i%b==0){
                System.out.print(i+" ");
            }
        }
    }
}

2)write a program to print all  2 digit numbers


public class loops {
    public static void main(String[] args) {
        for(int i = 10;i<100;i++){
            System.out.println(i);
        }
    }
}

3) write a program to print the multiplecation tables of n till 10


 import java.util.*;

 public class loops {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n value");
        int n = sc.nextInt();
        for(int i = 1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
 }

 4) given an integer value n, write a program to print all factors of n.

import java.util.Scanner;

public class loops {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }

    }
 }
  
5) given an integer value n, write a program to print how many factors of n.

import java.util.Scanner;

public class loops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int count=0;
        for(int i = 1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        System.out.println("total number of factor of n is: "+count);
    }
}

6) given an integer value n, write a program to check whether given number is prime or not 

import java.util.Scanner;

public class loops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        boolean status = true;
        if(n<2){
            System.out.println("invalid number");
            return;
        }
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                status=false;
                break;
            }
        }
        System.out.println(status?"prime number":"not a prime number");
    }
}


7) given 2 integer values m and n, write a program to print all the prime numbers b/w n amd m

import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n and m values");
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n<2){
            System.out.println("entered n value is invalid please correct value");
            return;
        }
        for(int num = n;num<=m;num++){
            boolean st = true;
            for(int i = 2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    st=false;
                    break;
                }
            }
            if(st){
                System.out.println(num);
            }
        }
        sc.close();
    }
}
 
8)given two integer values n and x, write a program to print all the multiples of n till x

import java.util.Scanner;

public class loops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x and n values");
        int x = sc.nextInt();
        int n = sc.nextInt();
        for(int i = 1;i<=x;i++){
            if(i%n==0){
                System.out.print(i+" ");
            }
        }
    }
}

9) given three integer values n , a and b, write a program to print the 
commnon multiples of and b till n.


import java.util.Scanner;

public class loops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = 1;i<=n;i++){
            if(i%a==0 && i%b==0){
                System.out.print(i+" ");
            }
        }
    }
}

10) given three integer values n, a and b, write a program to print the common 
multiples of a and b    .

input :
5 
2
3

output:
6 12 18 24 30

import java.util.Scanner;

public class loops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n,a and b values");
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count=1;
        for(int i=1;count<=n;i++){
           if(i%a==0&&i%b==0){
            System.out.print(i+" ");
            count++;
           }
        }
        sc.close();
    }
}


11)
given two integer values n1 and n2, write a program to print all the common factors of both n1 and n2.

input:
12
18
output:
1 2 3 6

import java.util.Scanner;

public class loops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a, b values");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("common multiples: ");
        for(int i = 1;i<=Math.min(a,b);i++){
            if(a%i==0&&b%i==0){
                System.out.print(i+" ");
            }
        }
    }
}


12) given two integer values n1 and n2, write a program to find the hcf of two numbers.


import java.util.Scanner;

public class loops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int hcf = 1;
        for(int i = Math.min(n1, n2);i>=1;i--){
            if(n1%i==0&&n2%i==0){
                hcf = i;
                break;
            }
        }
        System.out.println("hcf of two numbers: "+hcf);
    }
}

13) given two integer values n1 and n2, write a program to find the lcm of two numbers.


import java.util.Scanner;

public class loops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1 and n2 values:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int hcf = 1;
        for (int i = Math.min(n1, n2); i >= 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                hcf = i;
                break;
            }
        }

        int lcm = (n1 * n2) / hcf;
        System.out.println("LCM of " + n1 + " and " + n2 + " is: " + lcm);

        sc.close();
    }
}

14) given an integer value n, write aprogram to count number of digits in n.

import java.util.Scanner;

public class loops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n value");
        int n = sc.nextInt();
        int count = 0;
        if(n==0){
            System.out.println(0);
        }
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println("total number of digits in a given number : "+ count);
        sc.close();
    }
}

15) given an integre value n, write a program to print the sum of all digits in n.

import java.util.Scanner;

public class loops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int sum = 0;
        while(n!=0){
            int rem = n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println("sum of all digits of n is :"+sum);
        sc.close();
    }
}

16) given an integer value n, write a program to print n in reverse order.

*/

import java.util.Scanner;

public class loops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n value");
        int n = sc.nextInt();
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev= rev*10+rem;
            n=n/10;
        }
        System.out.println("reverse number is; "+ rev);
        sc.close();
    }
}