import java.util.Scanner;

public class PrimeNumber {
    public static boolean primeNumber(int n)
    {
        if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for(int i =2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers");
        int n = sc.nextInt();
        System.out.println("given number is " +(primeNumber(n)?"prime number":"not a prime number"));
    }
}
