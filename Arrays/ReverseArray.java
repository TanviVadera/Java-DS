package Arrays;
import java.util.Scanner;

public class ReverseArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements you want in array:");
        int n=sc.nextInt();

        int[] arr=new int[n];

        System.out.println("Enter elements:");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array is:");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        
        int i=0;
        int j=n-1;
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println("Reverse is:");
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
