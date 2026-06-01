import java.util.*;
public class Luckynumber
{
    public static void main(String args[])
    {
       Scanner sc =new Scanner(System.in);
       int n=sc.nextInt();
       if(n<1000 || n>9999)
       {
           System.out.println("not a valid car number");
           return;
       }
       int sum=0;
       while(n!=0)
       {
           int digit=n%10;
           sum=sum+digit;
           n=n/10;
       }
       if(sum%3==0||sum%5==0||sum%7==0)
       {
           System.out.println("Lucky number");
       }
       else {
            System.out.println("UnLucky number");
       }
       
    }
}