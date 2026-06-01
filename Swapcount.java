import java.util.*;
public class Swapcount
{
    public static void main(String args[])
    {
     int arr[]={70,23,13,26,72,19};
     int count=0;
     for(int i=0;i<arr.length-1;i++)
     {
         
         if((arr[i]%2==0 && arr[i+1]%2!=0||arr[i]%2!=0 && arr[i+1]%2==0 ))
         {
             count=count+1;
         }
     
     }
         System.out.println(count);
    }
}