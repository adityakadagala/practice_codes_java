package fileHandling;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class WriteFile {
    public static void main(String[] args)
    {
        try
        {
            File f= new File("/home/ubuntu/Documents/Dummy.txt");
            FileWriter wt= new FileWriter("/home/ubuntu/Documents/Dummy.txt");
            wt.write("Welcome to the coding session of file operations.");
            wt.close();
            System.out.println("Successfully written to the file " +f.getName());
            Scanner sc=new Scanner(f);
            System.out.println("Contents of File:");
            while(sc.hasNextLine())
            {
                String data= sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        } catch(IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
