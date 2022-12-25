package fileHandling;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File obj= new File("/home/ubuntu/Downloads/readme.odt");
        if(obj.delete())
        {
            System.out.println(("Deleted the file: "+obj.getName()));
        }
        else
        {
            System.out.println("Failed to delete the file");
        }
    }
}
