/*
Problem
Given an integer value n, print the sum of odd digits present in n.

Input Format
The input is a single integer n.

Output Format
Print the sum of odd digits present in n.

Sample Inputs & Outputs
Sample Input 1

1234567890
Sample Output 1

25
Sample Input 2

24680
Sample Output 2

0
Constraints
0 ≤ n ≤ 10^18
*/
import java.util.Scanner;

public class SumOfOddDigits {
    public static int sumOfOddDigits(int num)
    {
        int oddDigitsSum=0;
        while(num>0)
        {
            int digit=num%10;
            if(digit%2!=0)
            {
                oddDigitsSum+=digit;
            }
            num=num/10;
        }
        return oddDigitsSum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        System.out.println("sum of all odd digits in a number : "+sumOfOddDigits(num));

    }
    
}
