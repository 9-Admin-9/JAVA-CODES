// Sum of n natural numbers
import java.util.*;
public class SumOfNNaturalNumbers {
    public static int sumOfNNaturalNumbers(int n)
    {
        return (n*(n+1))/2;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        System.out.println("sum of n natural numbers: "+sumOfNNaturalNumbers(num));
    }
}
