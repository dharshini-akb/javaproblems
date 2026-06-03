public class Deletionprogram {
    //DELETION OF AN ELEMENT IN AN ARRAY USING JAVA PROGRAM

public static void main(String args[])
{
int n=5;
int val=2;
int pos=1;
int a[]=new int[5];
for(int i=0;i<n;i++)
{
a[i]=i+1;
System.out.println(a[i])
} 
pos=pos-1;
for(int i=pos;i<n-1;i++)
{
a[i]=a[i+1];
}
a[pos]=val;
n=n-1;
for(int i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}

