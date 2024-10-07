import java.io.*;
import java.util.*;
public class Array 
{  
    public static void main(String[] args) 
    {   
        Scanner sc=new Scanner(System.in);
        //int marks[]={89,98,74,50,78,43,23,90,81,66};
        int size=sc.nextInt();
        int marks[]= new int[size];
        for(int i=0;i<size;i++)
        {
            marks[i]=sc.nextInt();
        }
        for(int j=0;j<size;j++)
    
        {
            System.out.println(marks[j]);
        }
        
    }
}
