package com.company;

import java.util.Scanner;

public class abs
{
    public static void main(String[] args)
    {
        System.out.print("Enter a number to find the absolute value:");
        Scanner sc= new Scanner(System.in);
        long num= sc.nextInt();
        if (num<0) System.out.println(num*(-1) + " is the absolute value of "+ num);
        else System.out.println(num+" is the absolute value of "+num);
    }
}
