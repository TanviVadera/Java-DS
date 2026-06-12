//linear search
import java.util.*;
class linear_search
{
    public static void main(String[] args)
    {
        int isfound=1;
        int[] arr=new int[50];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements:");
        int n=sc.nextInt();
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();   
        }
         System.out.println("Elements are:");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+"");  
        }
        System.out.println("Enter key:");
        int key=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==key)
            {
                System.out.println("key found at:"+(i+1));
                isfound=0;
                break;
            }
        }
        if(isfound==1)
        {
            System.out.println("key not found!");
        }
    }
}
