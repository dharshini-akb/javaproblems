import java.util.*;
public class Swapcount
{
    public static void main(String args[])
    {
        int count=0;
     int n=5;
     int rotated[]=new int[n];
     int a[]={1,2,1,2,3};
     for(int i=0;i<n;i++)
     {
         
         rotated[(i+1)%n]=a[i];
     }
     for(int i=0;i<n;i++)
     {
         if(rotated[i]==a[i])
         {
             count=count+1;
         }
     }
     System.out.println(count);
    }
}