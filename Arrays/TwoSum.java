package Arrays;

public class TwoSum
{
    public int[] twoSum(int[] arr1, int target)
    {
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=i+1;j<arr1.length;j++)
            {
                if(arr1[i]+arr1[j]==target)
                {
                    return new int[]{arr1[i],arr1[j]};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) 
    {
        int[] arr1={1,2,3,4,5};
        int target=9;  
        TwoSum obj=new TwoSum();
        int ans[]=obj.twoSum(arr1,target);
        for(int i=0;i<ans.length;i++)
        {
            System.out.println(ans[i]);
        }
    }
}
