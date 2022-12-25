package com.company;
import java.util.Scanner;
public class ops 
{

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1= sc.nextInt();
        System.out.println("Enter second number:");
        int num2=sc.nextInt();

        System.out.println("Arithmetic Operations");
        System.out.println("Addition operation (a+b):"+(num1+num2));
        System.out.println("Subtraction operation (a-b):"+ (num1-num2));
        System.out.println("Multiplicaton operation (a*b):"+(num1*num2));
        System.out.println("Division operation (b/a):"+(num2/num1));
        System.out.println("Modulus operation (b%a):"+(num2%num1));
        
        System.out.println("Assignment Operations");
        int var;
        System.out.println("var using =:"+(var =num1));
        System.out.println("var using +=:"+(var += num1));
        System.out.println("var using *=:" +(var *= num1));
        System.out.println("var using /=:" + (var /= num1));

    }
}
