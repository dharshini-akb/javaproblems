public class Groupingminimumwithk {
    public static void main(String args[])
    {
        int sum=0;
        int k=2;
        int arr[]={3,10,5,8,50,7,12,16};
        int i=0;
       
        while(i<arr.length)
        {
             int min=arr[i];
            if(i+k<=arr.length)
            {
                for(int j=i;j<i+k;j++)
                {
                    if(arr[j]<min)
                    {
                        min=arr[j];
                    }
                }
                
                sum=sum+min;
                i+=k;
            }
            else
            {
                while(i<arr.length)
                {
                sum=sum+arr[i];
                i++;
                }
            }
        }
        System.out.println(sum);
    }
}