/*

1)
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

import java.util.*;
public class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n value");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    
}

2)
1 1 1 1 1
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
5 5 5 5 5

import java.util.*;
public class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n value");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
    
}


3) 
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5

import java.util.*;
public class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n value");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
    
}

4) 

* * * * *
*       *
*       *
*       *
* * * * *

import java.util.*;
public class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n value");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(i==1||j==1||i==n||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}

5)
1 1 1 1 1
2       2
3       3
4       4 
5 5 5 5 5


import java.util.*;
public class patterns
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

6)

1 2 3 4 5
1       5
1       5
1       5
1 2 3 4 5

import java.util.Scanner;

public class patterns{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("enter number");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print(j+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}


7)
01  02  03  04  05
06  07  08  09  10
11  12  13  14  15
16  17  18  19  20
21  22  23  24  25

import java.util.Scanner;

public class patterns{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int k = 1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(k<10){
                    System.out.print("0");
                }
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}

8)

01 02 03 04 05
02 04 06 08 10
03 06 09 12 15
04 08 12 16 20
05 10 15 20 25

import java.util.Scanner;

public class patterns {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        for(int i =1 ;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i*j<10){
                    System.out.print("0");
                }
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
     }
}

9)

1 2 3 4 5
2 3 4 5 6
3 4 5 6 7
4 5 6 7 8
5 6 7 8 9

import java.util.Scanner;

public class patterns{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j =i;j<=n+i;j++){
                if(j<10){
                    System.out.print("0");
                }
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}



10)

*
* *
* * *
* * * *
* * * * *

import java.util.Scanner;

public class patterns{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}



11) 
 
1 
1 2
1 2 3 
1 2 3 4 
1 2 3 4

import java.util.Scanner;

public class patterns{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();

        for(int i = 1 ;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}


12)

1 
2 2
3 3 3
4 4 4 4
5 5 5 5 5 

import java.util.Scanner;

public class patterns{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

13)

01 
02 03
04 05 06
07 08 09 10
11 12 13 14 15


import java.util.Scanner;

public class patterns{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int count = 1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                if(count<10){
                    System.out.print("0");
                }
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}

14)
        *
      * *
    * * *
  * * * *
* * * * *

import java.util.Scanner;

public class patterns{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k = 1;k<=i;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}

15)

        1
      1 2
    1 2 3
  1 2 3 4
1 2 3 4 5


import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print spaces for right alignment
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); // <-- two spaces here
            }

            // Print numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }

            // Move to next line
            System.out.println();
        }

        sc.close(); // Close the scanner (good practice)
    }
}


16)

    *  
   * *
  * * *
 * * * *
* * * * *


import java.util.Scanner;

public class patterns{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k = 1;k<=i;k++){
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
    }
}


17)

    1 
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5


import java.util.Scanner;

public class patterns{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k = 1;k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}


18)

* 
* *
*   *
*     *
* * * * *



import java.util.Scanner;

public class patterns {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                if(i==1||i==n||j==1||i==j){
                System.out.print("*"+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}


19)

    * 
   * *
  *   *
 *     *
* * * * *

import java.util.Scanner;

public class patterns {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int k = 1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                if(i==1||i==n||j==1||i==j){
                System.out.print("*"+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}


20)

*/

import java.util.Scanner;

import org.xml.sax.SAXException;

public class patterns{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int k = 1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                if(i==1||i==n||j==1||i==j){
                    System.out.print(j+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}