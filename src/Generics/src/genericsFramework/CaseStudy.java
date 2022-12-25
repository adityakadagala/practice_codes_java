package genericsFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CaseStudy {
    public static void main(String[] args) {
        ArrayList<String> arr= new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 text values:");
        for (int i=0; i<10;i++)
        {
          arr.add(sc.nextLine());
        }
        System.out.println("Size of the arraylist:"+arr.size());
        Iterator<String> itr=arr.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
