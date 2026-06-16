public class BinarySearchArray 
{
    public static void main(String[] args)
    {
        int[] arr1={1,2,3,4,5};
        int target=4;    
        int left=0;
        int right=arr1.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr1[mid]==target)
            {
                System.out.println("Found at:"+(mid+1));
                break;
            }
            else if(arr1[mid]<target)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }  
    }
}
