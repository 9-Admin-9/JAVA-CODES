/*
print prime number with in the given range
 */
import java.util.*;
public class PrimeNumbersWithInGivenRange {
    public static void sievePrimeNumbers(int n)
        {
            boolean[] prime=new boolean[n+1];
            for(int i = 2;i*i<=n;i++){
                if(prime[i]==false)
                {
                    for(int j = i*i;j<=n;j=j+i)
                    {
                        prime[j]=true;
                    }
                }
            }
            for(int i = 2;i<=n;i++)
            {
                if(prime[i]==false){
                    System.err.println(i);
                }
            }
        }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        sievePrimeNumbers(n);

    }
}
