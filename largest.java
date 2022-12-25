package com.company;

import java.util.Scanner;

public class largest {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the three numbers individually:");
        int i = 0;
        int arr[] = new int[3];
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("The largest of the three given numbers is:");
        i = 0;
        if (arr[i] > arr[i + 1]) {
            if (arr[i] > arr[i + 2]) {
                System.out.println(arr[i] + " is the largest");
            } else {
                System.out.println(arr[i + 2] + " is the largest");
            }
        } else {
            if (arr[i + 1] > arr[i + 2])
                System.out.println(arr[i + 1] + " is the largest");
            else {
                System.out.println(arr[i + 2] + " is the largest");
            }
        }
       // sc.close();
    }

}
