package Arrays;
import java.util.*;
public class SecondLarge 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements you want in array:");
        int n=sc.nextInt();

        int[] arr=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array is:");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        int max=arr[0];
        int secondmax=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                secondmax=max;
                max=arr[i];
            }
            else if(arr[i]>secondmax)
            {
                secondmax=arr[i];
            }
        }
        System.out.println("Max is:"+max);
        System.out.println("Second max is:"+secondmax);
    }    
}
