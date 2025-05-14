/*
 * Problem
You are given an array A of length N. Your task is to find the sum of the elements that are present at even positions after reversing the array. The position is considered even if it is 0-based indexing, meaning the positions are 0, 2, 4, etc. Return the sum of the elements at these positions in the reversed array.

Input Format
The first line contains an integer N, representing the number of elements in the array.

The second line contains N integers separated by spaces, representing the elements of the array.

Output Format
Return an integer value representing the sum of the array elements present at the even positions of the reversed array.

Explanation:
5

1 2 3 4 5

After reversing the array, it becomes [5, 4, 3, 2, 1]. The elements at even positions are 5 (index 0), 3 (index 2), and 1 (index 4). Their sum is 5 + 3 + 1 = 9.

Sample Inputs & Outputs
Sample Input 1

5
1 2 3 4 5
Sample Output 1

9
Sample Input 2

4
10 20 30 40
Sample Output 2

60
Constraints
1 <= N <= 1000. The elements of the array can be any integers.

 */

import java.util.Scanner;

public class SumOfEvenPostions
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter size an array");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.println("enter "+ (i+1) +" element in to an array");
            arr[i]= scanner.nextInt();
        }
        int evenSum =0;
        for(int i =0;i<size;i++)
        {
            int reversedIndex = size-i-1;
            if(i%2==0)
            {
                evenSum+=arr[reversedIndex];
            }
        }
        System.out.println("sum of all even elements: "+evenSum);
    }
 }