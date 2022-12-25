package data.structures;
import java.util.*;

public class Ds_op 
{

    public static void main(String[] args) 
    {
	// write your code here
        
        //int arr1[]= {1,5,6,2,4,7};
        Scanner sc = new Scanner(System.in); 
        
            System.out.print("Enter the array size:");
            int size= sc.nextInt(); 
            int arr[]=new int[size];
            System.out.print("Enter the array of numbers:");
            for (int q=0;q<size;q++)
            {
                
                 arr[q]= sc.nextInt();
            }
        
        int n= arr.length;
        for (int i=0; i<n-1;i++)
        {
            for (int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int t=arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
int arr2[]=arr;
//System.out.println(arr1);
 for ( int i=0; i<n;++i)
 {
    arr2[i]=arr[i];
    System.out.print(arr2[i]+" ");
     

 }
 System.out.println();
 System.out.print("Enter the element to be searched in the array:");
 int key;
 key= sc.nextInt();
 for (int i=0; i<n;i++)
 {
     if( arr[i]==key){
         System.out.println("Element found at "+ (i+1) + " position in the array ");
     }
 }
 sc.close();
    }
}
