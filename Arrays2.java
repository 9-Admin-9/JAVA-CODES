/*
 given a sorted array of n integers, write a program to print all 
 the elements of the array without repeating.
 
 input:
 8
 2 2 2 3 4 4 4 23 
 output:
 2 
 3 
 4 
 23
 
import java.util.Scanner;

public class Arrays2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i =0;i<n-1;i++)
        {
            if(a[i]!=a[i+1])
            {
                System.out.println(a[i]);
            } 
        }
        System.out.println(a[n-1]);
        sc.close();
    }
}

given a sorted array of n integers, write a program to
print all the unique elements in the array

input:
8
2 2 2 3 4 4 4 23

output:
3 23

import java.util.Scanner;

public class Arrays2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int count = 1;
        for(int i = 0;i<n-1;i++)
        {
            if(a[i]==a[i+1]){
                count++;
            }
            else{
                if(count==1){
                    System.out.println(a[i]);
                }
                count=1;
            }
        }
        if(count==1){
            System.out.println(a[n-1]);
        }
        sc.close();
    }
}

given a sorted array of n integers, write a program to
count the number of unique elements present in the array. 

import java.util.Scanner;

public class Arrays2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int uniqueElements=0;
        int count = 1;
        for(int i = 0;i<n-1;i++)
        {
            if(a[i]==a[i+1])
            {
                count++;
            }
            else{
                if(count==1){
                    uniqueElements++;
                }
                count=1;
            }
        }
        if(count==1){
            uniqueElements++;
        }
        System.out.println(uniqueElements);
        sc.close();
    }
}

given a sorted array of n integers, write a program to
print the largest repeating element present in the array.
*/

import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++){
            a[i]=sc.nextInt();
        }
        boolean found=true;
        for (int i = a.length - 2; i >= 0; i--) {
            if (a[i] == a[i + 1]) {
                System.out.println("First duplicate from end: " + a[i]);
                found = true;
                break;
            }
        }
        if(found==false){
            System.out.println("not found");
        }
        sc.close();
    }
}
