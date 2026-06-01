import java.util.*;
public class houses
{
    public static void main(String args[])
    {
      int n=4;
      int a[]={2,1,3,1};
      int i=1;
      int j=0;;
     while(i<n)
     {
          j=i;
          i=i+a[i];
         
     }
     System.out.println(j);
      
    }
}