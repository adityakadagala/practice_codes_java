package com.company;
import java.util.Scanner;

public class stringDes
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first name:"); 
        String name= sc.nextLine();
        System.out.println("Enter the second name:");       
        String name2= sc.nextLine();
        System.out.println("Enter the third name:");
        String name3= sc.nextLine();
        
        if(name.compareTo(name2)>0&&name.compareTo(name3)>0)
        {
            System.out.println(name);
            if(name2.compareTo(name3)>0)
            {
                System.out.println(name2);
                System.out.println(name3);
            }
            else
            {
                System.out.println(name3);
                System.out.println(name2);
            }
            
        }
        else if(name2.compareTo(name)>0&&name2.compareTo(name3)>0)
        {
            System.out.println(name2);
            if(name.compareTo(name3)>0)
            {
                System.out.println(name);
                System.out.println(name3);
            }
            else
            {
                System.out.println(name3);
                System.out.println(name);
            }
            
        }

        else
        {
            System.out.println(name3);
            if(name2.compareTo(name)>0)
            {
                System.out.println(name2);
                System.out.println(name);
            }
            else
            {
                System.out.println(name);
                System.out.println(name2);
            }
            
        }
        

        
    }

    
}
