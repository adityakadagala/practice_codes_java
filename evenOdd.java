package com.company;

import java.util.Scanner;

public class evenOdd
{
    public static void main(String[] args)
    {
        System.out.print("Enter a number to check whether it is even or odd:");
        Scanner sc= new Scanner(System.in);
        long num= sc.nextInt();
        if (num%2==0) System.out.println(num+" is an even number");
        else System.out.println(num+ " is an odd number");
        sc.close();
    }
}