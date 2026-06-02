import java.util.*;
public class Main {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        String s=sc.next();
        int count=0;
           for(int j=0;j<s.length()-1;j++)
           {
               if(s.charAt(j)==s.charAt(j+1))
               {
                   count=count+1;
               }
           }
        System.out.println(count);
    }
}