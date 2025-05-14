/* 
Problem
Given an array of integers, find the sum of its elements. For example, if the array is [1, 2, 3], the sum is 6.

Input Format
The first line contains an integer n, denoting the size of the array.

The second line contains n space-separated integers representing the array's elements.

Output Format
Print the sum of the array's elements as a single integer.

Sample Inputs & Outputs
Sample Input 1

6
1 2 3 4 10 11
Sample Output 1

31
Constraints
1 <= n <= 1000
*/

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        System.out.println("enter array size");
        int n = scanner.nextInt();

        int sum = 0;

        // Read the array elements and compute the sum
        for (int i = 0; i < n; i++) {
            System.out.println("enter "+(i+1)+" element into the array");
            int num = scanner.nextInt();
            sum += num;
        }

        // Print the result
        System.out.println("sum of all elements in an array "+sum);

        scanner.close();
    }
}
