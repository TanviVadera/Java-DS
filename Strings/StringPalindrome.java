import java.util.Scanner;
class StringPalindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the string:");
        String str=sc.next();
        int left=0;
        int right=str.length()-1;

        boolean ispalindrome=true;

        while(left<right)
        {
           if(str.charAt(left)!=str.charAt(right))
           {
               ispalindrome=false;
               break;
           }
           left++;
           right--;
        }
        if(ispalindrome)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not palindrome");
        }
    }

}
