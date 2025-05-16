
// Java Program to Convert Celsius into Fahrenheit

import java.util.Scanner;

public class program1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to convert Celsius into Fahrenheit");
        int c = sc.nextInt();
        float f = (c * (9.0f/5))+32;
        System.out.println("res is : "+f);
    }
}