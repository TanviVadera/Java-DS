//Left rotate by one
package Arrays;
import java.util.Scanner;

public class LeftRotateArray
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
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
        System.out.println("Left rotating array by one:");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
