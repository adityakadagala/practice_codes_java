package fileHandling;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args)
    {
        try
        {
            File obj= new File("/home/ubuntu/Documents/Dummy.txt");
            Scanner sc=new Scanner(obj);

            while(sc.hasNextLine())
            {
                String data= sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        } catch(FileNotFoundException e)
        {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
