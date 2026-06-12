//selection sort
import java.util.*;
class SelectionSort
{
    public static void main(String[] args)
    {
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
        //selection sort logic
        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            if(min!=i)
            {
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
        System.out.println("Sorted array is:");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+"");  
        }
    }
}
