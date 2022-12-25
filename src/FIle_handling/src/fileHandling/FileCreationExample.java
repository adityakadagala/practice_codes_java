package fileHandling;

import java.io.File;
import java.io.IOException;

public class FileCreationExample {

    public static void main(String[] args) {
	// write your code here
        try {
            File obj=new File("/home/ubuntu/Downloads/readme.java");
            if(obj.createNewFile())
            {
                System.out.println("File created: "+obj.getName());
                System.out.println("Absolute path: " +obj.getAbsolutePath());
            }
            else
            {
                System.out.println("File already exists");
            }
        } catch(IOException e)
        {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
