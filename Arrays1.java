/* 

1) Take 'n' values from the user and print the values at even indices of the array.

import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] ar = new int[size];
        System.out.println("Enter " + size + " integer values:");
        for (int i = 0; i < size; i++) {
            ar[i] = sc.nextInt();
        }

        System.out.println("Values at even indices:");
        for (int i = 0; i < size; i += 2) {
            System.out.print(ar[i] + " ");
        }

        sc.close();
    }
}
2) Given an array of 'n' integers, write a program to print the sum of all elements in the array.

import java.util.Scanner;

public class Arrays1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " integer values:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }

        System.out.println("The sum of all elements in the array is: " + sum);
        sc.close();
    }
}
3) Given an array of 'n' integers, write a program to print the product of all elements in the array.

import java.util.Scanner;

public class Arrays1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " integer values:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        long product = 1;
        for (int i = 0; i < size; i++) {
            product *= arr[i];
        }

        System.out.println("The product of all elements in the array is: " + product);
        sc.close();
    }
}


4) Given an array of 'n' integers, write a program to find the largest element in the array.

import java.util.Scanner;

public class Arrays1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " integer values:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0]; // Assume first element is the max initially
        for (int i = 1; i < arr.length; i++) { // Start from index 1 for slight optimization
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("The largest element in the array is: " + max);
        sc.close();
    }
}


5) Given an array of 'n' integers, write a program to print the index of the largest element present in the array.


import java.util.Scanner;

public class Arrays1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter " + n + " integer values:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int max = a[0];
        int index = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                index = i;
            }
        }

        System.out.println("Index of the largest element: " + index);
        sc.close();
    }
}

/*
6) Given an array of 'n' integers and a value 'k', write a program to print the number of occurrences of 'k' in the array.

import java.util.Scanner;

public class Arrays1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter " + n + " integer values:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at index " + i + ": ");
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the value to search (k):");
        int k = sc.nextInt();

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == k) {
                count++;
            }
        }

        System.out.println("Number of occurrences of " + k + " in the array: " + count);
        sc.close();
    }
}

7) given an array of 'n' integers and an integer value 'k'. write a program to print
the index of k in the array.

import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter " + n + " integer values:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at index " + i + ": ");
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the value to search (k):");
        int k = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == k) {
                System.out.println("Index of " + k + " is: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(k + " is not present in the array.");
        }

        sc.close();
    }
}

8)
given an array of n integers, write a program to print the resultant array 
with the product of n-1 elements present in the array.

import java.util.Scanner;

public class Arrays1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
         System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter " + n + " integer values:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at index " + i + ": ");
            a[i] = sc.nextInt();
        }
        int[] res = new int[a.length];
        int p=1;
        for(int i =0;i<a.length;i++){
            p=p*a[i];
        }
        for(int i = 0;i<res.length;i++){
           int r = p/a[i];
           res[i]=r;
        }
        for(int i =0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        sc.close();
    }
}

9) given an array of n integers, write a program to print
the second largest element in the array.


import java.util.Arrays;
import java.util.Scanner;

public class Arrays1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int[] a = new int[n];
        System.out.println("Enter " + n + " integer values:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at index " + i + ": ");
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        System.out.println("Second largest element in the array is: " + a[n - 2]);
    }
}

import java.util.Scanner;

public class Arrays1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int[] a = new int[n];
        System.out.println("Enter " + n + " integer values:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at index " + i + ": ");
            a[i] = sc.nextInt();
        }

        int max1=Integer.MIN_VALUE, max2=Integer.MIN_VALUE;

        // Initialize max1 and max2 safely
        if (a[0] > a[1]) {
            max1 = a[0];
            max2 = a[1];
        } else if (a[0] < a[1]) {
            max1 = a[1];
            max2 = a[0];
        } else {
            max1 = max2 = a[0];
        }

        for (int i = 2; i < a.length; i++) {
            if (a[i] > max1) {
                max2 = max1;
                max1 = a[i];
            } else if (a[i] > max2 && a[i] != max1) {
                max2 = a[i];
            }
        }

        if (max1 == max2) {
            System.out.println("No distinct second largest element found.");
        } else {
            System.out.println("Second largest element in the array is: " + max2);
        }

        sc.close();
    }
}

print max pair sum


import java.util.Scanner;

public class Arrays1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter " + n + " integer values:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at index " + i + ": ");
            a[i] = sc.nextInt();
        }
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
        if(a[0]>a[1]){
            max1=a[0];
            max2=a[1];
        }else{
            max1=a[1];
            max2=a[0];
        }
        for(int i = 2;i<a.length;i++){
            if(a[i]>max1){
                max2=max1;
                max1=a[i];
            }
            else if(a[i]>max2){
                max2=a[i];
            }
        }
        System.out.println("max pair sum is : "+(max1+max2));
    }
}
       
given an array of n integers, write a program to 
print all the pairs present in the array.

import java.util.Scanner;

public class Arrays1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of the array");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter " + n + " integer values:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at index " + i + ": ");
            a[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                System.out.println(a[i]+" "+a[j]);
            }
        }
        sc.close();
    }
}

given an array of n integeres and an integer value k, write a program
to print all the pairs present in the array whose sum is equal to k.


import java.util.Scanner;
public class Arrays1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of the array");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter " + n + " integer values:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at index " + i + ": ");
            a[i] = sc.nextInt();
        }
        System.out.println("enter sum value");
        int sum = sc.nextInt();
        for(int i = 0;i<a.length;i++){
            for(int j = i+1;j<a.length;j++){
                if(a[i]+a[j]==sum)
                {
                    System.out.println(a[i]+" "+a[j]);
                }
            }
        }
        sc.close();
    }
}

given a sorted array of n integers, write a program to 
print the occuarances of each element presnt in the array.
*/

import java.util.Scanner;

public class Arrays1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int count = 1;
        for (int i = 1; i < n; i++) {
            if (a[i] == a[i - 1]) {
                count++;
            } else {
                System.out.println(a[i - 1] + " - " + count);
                count = 1;
            }
        }

        // ✅ Print the last element's count
        System.out.println(a[n - 1] + " - " + count);
    }
}


