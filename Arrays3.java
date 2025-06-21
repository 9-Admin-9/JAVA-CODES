/* 
 given two sorted arrays of integer values, write a program
 to print the elements which are repeated in both arrys.
 input:
 5
 3 5 6 8 9
 7
 2 3 4 6 7 8 8
 output:
3 6 8
 
import java.util.Scanner;

public class Arrays3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        for(int i =0;i<n1;i++){
            a[i]=sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] b = new int[n2];
        for(int i =0;i<n2;i++){
            b[i]=sc.nextInt();
        }
        int i = 0;
        int j = 0;
        while(i<a.length&&j<b.length){
            if(a[i]==b[j]){
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
            else if(a[i]>b[j])
            {
                j++;
            }
            else{
                i++;
            }
        }   
    }
}

given two sorted arrays of integer values, write a program to
merge these two arrays such that the resultant array is sorted.
*/

import java.util.Scanner;

public class Arrays3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        for(int )
        int n2 = sc.nextInt();
        int[] b = new int[n2];
        int[] res = new int[n1+n2];
        int i = 0;
        int j = 0;
        int k =0;
        while(k<res.length)
        {
            if(b[j]<a[i]){
                res[k]=b[j];
                k++;
                j++;
            }
            else if(a[i]==b[j])
            {
                res[k]=a[i];
                k++;
                res[k]=b[j];
                k++;
            }
            else{
                res[k]=a[i];
                k++;
            }
        }
    }
}