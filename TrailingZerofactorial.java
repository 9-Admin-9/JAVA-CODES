/*
given a number find the number of trailing zeros of its factorial
 */
import java.util.*;
public class TrailingZerofactorial {
    public static int trailingzeros(int num)
    {
        int res = 0;
        int power5=5;
        while(num>=power5)
        {
            res = res+(num/power5);
            power5=power5*5;
        }
        return res;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        System.out.println("trailing zeros: "+trailingzeros(num));
    }
    
}
