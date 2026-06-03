//linear search of element in an array using java
import java.util.*;
public class Main
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
int flag=0;
int a[]={1,2,3,4,5,6};
int key=sc.nextInt();
for(int i=0;i<a.length;i++)
{
if(a[i]==key)
{
System.out.println("Element Found");
System.out.println("The position of the given element is: "+i);
flag=1;
}
}
if(flag==0)
{
System.out.println("Element not found");
}
}
}

output:.
6
Element Found
The position of the given element is: 5

