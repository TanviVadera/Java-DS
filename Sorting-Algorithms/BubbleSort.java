//bubble sort
import java.util.*;
class BubbleSort
{
    public static void main(String[] args)
    {
        int isswap=1;
        int[] arr=new int[50];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements:");
        int n=sc.nextInt();
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();   
        }
        System.out.println("Unsorted array is:");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+"");  
        }
        //bubble sort logic
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isswap=0;
                }
            }
        }
        if(isswap==1)
        {
            System.out.println("array is already sorted!");
            return;
        }
        System.out.println("Sorted array is:");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+"");  
        }
    }
}
