package Arrays;
import java.util.Scanner;

public class FindMinMax
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
        int min=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("Maximum number is:"+max);
        System.out.println("Minimum number is:"+min);
    }
}
